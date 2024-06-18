import agenda.models.Contact;
import agenda.models.ContactBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactBook agenda = new ContactBook();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("¡Bienvenido a la Agenda!");
        System.out.println("Por favor, ingrese su nombre:");
        String userName = scanner.nextLine();
        System.out.println("Hola " + userName + ", bienvenido a tu agenda personal.");

        while (!exit) {
            System.out.println("\n" + userName + ", elija una opción:");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Verificar si la agenda está llena");
            System.out.println("6. Ver espacio libre en la agenda");
            System.out.println("0. Salir");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Ingrese el número de teléfono: ");
                    String phone = scanner.nextLine().trim();
                    Contact contacto = new Contact(name, phone);
                    agenda.addContact(contacto);
                    break;
                case 2:
                    agenda.listContact();
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String nameValide = scanner.nextLine().trim();
                    agenda.findContact(nameValide);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del contacto: ");
                    String deleteName = scanner.nextLine().trim();
                    agenda.removeContact(deleteName);
                    break;
                case 5:
                    if (agenda.agendaFull()) {
                        System.out.println("La agenda está llena.");
                    } else {
                        System.out.println("Aún hay espacio en la agenda.");
                    }
                    break;
                case 6:
                    System.out.println("Espacio libre en la agenda: " + agenda.freeSpace());
                    break;
                case 0:
                    exit = true;
                    System.out.println("Saliendo de la agenda. ¡Adiós " + userName + "!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        scanner.close();
    }
}