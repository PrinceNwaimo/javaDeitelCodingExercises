package Chapter11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class RegexEg {
    public static void main(String[] args) {
        String input = "01/05/1970";
//        System.out.println(input.matches("[0-9]{2}//[0-9]{2}//[0-9]{4}"));
       System.out.println(input.replaceFirst("01","*"));
        String dateStr = "08/03/2023";
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dateStr, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH);
        String newDateStr = date.format(outputFormatter);
        System.out.println(newDateStr);
    }
}
