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

    }
}
