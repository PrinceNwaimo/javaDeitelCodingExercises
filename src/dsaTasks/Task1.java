package dsaTasks;

public class Task1 {

    public static int kuli(String[] kata) {

//        String[] kata = {"AB1396", "Q2RBS", "G381AC"};
        int count = 0;
        for (String i : kata) {
            for (int j = 0; j < i.length(); j++) {
                if (Character.isDigit(i.charAt(j)))
                    count++;
            }

        }
        return count;
    }
//
//    public static void main(String[] args) {
//        System.out.println(kuli());
//    }
}