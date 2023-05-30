package Chapter17.functionalInteface;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentDriver {
    public static void main(String[] args) {
        Student student1 = new Student("Mark",12);
        Student student2 = new Student("Fisher",12);
        Student student3 = new Student("Philip",13);
        Student student4 = new Student("AllWell",12);
        Student student5 = new Student("Figure",15);
        List<Student> names = new ArrayList<>();
        names.add(student1);
        names.add(student2);
        names.add(student3);
        names.add(student4);
        names.add(student5);


        Comparator<Student>studentComparator = Comparator.comparing(Student::getAge).thenComparing(Student::getName);
        names.sort(studentComparator);
        System.out.println(names);
    }


}