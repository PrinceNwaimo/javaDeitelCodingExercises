package Chapter11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String userInput = "Email@gmaial.com";
        System.out.println(userInput.matches("[A-Z]+@[a-z]+\\.[a-z]{2,}"));

        System.out.println(Pattern.matches("[a-z]+@[a-z]+\\.[a-z]{5,}",userInput));
        Pattern pattern = Pattern.compile("[a-z]+@[a-z]+\\.[a-z]{2,}");
        Matcher matcher = pattern.matcher(userInput);
        System.out.println(matcher.matches());

    }
}
