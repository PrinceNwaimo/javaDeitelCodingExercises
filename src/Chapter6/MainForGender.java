package Chapter6;

public class Main1 {
    public static void main(String[] args) {
        Person person = new Person("John Doe",56,Gender.MALE);
        Person person1 = new Person("Jane Doe", 45,Gender.FEMALE);
        Person person2 = new Person("Johnny Doe",21,Gender.MALE);
        Person person3 = new Person("Janet Doe",18,Gender.NON_BINARY);

        int numberOfMales=countMales(person,person1,person2,person3);
        System.out.println(numberOfMales);
    }
    private static int countMales(Person...people){
        int counter = 0;
        for (int i = 0; i < people.length; i++) {
            if(people[i].getGender()==Gender.MALE)counter++;


        }
        return counter;
    }
}
