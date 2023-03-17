package PhoneBookApp;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;
    private  int ID;


    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString() {
        return String.format("""
            =======================
            FirstName: %s
            =======================
            LastName: %s
            =======================
            PhoneNumber:%s
            =======================
            EmailAddress:%s
            ========================
            """,firstName,lastName,phoneNumber,emailAddress);
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
