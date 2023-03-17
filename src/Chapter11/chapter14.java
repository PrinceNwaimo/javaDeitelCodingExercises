package Chapter11;

public class chapter14 {
    public static void main(String[] args) {
        String zen = "Joshrichhy";
        char[] newZen = new char[4];
        zen.getChars(0,2,newZen,0);
        System.out.println(zen);
        System.out.println(zen.charAt(0));
    }
}
