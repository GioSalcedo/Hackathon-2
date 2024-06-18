package agenda.models;

public class Contact {
    private String name;
    private String phone;

    public Contact() {
    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Metodo para agregar contacto
    public boolean equals (agenda.Contact c){
        if(this.name.equalsIgnoreCase(c.getName())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
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
