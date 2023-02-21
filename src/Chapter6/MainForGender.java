package Chapter6;

public class MainForGender {
    public static void main(String[] args) {
        PersonForGender person = new PersonForGender("John Doe",56,Gender.MALE);
        PersonForGender person1 = new PersonForGender("Jane Doe", 45,Gender.FEMALE);
        PersonForGender person2 = new PersonForGender("Johnny Doe",21,Gender.MALE);
        PersonForGender person3 = new PersonForGender("Janet Doe",18,Gender.NON_BINARY);

        int numberOfMales=countMales(person,person1,person2,person3);
        System.out.println(numberOfMales);
    }
    private static int countMales(PersonForGender...people){
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getGender()==Gender.MALE)counter++;



        }
        return counter;
    }
}
