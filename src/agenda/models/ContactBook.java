package agenda.models;

import java.util.ArrayList;


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
        }

        if (equals(contact.getName())) {
            System.out.println("El contacto ya existe en la agenda.");
            return;
        }

        contacts.add(contact);
        System.out.println("Contacto agregado con éxito.");
    }

    // Método para verificar si el contacto existe
    public boolean equals(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    // Método para verificar si la agenda esta llena
    public boolean agendaFull() {
        return contacts.size() >= MAX_CONTACTS;
    }

    // Método de listar contactos
    public void listContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    //Método de buscar contactos
    public Contact findContact(String name) {
        Contact existe = null;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("El telefono de " + contact.getName() + " es: " + contact.getPhone());
                return contact;
            }
        }
        if (existe == null) {
            System.out.println("El contacto: " + name + " no existe.");
        }
        return null;
    }

    // Método para eliminar contactos
    public void removeContact(String name) {
        Contact contact = findContact(name);
        if (contact != null) {
            contacts.remove(contact);
            System.out.println("Contacto eliminado.");
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    // Método para espacios libres
    public int freeSpace() {
        return MAX_CONTACTS - contacts.size();
    }
}