package Chapter5;

public class TraingleExercises {
    public static void main(String[] args) {

        for (int space = 1; space < 11; space++) {
            System.out.println(" ".repeat(10));
            for (int asterisk = 0; asterisk < space; asterisk++) {
                System.out.print("*");

            }
        }
        System.out.println("                                ");
        System.out.println("       ");



       int blank=1;
       for  (int triangleRow = 10; triangleRow >0 ; triangleRow--) {
           for (int space =0; space < blank; space++) {
               System.out.print(' ');
           }
           for (int asterisk = triangleRow; asterisk>0; asterisk --) {
               System.out.print("*");

           }

           System.out.println();
           blank++;
       }

         blank=9;
        for  (int triangleRow = 10; triangleRow >0 ; triangleRow--) {
            for (int space =0; space < blank; space++) {
                System.out.print(' ');
            }
            for (int asterisk =10; asterisk>triangleRow; asterisk --) {
                System.out.print("*");

            }

            System.out.println();
            blank--;
        }
    }

        }







            



