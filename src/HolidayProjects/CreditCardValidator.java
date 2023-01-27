package HolidayProjects;

public class CreditCardValidator {


    public static boolean isValid(long cardNumber){
        return(theSize(cardNumber)>=13 && theSize(cardNumber)>=16 && theSize(cardNumber)<=19)&&(prefixMatch(cardNumber,4)|| prefixMatch(cardNumber,5)
                || prefixMatch(cardNumber,37)||prefixMatch(cardNumber,6)||prefixMatch(cardNumber,5061)) && ((sumDoubleEven(cardNumber) + sumOdd(cardNumber))%10 == 0);
    }
    public static int sumDoubleEven(long cardNumber){
        int sum = 0;
        String number = cardNumber + "";
        for (int i = theSize(cardNumber)-2; i >= 0 ; i-= 2) {
            sum += getDigit(Integer.parseInt(number.charAt(i) + "")*2);
        }
        return sum;
    }
    public static int sumOdd(long cardNumber){
        int sum = 0;
        String number = cardNumber + "";
        for (int i = theSize(cardNumber)-1; i >=0 ; i-=2) {
            sum += Integer.parseInt(number.charAt(i) + "");

        }
        return sum;
    }
    public static int getDigit(int cardNumber){
        if(cardNumber < 9)
            return cardNumber;
        return cardNumber/10 + cardNumber % 10;
    }
    public static int theSize(long digit){
        String number = digit + "";
        return number.length();
    }
    public static boolean prefixMatch(long cardNumber, int digit){
        return getPrefix(cardNumber,theSize(digit)) == digit;
    }
    public static long getPrefix(long cardNumber, int lent){
        if(theSize(cardNumber)> lent){
            String number = cardNumber + "";
            return Long.parseLong(number.substring(0,lent));
        }
        return cardNumber;
    }
    public static  String cardType(long cardNumber){
        if (prefixMatch(Long.parseLong(String.valueOf(cardNumber)),4)) {
            return "Visa Card";
        }
        if(prefixMatch(Long.parseLong(String.valueOf(cardNumber)),5061)&& theSize(cardNumber)<=19){
            return "Verve Card";
        }
        if(prefixMatch(Long.parseLong(String.valueOf(cardNumber)),6)){
            return "Discovery card";
        }
        if(prefixMatch(Long.parseLong(String.valueOf(cardNumber)),5)){
            return "Master card";
    }
        else
            return "American Express Card";
    }

    }

