import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Agenda agenda = new Agenda(10);
//        Scanner scanner = new Scanner(System.in);
//        boolean exit = false;
//
//        System.out.println("¡Bienvenido a la Agenda!");
//        System.out.println("Por favor, ingrese su nombre:");
//        String userName = scanner.nextLine();
//        System.out.println("Hola " + userName + ", bienvenido a tu agenda personal.");
//
//        while (!exit) {
//            System.out.println("\n" + userName + ", elija una opción:");
//            System.out.println("1. Añadir contacto");
//            System.out.println("2. Listar contactos");
//            System.out.println("3. Buscar contacto");
//            System.out.println("4. Eliminar contacto");
//            System.out.println("5. Verificar si la agenda está llena");
//            System.out.println("6. Ver espacio libre en la agenda");
//            System.out.println("0. Salir");
//
//            int option = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (option) {
//                case 1:
//                    System.out.println("Ingrese el nombre del contacto:");
//                    String name = scanner.nextLine();
//                    System.out.println("Ingrese el número de teléfono:");
//                    String phoneNumber = scanner.nextLine();
//                    System.out.println("Ingrese el correo electrónico:");
//                    String email = scanner.nextLine();
//                    Contact contact = new Contact(name, phoneNumber, email);
//                    agenda.addContact(contact);
//                    break;
//                case 2:
//                    agenda.listContacts();
//                    break;
//                case 3:
//                    System.out.println("Ingrese el nombre del contacto a buscar:");
//                    String searchName = scanner.nextLine();
//                    Contact foundContact = agenda.findContact(searchName);
//                    if (foundContact != null) {
//                        System.out.println("Contacto encontrado: " + foundContact);
//                    } else {
//                        System.out.println("Contacto no encontrado.");
//                    }
//                    break;
//                case 4:
//                    System.out.println("Ingrese el nombre del contacto a eliminar:");
//                    String deleteName = scanner.nextLine();
//                    agenda.removeContact(deleteName);
//                    break;
//                case 5:
//                    if (agenda.agendaFull()) {
//                        System.out.println("La agenda está llena.");
//                    } else {
//                        System.out.println("Aún hay espacio en la agenda.");
//                    }
//                    break;
//                case 6:
//                    System.out.println("Espacio libre en la agenda: " + agenda.freeSpace());
//                    break;
//                case 0:
//                    exit = true;
//                    System.out.println("Saliendo de la agenda. ¡Adiós " + userName + "!");
//                    break;
//                default:
//                    System.out.println("Opción no válida. Intente de nuevo.");
//            }
//        }
//        scanner.close();
    }
}
