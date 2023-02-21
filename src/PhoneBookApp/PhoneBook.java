package PhoneBookApp;

import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook {

    ArrayList<Contact> contacts = new ArrayList<>();


    public void createContact(String firstName, String lastName, String phoneNumber) {
        Contact userContact = new Contact(firstName, lastName, phoneNumber);
        contacts.add(userContact);
    }

    public int getNumberOfContacts() {
        return contacts.size();
    }

    public Contact viewContact(int ID) {
        return contacts.get(ID - 1);
    }

    public Contact findContact(int ID) {
        return contacts.get(contacts.size() - 1);
    }

    public void updateContact(int ID, String firstName, String lastName, String phoneNumber, String emailAddress) {
        Contact contact = findContact(ID);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailAddress(emailAddress);
    }

    public void addContact(String firstName, String lastName, String phoneNumber, int ID) {
        contacts.add(new Contact(firstName, lastName, phoneNumber));
    }

    public Contact deleteContact(int ID) {
        Contact contact = findContact(ID);
        contacts.remove(contact);
        return null;
    }


    public void countContact(){
        contacts.stream().count();
    }

}
