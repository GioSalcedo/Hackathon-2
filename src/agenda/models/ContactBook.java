package agenda.models;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


    public class ContactBook {
        private Set<agenda.Contact> contacts;
        private final int MAX_CONTACTS = 10;

        public ContactBook() {
            contacts = new HashSet<>();
        }

        // Método para agregar contacto
        public void addContact() {
            if (contacts.size() < MAX_CONTACTS) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el nombre del contacto: ");
                String name = scanner.nextLine().trim();

                System.out.print("Ingrese el número de teléfono: ");
                int phone = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea después de nextInt()

                agenda.Contact newContact = new agenda.Contact(name, phone);

                if (contacts.contains(newContact)) {
                    System.out.println("El contacto ya existe en la agenda.");
                } else {
                    contacts.add(newContact);
                    System.out.println("Contacto agregado con éxito.");
                }
            }
        }

        // Método para verificar si el contacto existe
        public boolean hasContact(Contact contact) {
            return contacts.contains(contact);
        }


    // Método de listar contactos
//    public void listContact() {
//        for (Contact contact : contacts){
//            System.out.println(contact);
//        }
//    }
    // Método de buscar contactos
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
}
