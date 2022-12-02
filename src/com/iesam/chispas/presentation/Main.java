package com.iesam.chispas.presentation;
import com.iesam.chispas.data.*;
import com.iesam.chispas.domain.models.*;
import com.iesam.chispas.domain.usecase.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main (String[] args) throws ParseException{

        Scanner scanner = new Scanner(System.in);

        //Autonomo
        SelfEmployed autonomo = new SelfEmployed();
        System.out.println("Introduce el CODIGO del cliente (autonomo):");
        autonomo.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE del autonomo");
        autonomo.setName(scanner.nextLine());
        System.out.println("Introduce los APELLIDOS del autonomo");
        autonomo.setSurname(scanner.nextLine());
        System.out.println("Introduce el DNI del autonomo");
        autonomo.setDni(scanner.nextLine());
        System.out.println("Introduce la DIRECCION POSTAL del autonomo");
        autonomo.setPostalAddress(scanner.nextLine());
        System.out.println("Introduce la CIUDAD del autonomo");
        autonomo.setCity(scanner.nextLine());
        System.out.println("Introduce la PROVINCIA del autonomo");
        autonomo.setProvince(scanner.nextLine());
        System.out.println("Introduce el EMAIL del autonomo");
        autonomo.setEmail(scanner.nextLine());
        System.out.println("Introduce el TELEFONO del autonomo");
        autonomo.setPhoneNumber(scanner.nextLine());
        //printCliente(autonomo);

        //Sociedad
        Company sociedad = new Company();
        System.out.println("Introduce el CODIGO del cliente (sociedad)");
        sociedad.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE de la sociedad");
        sociedad.setBussinesName(scanner.nextLine());
        System.out.println("Introduce el CIF de la sociedad");
        sociedad.setCif(scanner.nextLine());
        System.out.println("Introduce la DIRECCION POSTAL de la sociedad");
        sociedad.setPostalAddress(scanner.nextLine());
        System.out.println("Introduce la POBLACION de la sociedad");
        sociedad.setCity(scanner.nextLine());
        System.out.println("Introduce la PROVINCIA de la sociedad");
        sociedad.setProvince(scanner.nextLine());
        System.out.println("Introduce el EMAIL de la sociedad");
        sociedad.setEmail(scanner.nextLine());
        System.out.println("Introduce el TELEFONO de la sociedad");
        sociedad.setPhoneNumber(scanner.nextLine());
        //printCliente(sociedad);

        //CASOS DE USO DE CLIENTES:
        CustomerDataStore customerDataStore = new MenCustomerDataStore();
        //caso de uso que me permite añadir un cliente
        AddCustomerUseCase addCustomerUseCase = new AddCustomerUseCase(customerDataStore);
        addCustomerUseCase.execute(autonomo);
        addCustomerUseCase.execute(sociedad);
        //caso de uso para ver todos los clientes almacenados
        ListCustomersUseCase listCustomersUseCase = new ListCustomersUseCase(customerDataStore);
        List<Customer> customers = listCustomersUseCase.execute();
        for (int i = 0 ; i<customers.size() ; i++){
            printCliente(customers.get(i));
        }
        //caso de uso para eliminar un cliente y volver a visualizar los almacenados
        DeleteCustomerUseCase deleteCustomerUseCase = new DeleteCustomerUseCase(customerDataStore);
        System.out.println("----- ELIMINADO AUTOMO -----");
        deleteCustomerUseCase.execute(autonomo);
        List<Customer> customers2 = listCustomersUseCase.execute(); //Mejorable creando una funcion para ello, ya que se está repitiendo
        for (int i = 0 ; i<customers2.size() ; i++) {
            printCliente(customers2.get(i));
        }
        //caso de uso para modificar el cliente sociedad
        System.out.println("----- MODIFICAR NOMBRE SOCIEDAD -----");
        UpdateCustomerUseCase updateCustomerUseCase = new UpdateCustomerUseCase(customerDataStore);
        System.out.println("Introduce el NOMBRE de la sociedad");
        sociedad.setBussinesName(scanner.nextLine());
        updateCustomerUseCase.execute(sociedad);
        List<Customer> customers3 = listCustomersUseCase.execute(); //Mejorable creando una funcion para ello, ya que se está repitiendo
        for (int i = 0 ; i<customers3.size() ; i++) {
            printCliente(customers3.get(i));
        }

        //Crear los tipos de IVA
        VatRate iva0 = new VatRate();
        iva0.setType(0);
        VatRate iva4 = new VatRate();
        iva4.setType(4);
        VatRate iva10 = new VatRate();
        iva10.setType(10);
        VatRate iva21 = new VatRate();
        iva21.setType(21);

        //Guardar los tipos de IVA con los CASOS DE USO DEL IVA creados:
        VatRateDataStore vatRateDataStore = new MenVatRateDataStore();
        //caso de uso que me permite añadir un tipo de iva
        AddVatRateUseCase addVatRateUseCase = new AddVatRateUseCase(vatRateDataStore);
        addVatRateUseCase.execute(iva0);
        addVatRateUseCase.execute(iva4);
        addVatRateUseCase.execute(iva10);
        addVatRateUseCase.execute(iva21);
        //caso de uso para ver todos los tipos de iva almecenados
        ListVatRateUseCase listVatRateUseCase = new ListVatRateUseCase(vatRateDataStore);
        List<VatRate> vatRates = listVatRateUseCase.execute();
        for (int i = 0 ; i<vatRates.size() ; i++){
            System.out.println(vatRates.get(i).getType());
        }
        //caso de uso para eliminar un tipo de iva y volver a visualizar los almacenados
        DeleteVatRateUseCase deleteVatRateUseCase = new DeleteVatRateUseCase(vatRateDataStore);
        System.out.println("----- ELIMINADO TIPO DE IVA 0 -----");
        deleteVatRateUseCase.execute(iva0);
        List<VatRate> vatRates1 = listVatRateUseCase.execute(); //Mejorable creando una funcion para ello, ya que se está repitiendo
        for (int i = 0 ; i<vatRates1.size() ; i++) {
            System.out.println(vatRates1.get(i).getType());
        }
        //caso de uso para modificar el cliente sociedad
        System.out.println("----- MODIFICAR TIPO DE IVA -----");
        UpdateVatRateUseCase updateVatRateUseCase = new UpdateVatRateUseCase(vatRateDataStore);
        System.out.println("Introduce el tipo de IVA");
        iva4.setType(scanner.nextInt());
        String salto = scanner.nextLine(); //Esto es para que se coma el salto de linea que produce el scanner.nextInt
        updateVatRateUseCase.execute(iva4);
        List<VatRate> vatRates2 = listVatRateUseCase.execute(); //Mejorable creando una funcion para ello, ya que se está repitiendo
        for (int i = 0 ; i<vatRates2.size() ; i++) {
            System.out.println(vatRates2.get(i).getType());
        }
        // Caso de uso para coger un tipo de iva por su typo:
            //Esto será utilizado en cada uno de las lineas de venta
        GetVatRateUseCase getVatRateUseCase = new GetVatRateUseCase(vatRateDataStore);

        //Producto1
        Product bombilla = new Product();
        System.out.println("Introduce el CODIGO del producto");
        bombilla.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE del producto");
        bombilla.setName(scanner.nextLine());
        System.out.println("Introduce el MARCA del producto");
        bombilla.setBrand(scanner.nextLine());
        System.out.println("Introduce el MODELO del producto");
        bombilla.setModel(scanner.nextLine());
        System.out.println("Introduce el PRECIO del producto");
        bombilla.setPrice(scanner.nextDouble());
        Integer tipoIVA = 5;
        do {
            System.out.println("Introduce el TIPO DE IVA del producto (0 - 4 - 10 - 21)");
            tipoIVA = scanner.nextInt();
        }while ( tipoIVA!=0 && tipoIVA != 4 && tipoIVA != 10 && tipoIVA != 21 );
        switch (tipoIVA){
            case 0: bombilla.setVatRate(getVatRateUseCase.execute(iva0.getType())); break;
            case 4: bombilla.setVatRate(getVatRateUseCase.execute(iva4.getType())); break;
            case 10: bombilla.setVatRate(getVatRateUseCase.execute(iva10.getType())); break;
            case 21: bombilla.setVatRate(getVatRateUseCase.execute(iva21.getType())); break;
        }
        salto = scanner.nextLine();

        //Producto2
        Product cable = new Product();
        System.out.println("Introduce el CODIGO del producto");
        cable.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE del producto");
        cable.setName(scanner.nextLine());
        System.out.println("Introduce el MARCA del producto");
        cable.setBrand(scanner.nextLine());
        System.out.println("Introduce el MODELO del producto");
        cable.setModel(scanner.nextLine());
        System.out.println("Introduce el PRECIO del producto");
        cable.setPrice(scanner.nextDouble());
        tipoIVA = 5;
        do {
            System.out.println("Introduce el TIPO DE IVA del producto (0 - 4 - 10 - 21)");
            tipoIVA = scanner.nextInt();
        }while ( tipoIVA!=0 && tipoIVA != 4 && tipoIVA != 10 && tipoIVA != 21 );
        switch (tipoIVA){
            case 0: cable.setVatRate(getVatRateUseCase.execute(iva0.getType())); break;
            case 4: cable.setVatRate(getVatRateUseCase.execute(iva4.getType())); break;
            case 10: cable.setVatRate(getVatRateUseCase.execute(iva10.getType())); break;
            case 21: cable.setVatRate(getVatRateUseCase.execute(iva21.getType())); break;
        }
        salto = scanner.nextLine();

        //Servicio1
        Service servicio1 = new Service();
        System.out.println("Introduce el CODIGO del servicio");
        servicio1.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE del servicio");
        servicio1.setName(scanner.nextLine());
        System.out.println("Introduce el PRECIO del servicio");
        servicio1.setPrice(scanner.nextDouble());
        tipoIVA = 5;
        do {
            System.out.println("Introduce el TIPO DE IVA del servicio (0 - 4 - 10 - 21)");
            tipoIVA = scanner.nextInt();
        }while ( tipoIVA!=0 && tipoIVA != 4 && tipoIVA != 10 && tipoIVA != 21 );
        switch (tipoIVA){
            case 0: servicio1.setVatRate(getVatRateUseCase.execute(iva0.getType())); break;
            case 4: servicio1.setVatRate(getVatRateUseCase.execute(iva4.getType())); break;
            case 10: servicio1.setVatRate(getVatRateUseCase.execute(iva10.getType())); break;
            case 21: servicio1.setVatRate(getVatRateUseCase.execute(iva21.getType())); break;
        }
        salto = scanner.nextLine();

        //servicio2
        Service servicio2 = new Service();
        System.out.println("Introduce el CODIGO del servicio");
        servicio2.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE del servicio");
        servicio2.setName(scanner.nextLine());
        System.out.println("Introduce el PRECIO del servicio");
        servicio2.setPrice(scanner.nextDouble());
        tipoIVA = 5;
        do {
            System.out.println("Introduce el TIPO DE IVA del servicio (0 - 4 - 10 - 21)");
            tipoIVA = scanner.nextInt();
        }while ( tipoIVA!=0 && tipoIVA != 4 && tipoIVA != 10 && tipoIVA != 21 );
        switch (tipoIVA){
            case 0: servicio2.setVatRate(getVatRateUseCase.execute(iva0.getType())); break;
            case 4: servicio2.setVatRate(getVatRateUseCase.execute(iva4.getType())); break;
            case 10: servicio2.setVatRate(getVatRateUseCase.execute(iva10.getType())); break;
            case 21: servicio2.setVatRate(getVatRateUseCase.execute(iva21.getType())); break;
        }
        salto = scanner.nextLine();

        //Casos de uso para las lineas de venta:
        SalesLineDataStore salesLineDataStore = new MenSalesLineDataStore();
        //Caso de uso para almacenar las lineas de venta creadas:
        AddSalesLineUseCase addSalesLineUseCase = new AddSalesLineUseCase(salesLineDataStore);
        addSalesLineUseCase.execute(bombilla);
        addSalesLineUseCase.execute(cable);
        addSalesLineUseCase.execute(servicio1);
        addSalesLineUseCase.execute(servicio2);
        //Ver todas las lineas de venta creadas
        ListSalesLinesUseCase listSalesLinesUseCase = new ListSalesLinesUseCase(salesLineDataStore);
        List<SalesLine> salesLines = listSalesLinesUseCase.execute();
        for (int i = 0 ; i < salesLines.size() ; i++){
            printSalesLine(salesLines.get(i));
        }
        //Caso de uso para eliminar el servicio 2
        DeleteSalesLineUseCase deleteSalesLineUseCase = new DeleteSalesLineUseCase(salesLineDataStore);
        System.out.println(" ---- ELIMINANDO SERVICIO 2 ----");
        deleteSalesLineUseCase.execute(servicio2);
        List<SalesLine> salesLines1 = listSalesLinesUseCase.execute();
        for (int i = 0 ; i < salesLines1.size() ; i++){
            printSalesLine(salesLines1.get(i));
        }
        //Modificar una linea de venta
        UpdateSalesLineUseCase updateSalesLineUseCase = new UpdateSalesLineUseCase(salesLineDataStore);
        System.out.println("--- MODIFICANDO BOMBILLA ---");
        bombilla.setPrice(scanner.nextDouble());
        updateSalesLineUseCase.execute(bombilla);
        List<SalesLine> salesLines2 = listSalesLinesUseCase.execute();
        for (int i = 0 ; i < salesLines2.size() ; i++){
            printSalesLine(salesLines2.get(i));
        }


        //Factura Autonomo
            //Utilizando los casos de uso de factura
        InvoiceDataStore invoiceDataStore = new MenInvoiceDataStore();

        Invoice facturaAutonomo = new Invoice();
        System.out.println("Introduce el codigo de la factura");
        facturaAutonomo.setCode(scanner.nextLine());
        System.out.println("Introduce la fecha de la factura");
        String fechaComoTexto = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        facturaAutonomo.setDate(fecha);

            //Como alternativa a introducir los clientes y lineas de venta: mostrar todas las posibilidades y utiliza el caso de uso Get.
            /* Ejemplo para introducir un cliente:
                List<SalesLine> salesLines3 = listSalesLineUseCase.execute();
                for (int i = 0 ; i < salesLines3.size() ; i++){
                    printSalesLine(salesLines3.get(i));
                }
                System.out.println("Introduce el codigo del cliente que quiere añadir");
                String codCliente = scanner.next();
                GetCustomerUseCase getCustomerUseCase = new GetCustomerUseCase(customerDataStore);

                facturaAutonomo.setSelfEmployed(getCustomerUseCase.execute(codCliente));
             */

        facturaAutonomo.setSelfEmployed(autonomo);
        facturaAutonomo.addProduct(bombilla);
        facturaAutonomo.addService(servicio1);
        facturaAutonomo.setBaseAmount(facturaAutonomo.getBaseAmount());
        CalculateTotalUseCase calculateTotalUseCase = new CalculateTotalUseCase(invoiceDataStore);
        facturaAutonomo.setTotal(calculateTotalUseCase.execute(facturaAutonomo)); //Utiliza el caso de uso de calcular total

        //Caso de uso para guardar la factura
        AddInvoiceUseCase addInvoiceUseCase = new AddInvoiceUseCase(invoiceDataStore);
        addInvoiceUseCase.execute(facturaAutonomo);
        //Caso de uso para listar todas las facturas utilizando la clase InvoicePrinter
        ListInvoicesUseCase listInvoicesUseCase = new ListInvoicesUseCase(invoiceDataStore);
        InvoicePrinter impFacturaAutonomo = new InvoicePrinter();
        List<Invoice> invoices = listInvoicesUseCase.execute();
        for (int i = 0 ; i < invoices.size() ; i++){
            impFacturaAutonomo.print(invoices.get(i));
        }
        //caso de uso para modificar el codigo de una factura
        UpdateInvoiceUseCase updateInvoiceUseCase = new UpdateInvoiceUseCase(invoiceDataStore);
        System.out.println("Introduce el nuevo codigo para la factura");
        facturaAutonomo.setCode(scanner.next());
        updateInvoiceUseCase.execute(facturaAutonomo);
        List<Invoice> invoices1 = listInvoicesUseCase.execute();
        for (int i = 0 ; i < invoices1.size() ; i++){
            impFacturaAutonomo.print(invoices1.get(i));
        }

        /*
        //Imprimir factura
        System.out.println("\nFactura AUTONOMO \n");
        InvoicePrinter impFacturaAutonomo = new InvoicePrinter();
        impFacturaAutonomo.print(facturaAutonomo);
        */

        //Factura Sociedad
        Invoice facturaSociedad = new Invoice();
        System.out.println("Introduce el codigo de la factura");
        facturaSociedad.setCode(scanner.nextLine());
        System.out.println("Introduce la fecha de la factura");
        fechaComoTexto = scanner.nextLine();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        fecha = sdf2.parse(fechaComoTexto);
        facturaSociedad.setDate(fecha);
        facturaSociedad.setSelfEmployed(autonomo);
        facturaSociedad.addProduct(cable);
        facturaSociedad.addService(servicio2);
        facturaSociedad.setBaseAmount(facturaSociedad.getBaseAmount());
        facturaSociedad.setTotal(facturaSociedad.getTotal());

        //Caso de uso para guardar la factura
        addInvoiceUseCase.execute(facturaSociedad);
        //Caso de uso para listar todas las facturas utilizando la clase InvoicePrinter
        List<Invoice> invoices2 = listInvoicesUseCase.execute();
        for (int i = 0 ; i < invoices2.size() ; i++){
            impFacturaAutonomo.print(invoices2.get(i));
        }

        /*
        //Imprimir factura
        System.out.println("\n FACTURA SOCIEDAD\n");
        InvoicePrinter impFacturaSociedad = new InvoicePrinter();
        impFacturaSociedad.print(facturaSociedad);
        */

    }

    public static void printCliente(Customer customer){
        System.out.println("\nCodigo: " + customer.getCode() + " | Nombre: " + customer.getName() + " | DNI/CIF: " + customer.getIdNumber() +
                "\nDirecion postal: " + customer.getPostalAddress() + " | Poblacion: " + customer.getCity() + " | Provincia: " + customer.getProvince() +
                "\nEmail: " + customer.getEmail() + " | Telefono: " + customer.getPhoneNumber() + "\n");
    }

    public static void printSalesLine (SalesLine salesLine){
        System.out.println("\nCodigo: " + salesLine.getCode() + " | Nombre: " + salesLine.getName() +
                "\nPrecio: " + salesLine.getPrice()  + "\n");
    }

}
