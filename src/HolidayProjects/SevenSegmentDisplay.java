package HolidayProjects;

import java.sql.Array;
import java.util.Arrays;

public class SevenSegmentDisplay {
    static String[] display = new String[7];

    public static void main(String[] args) {
        setDisplay("11111011");
        displaySegment();
    }

    private static void setDisplay(String binary) {
        if (String.valueOf(binary.charAt(7)).equals("1")) {
            for (int i = 0; i < display.length; i++) {
                if (String.valueOf(binary.charAt(i)).equals("1")) {
                    if (i == 0 || i == 3 || i == 6) {
                        display[i] = "# # # #";
                    }
                    else {
                        display[i] = "#";
                    }
                } else {
                    display[i] = " ";
                }

            }
        }
                else{
                    Arrays.fill(display,"");
                }

            }



    public static void displaySegment(){
        System.out.printf("""
                %s
                %s     %s
                %s     %s
                %s
                %s     %s
                %s     %s
                %s
                """,display[0],display[5],display[1],display[5],display[1],display[6],display[4],display[2],
                display[4],display[2],display[3]);
    }



        }


