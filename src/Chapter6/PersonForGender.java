package Chapter6;

public class PersonForGender {
    private String name;
    private int age;
    private Gender gender;

    PersonForGender(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }


    public Gender getGender() {
        return gender;
    }
}
