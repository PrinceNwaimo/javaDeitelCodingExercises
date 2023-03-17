package Chapter7;

public class ArrayTask {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {

            sum += numbers[i];
//            System.out.println(sum);
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i <= numbers.length - 2; i++) {
            sum1 += numbers[i];
//            System.out.println(sum1);
        }
        System.out.println(sum1);
        int sum2 = 0;
        for (int i = 0; i <= numbers.length - 3; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);
        int sum3 = 0;
        for (int i = 0; i <= numbers.length - 4; i++) {
            sum3 += numbers[i];
        }
        System.out.println(sum3);
        int sum4= 0;
        for (int i = 0; i <= numbers.length-5 ; i++) {
            sum4+=numbers[i];
        }
        System.out.println(sum4);
        if(sum<sum1);
    }

}