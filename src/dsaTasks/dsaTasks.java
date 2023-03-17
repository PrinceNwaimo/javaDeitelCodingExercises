package dsaTasks;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class dsaTasks {

    public static void main(String[] args) {
        System.out.println("The date is: " + dateConverter("23/04/2023"));
        System.out.println("The new date is "+convertFrom("15/04/2023"));
        System.out.println("The age is " + ageConverter("04/06/1991") + " years old");
        System.out.println("Your birthday is: "+ birthday("08/03/1990"));
    }

    public static String dateConverter(String date) {
        return DateTimeFormatter.ofPattern("EEEE,d MMMM,yyyy").format(LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

//dateConverter is a function that was created to convert date from e.g 17/04/2023 to Monday 17,April 2023.OR

    public static String convertFrom(String date) {
String[] splitDate = date.split("/");
LocalDate newDate = LocalDate.of(Integer.parseInt(splitDate[2]),
        Integer.parseInt(splitDate[1]),Integer.parseInt(splitDate[0]));
return DateTimeFormatter.ofPattern("EEEE,d MMMM,yyyy").format(newDate);
    }

    public static int ageConverter(String date){
        LocalDate year = LocalDate.now();
        return Period.between(LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy")),year).getYears();
    }

    public static String birthday(String date){
        LocalDate birthday = LocalDate.of(1990,03,8);
        if (date == String.valueOf(birthday)) {
            System.out.println("Correct guess");
        }
            else {
                System.out.println("Guess incorrect");
            }
        return DateTimeFormatter.ofPattern("EEEE,d MMMM,yyyy").format(birthday);
        }

    }
