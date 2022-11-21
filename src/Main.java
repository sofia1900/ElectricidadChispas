import java.util.Scanner;

public class Main {
    public static void main (String[] args){

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
        autonomo.setIdNumber(scanner.nextLine());
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

        //Sociedad
        Company sociedad = new Company();
        System.out.println("Introduce el CODIGO del cliente (sociedad)");
        sociedad.setCode(scanner.nextLine());
        System.out.println("Introduce el NOMBRE de la sociedad");
        sociedad.setName(scanner.nextLine());
        System.out.println("Introduce el CIF de la sociedad");
        sociedad.setIdNumber(scanner.nextLine());
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

    }
}
