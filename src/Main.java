import java.util.Scanner;

public class Main {


    private static TelefonoMovil telefonoMovil = new TelefonoMovil();
    private static Scanner scanner = new Scanner(System.in);
    public static void impMenu() {
        System.out.println("._______________________.");
        System.out.println("| 0 - Para salir        |");
        System.out.println("| 1 - Para imprimir     |");
        System.out.println("| 2 - Para añadir       |");
        System.out.println("| 3 - Para modificar    |");
        System.out.println("| 4 - Para eliminar     |");
        System.out.println("| 5 - Para buscar       |");
        System.out.println("| 6 - Para mostrar menú |");
        System.out.println("._______________________.");

    }

    public static void addcontacto() {
        Scanner sc = new Scanner(System.in);
        System.out.println("_________________________________________");
        System.out.println("Inserta el nombre del nuevo contacto:");
        String nombre = sc.nextLine();
        System.out.println("Inserta el número del nuevo contacto:");
        String numero = sc.nextLine();
        boolean resultado = telefonoMovil.addNewContact(new Contacto(nombre, numero));
        if (resultado == true) {
            System.out.println("Se ha añadido correctamente a " + nombre);
        } else {
            System.out.println("Error. No se ha podido añadir a " + nombre);
        }
            System.out.println("_________________________________________");
        }


    public static void updateContacto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________________");
        System.out.println("Inserta el nombre de la persona que quieres editar");
        String nombre = scan.nextLine();

        if(telefonoMovil.queryContact(nombre)!= null)
        System.out.println("Inserta el nombre nuevo");
        String nombreN = scan.nextLine();
        System.out.println("Inserta el número nuevo");
        String numeroN = scan.nextLine();
        System.out.println("_________________________________________");
       telefonoMovil.updateContact(telefonoMovil.queryContact(nombre),Contacto.createContact(nombreN,numeroN));

    }

    public static void queryContacto() {
        TelefonoMovil tlf2 = new TelefonoMovil();
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________________");
        System.out.println("Inserta el nombre de la persona que quieres buscar:");
        String nombre = scan.nextLine();
        System.out.println("Nombre: " + telefonoMovil.queryContact(nombre).getName() + ", Telefono: " + telefonoMovil.queryContact(nombre).getPhoneNumber());
        System.out.println("_________________________________________");

    }


    public static void removeContactos(){
        TelefonoMovil tlf2 = new TelefonoMovil();
        Scanner scan = new Scanner(System.in);
        System.out.println("_________________________________________");
        System.out.println("Inserta el nombre del contacto a eliminar");
        String nombre = scan.nextLine();

        if (telefonoMovil.queryContact(nombre)!=null) {
            telefonoMovil.removeContact(telefonoMovil.queryContact(nombre));
            System.out.println("El contacto se ha eliminado");
        } else {
            System.out.println("Error al eliminar el contacto");
            System.out.println("_________________________________________");
        }
    }


    public static void main(String[] args) {
        boolean continuar = true;
        int opcion = 0;
        impMenu();

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Elige una opción: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 0:
                    break;
                case 1:
                    telefonoMovil.printContacts();
                    break;
                case 2:
                    addcontacto();
                    break;
                case 3:
                    updateContacto();
                    break;
                case 4:
                    removeContactos();
                    break;
                case 5:
                    queryContacto();
                    break;
                case 6:
                    impMenu();
                    break;

            }
        } while (opcion != 0);


    }
}