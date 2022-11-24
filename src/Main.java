
import java.text.SimpleDateFormat;
import java.text.ParseException;
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

        printCliente(autonomo);

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

        printCliente(sociedad);

        //Crear los tipos de IVA:
        VatRate iva0 = new VatRate();
        iva0.setType(0);
        VatRate iva4 = new VatRate();
        iva4.setType(4);
        VatRate iva10 = new VatRate();
        iva10.setType(10);
        VatRate iva21 = new VatRate();
        iva21.setType(21);

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
            case 0: bombilla.setVatRate(iva0);
            case 4: bombilla.setVatRate(iva4);
            case 10: bombilla.setVatRate(iva10);
            case 21: bombilla.setVatRate(iva21);
        }
        String salto = scanner.nextLine(); //Esto es para que se coma el salto de linea que produce el scanner.nextInt

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
            case 0: cable.setVatRate(iva0);
            case 4: cable.setVatRate(iva4);
            case 10: cable.setVatRate(iva10);
            case 21: cable.setVatRate(iva21);
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
            case 0: servicio1.setVatRate(iva0); break;
            case 4: servicio1.setVatRate(iva4); break;
            case 10: servicio1.setVatRate(iva10); break;
            case 21: servicio1.setVatRate(iva21); break;
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
            case 0: servicio2.setVatRate(iva0); break;
            case 4: servicio2.setVatRate(iva4); break;
            case 10: servicio2.setVatRate(iva10); break;
            case 21: servicio2.setVatRate(iva21); break;
        }
        salto = scanner.nextLine();

        //Factura Autonomo
        Invoice facturaAutonomo = new Invoice();
        System.out.println("Introduce el codigo de la factura");
        facturaAutonomo.setCode(scanner.nextLine());
        System.out.println("Introduce la fecha de la factura");
        String fechaComoTexto = scanner.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = sdf.parse(fechaComoTexto);
        facturaAutonomo.setDate(fecha);
        facturaAutonomo.setSelfEmployed(autonomo);
        facturaAutonomo.addProduct(bombilla);
        facturaAutonomo.addService(servicio1);
        facturaAutonomo.setBaseAmount(facturaAutonomo.getBaseAmount());
        facturaAutonomo.setTotal(facturaAutonomo.getTotal());

        //Imprimir factura
        System.out.println("\nFactura AUTONOMO \n");
        InvoicePrinter impFacturaAutonomo = new InvoicePrinter();
        impFacturaAutonomo.print(facturaAutonomo);


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

        //Imprimir factura
        System.out.println("\n FACTURA SOCIEDAD\n");
        InvoicePrinter impFacturaSociedad = new InvoicePrinter();
        impFacturaSociedad.print(facturaSociedad);

    }

    public static void printCliente(Customer customer){
        System.out.println("\nCodigo: " + customer.getCode() + " | Nombre: " + customer.getName() + " | DNI/CIF: " + customer.getIdNumber() +
                "\nDirecion postal: " + customer.getPostalAddress() + " | Poblacion: " + customer.getCity() + " | Provincia: " + customer.getProvince() +
                "\nEmail: " + customer.getEmail() + " | Telefono: " + customer.getPhoneNumber() + "\n");
    }


}
