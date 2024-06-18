package agenda.test;

import agenda.modelo.Contact;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ContactTest {
    @Test
    void createContact() {
        Contact contact = new Contact();
        assertEquals(contact, contact);
    }

    @Test
    void createContactWithParams() {
        Contact contact = new Contact("Natalia", "3003003030");
        assertEquals(contact.getNombre(),"Natalia" );
        assertEquals(contact.getTelefono(),"3003003030");
    }
}




