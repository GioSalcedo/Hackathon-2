package agenda.modelo;

public class Contact {
    private String nombre;
    private String telefono;

    public Contact() {
    }

    public Contact(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

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
//    public boolean agendaFull() {
//        return contacts.size() >= maxSize;
//    }
//
//    public int freeSpace() {
//        return maxSize - contacts.size();
//    }
}
