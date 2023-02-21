package Chapter4;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner christmas = new Scanner(System.in);
        System.out.println("Press any key to start");
        int lyrics = christmas.nextInt();
        for(int i=1;i<=2;i++){
            switch(lyrics){
                case 1:
                    System.out.println("""
                            On the first day of Christmas my true love sent to me
                            A partridge in a pear tree""");


                case 2:
                    int lyrics2 = christmas.nextInt();
                    System.out.println("On the second day of Christmas my true love sent to me\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.\n");
                    int lyrics3 = christmas.nextInt();
                case 3:
                    System.out.println("On the third day of Christmas my true love sent to me\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.\n");
                    int lyrics4 = christmas.nextInt();
                case 4:
                    System.out.println("On the fourth day of Christmas my true love sent to me\n"+
                            "four calling birds,\n"+
                             "Three French hens,\n"+
                            "Two turtle doves,\n"+
                           "And a partridge in a pear tree.\n");
                    int lyrics5 = christmas.nextInt();
                case 5:
                    System.out.println("On the fifth day of Christmas my true love sent to me\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");
                    int lyrics6 = christmas.nextInt();
                case 6:
                    System.out.println("On the sixth day of Christmas my true love sent to me\n"+
                                    "six geese a-laying,\n"+
                                    "five gold rings,\n"+
                                    "four calling birds,\n"+
                                    "three french hens,\n"+
                                    "two turtle doves\n"+
                                    "And a partridge in a pear tree.\n");
                    int lyrics7 = christmas.nextInt();
                case 7:
                    System.out.println("On the seventh day of Christmas my true love sent to me\n"+
                                        "seven swams a-swimming,\n"+
                            "six geese a-laying,\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");
                    int lyrics8 = christmas.nextInt();
                case 8:
                    System.out.println("On the eighth day of christmas my true love sent to me\n"+
                            "eight maids a-milking,\n"+
                            "seven swams a-swimming,\n"+
                            "six geese a-laying,\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");
                    int lyrics9 = christmas.nextInt();
                case 9:
                    System.out.println("On the nineth day Christmas my true love sent to me\n"+
                            "nine ladies dancing,\n"+
                            "eight maids a-milking,\n"+
                            "seven swams a-swimming,\n"+
                            "six geese a-laying,\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");
                    int lyrics10 = christmas.nextInt();
                case 10:
                    System.out.println("On the tenth day of christmas my true love sent to me\n"+
                            "ten lords a-leaping,\n"+
                                    "nine ladies dancing,\n"+
                                    "eight maids a-milking,\n"+
                                    "seven swams a-swimming,\n"+
                                    "six geese a-laying,\n"+
                                    "five gold rings,\n"+
                                    "four calling birds,\n"+
                                    "three french hens,\n"+
                                    "two turtle doves\n"+
                                    "And a partridge in a pear tree.\n");
                    int lyrics11 = christmas.nextInt();
                case 11:
                    System.out.println("On the eleventh day of christmas my true love sent to me\n"+
                            "eleven pipers piping,\n"+
                            "ten loads a-leaping,\n"+
                            "nine ladies dancing,\n"+
                            "eight maids a-milking,\n"+
                            "seven swams a-swimming,\n"+
                            "six geese a-laying,\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");
                    int lyrics12 = christmas.nextInt();
                case 12:
                    System.out.println("On the twelveth day of christmas my true love sent to me\n"+
                            "twelve drummers drumming,\n"+
                            "eleven pipers piping,\n"+
                            "ten loads a-leaping,\n"+
                            "nine ladies dancing,\n"+
                            "eight maids a-milking,\n"+
                            "seven swams a-swimming,\n"+
                            "six geese a-laying,\n"+
                            "five gold rings,\n"+
                            "four calling birds,\n"+
                            "three french hens,\n"+
                            "two turtle doves\n"+
                            "And a partridge in a pear tree.\n");


                    System.out.println("""
                            •	four calling birds
                            •	five gold rings
                            •	six geese a-laying
                            •	seven swans a-swimming
                            •	eight maids a-milking
                            •	nine ladies dancing
                            •	ten lords a-leaping
                            •	eleven pipers piping
                            •	twelve drummers drumming
                                                        
                            """);
                default:
                    System.out.println("You can start from the top to sing again");
                    break;


            }
        }
    }
}
