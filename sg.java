import java.util.ArrayList;

public class Contact {
    private String name;
    private String phoneNumber;
    
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    
    // Getters and setters for name and phoneNumber
    
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        
        // Add a new contact
        Contact newContact = new Contact("John", "1234567890");
        contacts.add(newContact);
        
        // Search for a contact
        for (Contact contact : contacts) {
            if (contact.getName().equals("John")) {
                System.out.println("Contact found: " + contact.getName() + " - " + contact.getPhoneNumber());
            }
        }
        
        // Modify a contact
        for (Contact contact : contacts) {
            if (contact.getName().equals("John")) {
                contact.setPhoneNumber("0987654321");
                System.out.println("Contact modified: " + contact.getName() + " - " + contact.getPhoneNumber());
            }
        }
        
        // Print all contacts
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " - " + contact.getPhoneNumber());
        }
    }
}
