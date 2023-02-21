package DiaryApp;

import javax.swing.*;
import java.util.Scanner;



public class DiaryApp {
    private static Scanner KeyboardInput = new Scanner(System.in);
    private static Diary Digits  = new Diary();

    public static void main(String[] args) {MainMenu();

    }
    private static void MainMenu(){
        String mainMenu = """
            =======================
            Welcome to Digits Diary
            1--> Create Entry
            2--> View Entry
            3--> Edit Entry
            4--> Count Entry
            5--> Delete Entry
                
     """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)){
            case '1'-> createEntry();
            case '2'-> viewEntry();
            case '3'-> editEntry();
            case '4'-> countEntry();
            case '5'-> deleteEntry();
            case '6'->exitApplication();
            default -> MainMenu();
        }
    }
    private static void exitApplication(){
        display("Thank you for using our application");
        System.exit(1);
    }

    private static void createEntry(){
        String title = input("Enter your title");
        String  body = input("Enter your message body");
        int ID = Integer.parseInt(input("Enter your pin"));
        Digits.createEntry(title,body,ID);
        display("Entry created successfully");
        MainMenu();
    }
    private static void viewEntry(){

        try{display(String.valueOf(Digits.entries));}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            viewEntry();
        }
        MainMenu();
    }
    private static void editEntry(){
        String title = input("Enter title");
        String body = input("Enter the body");
        int ID = Integer.parseInt(input("Enter ID"));
        Digits.editEntry(title,body,ID);
        display("Entry edited successfully");
        MainMenu();
    }
    private static void countEntry(){
        Digits.countEntry();
        display("Number of entries: "+ Digits.getNumberOfEntries());
        MainMenu();
    }
    private static void deleteEntry(){
        String title = input("Enter title");
        String body = input("Enter the body");
        int ID = Integer.parseInt(input("Enter your ID"));
        String entry =String.format("Entry deleted successfully",Digits.deleteEntry(title,body,ID));
        try {
            display(entry);}
        catch (IllegalArgumentException ex){
            display(ex.getMessage());
            deleteEntry();
        }
        MainMenu();
    }

    private static String input(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }
    private static void display(String prompt){
        JOptionPane.showMessageDialog(null,prompt);
    }
}
