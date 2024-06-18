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
        if (agendaFull()) {
            System.out.println("La agenda está llena, no se puede añadir más contactos.");
        } else if (equals(contact.getName())) {
            System.out.println("El contacto ya existe.");
        } else {
            contacts.add(contact);
            System.out.println("Contacto añadido.");
        }
    }
    // Verifica la existencia del contacntio
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
