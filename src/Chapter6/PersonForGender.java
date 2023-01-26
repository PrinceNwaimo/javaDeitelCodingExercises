package Chapter6;

public class Person {
    private String name;
    private int age;
    private Gender gender;

    Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender= gender;
    }


    public Gender getGender() {
        return gender;
    }
}
