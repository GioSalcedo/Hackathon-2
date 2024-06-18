package agenda.models;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactBook {
    private static final int MAX_CONTACTS = 10;
    private ArrayList<Contact> contacts;

    public ContactBook() {
        this.contacts = new ArrayList<>(MAX_CONTACTS);
    }

    // Método para agregar contacto
    public void addContact(Contact contact) {
        Scanner scanner = new Scanner(System.in);
        if (agendaFull()) {
            System.out.println("La agenda está llena, no se puede añadir más contactos.");
        }

        System.out.print("Ingrese el nombre del contacto: ");
        String name = scanner.nextLine().trim();
        if (equals(name)) {
            System.out.println("El contacto ya existe en la agenda.");
            return;
        }

        System.out.print("Ingrese el número de teléfono: ");
        String phone = scanner.nextLine().trim();

        Contact newContact = new Contact(name, phone);
        contacts.add(newContact);
        System.out.println("Contacto agregado con éxito.");
    }

    public boolean equals(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Método de verificar si la agenda esta full.
    public boolean agendaFull() {
        return contacts.size() >= MAX_CONTACTS;
    }

    // Método de listar contactos
    public void listContact() {
        if (contacts.isEmpty()) {
            System.out.println("La agenda está vacía.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

}


//// Método para verificar si el contacto existe
//public static boolean hasContact(String name) {
//    for (contact:
//         contacts) {
//        contact.getName
//    }
//}

//    // Método de buscar contactos
//    public void findContact(String name) {
//        Contact existe = null;
//        for (Contact contact : contacts) {
//            if (contact.getName().equalsIgnoreCase(name)) {
//                System.out.println("El telefono de " + contact.getName() + " es: " + contact.getPhone());
//                existe = contact;
//                break;
//            }
//        }
//        if (existe == null) {
//            System.out.println("El contacto: " + name + " no existe.");
//        }
//    }
//
//    public void removeContact(String name) {
//        Contact contact = findContact(name);
//        if (contact != null) {
//            contacts.remove(contact);
//            System.out.println("Contacto eliminado.");
//        } else {
//            System.out.println("Contacto no encontrado.");
//        }
//    }
//

//
//    public int freeSpace() {
//        return maxSize - contacts.size();
//    }
