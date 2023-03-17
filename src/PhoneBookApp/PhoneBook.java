package PhoneBookApp;

import java.util.ArrayList;

public class PhoneBook {

    ArrayList<Contact> contacts = new ArrayList<>();


    public void createContact(String firstName, String lastName, String phoneNumber,String emailAddress) {
        Contact userContact = new Contact(firstName, lastName, phoneNumber,emailAddress);
        contacts.add(userContact);
    }

    public int getNumberOfContacts() {
        return contacts.size();
    }

    public Contact viewContact(int ID) {
        return contacts.get(ID - 1);
    }

    public Contact findContact(String firstName) {
        for (Contact contact : contacts) {
            if (firstName.equalsIgnoreCase(contact.getFirstName())) {
                return contact;
            }
        }
        return null;
    }

    public void updateContact(int ID, String firstName, String lastName, String phoneNumber, String emailAddress) {
        Contact contact = findContact(firstName);
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setPhoneNumber(phoneNumber);
        contact.setEmailAddress(emailAddress);
    }

    public void addContact(String firstName, String lastName, String phoneNumber, int ID,String emailAddress) {
        contacts.add(new Contact(firstName, lastName, phoneNumber, emailAddress));
    }

    public Contact deleteContact(String firstName) {
        Contact contact = findContact(firstName);
        contacts.remove(contact);
        return null;
    }


    public void countContact(){
        contacts.stream().count();
    }

}
