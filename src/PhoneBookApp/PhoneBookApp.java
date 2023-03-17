package PhoneBookApp;




import javax.swing.*;
import java.util.Scanner;

public class PhoneBookApp {
    private static Scanner KeyboardInput = new Scanner(System.in);
    private static PhoneBook Ababa  = new PhoneBook();

    public static void main(String[] args) {
        MainMenu();

    }
    private static void MainMenu(){
        String mainMenu = """
            =======================
            Welcome to ABABA phonebook
            1--> Create contact
            2--> View Contact
            3--> Update Contact
            4--> Count Contacts
            5--> Find Contacts
            6--> Delete Contact
            7--> Exit Application
                
     """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1'-> createContact();
            case '2'-> viewContact();
            case '3'-> updateContact();
            case '4'-> countContact();
            case '5'-> findContact();
            case '6'-> deleteContact();
            case '7'->exitApplication();
            default -> MainMenu();
        }
    }
    private static void exitApplication(){
        display("Thank you for using our application");
        System.exit(1);
    }

    private static void createContact(){
        String firstName = input("Enter your first name");
        String lastName = input("Enter your last name");
        String phoneNumber = (input("Enter your phone number"));
        String emailAddress = input("Enter your EmailAddress");
        Ababa.createContact(firstName,lastName,phoneNumber,emailAddress);
        display("Entry created successfully");
        MainMenu();
    }
    private static void viewContact(){

        try{display(String.valueOf(Ababa.contacts));}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            viewContact();
        }
        MainMenu();
    }
    private static void updateContact(){
        String firstName = input("Enter the first name");
        String lastName = input("Enter the last name");
        String phoneNumber = input("Enter phoneNumber");
        int   ID = Integer.parseInt(input("Enter the ID"));
        String emailAddress = input("Enter Email Address");
        Ababa.updateContact(ID,firstName,lastName,phoneNumber,emailAddress);
        display("Entry edited successfully");
        MainMenu();
    }
    private static void countContact(){
        Ababa.countContact();
        display("Number of contacts: "+ Ababa.getNumberOfContacts());
        MainMenu();
    }
    private static void deleteContact(){
        String firstName =input("Enter first name");
        String contact =String.format("Contact deleted successfully",Ababa.deleteContact(firstName));
        try {
            display(contact);}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            deleteContact();
        }
        MainMenu();
    }
    private static void findContact(){
        String firstname = input("Enter firstname");
        Contact foundContact = Ababa.findContact(firstname);

//        Contact contact = String.format("Contact  found",Ababa.findContact(ID));
//        return
        display(String.valueOf(foundContact));
        MainMenu();
    }


    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
}


