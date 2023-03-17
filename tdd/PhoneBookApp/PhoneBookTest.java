package PhoneBookApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook userPhoneBook;
    private Contact userContact;
    @BeforeEach
    public void setUp(){
        userPhoneBook = new PhoneBook();
        userPhoneBook.createContact("Prince","Nwaimo","07037178521","git");
    }
    @Test
    public void testThatContactIsCreated(){
        userPhoneBook = new PhoneBook();
        userPhoneBook.createContact("Prince","Nwaimo","07037178521","git");
        assertEquals(1,userPhoneBook.getNumberOfContacts());

    }
    @Test
    public void testThatContactCanBeViewed(){
        String expected = """
               =======================
               FirstName: Prince
               =======================
               LastName: Nwaimo
               =======================
               PhoneNumber:07037178521
               =======================
               EmailAddress:nwaimoprince@gmail.com
               ========================
               """;
        assertEquals(expected,userPhoneBook.viewContact(1).toString());

    }
@Test
    public void testThatContactCanBeEdited(){
//        userPhoneBook.createContact("Prince","Nwaimo","07037178521");
        userPhoneBook.updateContact(0,"Prince","nwaimo","07037178521","teheke");
        assertEquals("prince",userPhoneBook.getNumberOfContacts());
}
@Test
    public void testThatContactCanBeAdded(){
        userPhoneBook.addContact("Peter","Nono","453",27,"git");
        assertEquals(2,userPhoneBook.getNumberOfContacts());
}
@Test
    public void testThatContactIsDeleted(){
        userPhoneBook.deleteContact("Prince");
        assertEquals(2,userPhoneBook.getNumberOfContacts());

}
@Test
    public void testThatContactsArecounted(){
        userPhoneBook.countContact();
        assertEquals(1,userPhoneBook.getNumberOfContacts());
}

}