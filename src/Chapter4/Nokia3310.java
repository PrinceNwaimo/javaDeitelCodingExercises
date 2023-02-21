package Chapter4;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Nokia3310 {
    public static void main(String[] args) {
        Scanner nokia = new Scanner(System.in);
        //List of menu function:
        System.out.println("""
                1. Phone book
                2. Messages
                3.Chat
                4. Call register
                5.Tones
                6.Settings
                7.Call divert
                8.Games
                9.Calculator
                10.Reminders
                11.Clock
                12.Profiles
                13.Sim services
                """);
        System.out.print("Press any number: ");
        int input  = nokia.nextInt();
        switch (input) {
            case 1 -> {
                System.out.println("""
                        1.Search
                        2.Service nos
                        3.Add name
                        4.Erase
                        5.Edit
                        6.Assign tone
                        7.Send b'card
                        8.Options(select for more) 
                        9.Speed dials
                        10.Voice tags""");
                int input8 = nokia.nextInt();
                System.out.println("for options: ");
                System.out.println("""
                        1.Type of view
                        2.Memory status""");
            }
            case 2 -> {
                System.out.print("""
                        1. Write messages
                        2.Inbox
                        3.Outbox
                        4.Picture messages
                        5.Templates
                        6.Smileys
                        7.Message settings
                        8.Info service
                        9.Voice mailbox number
                        10.service command editor
                        """);
                int input7 = nokia.nextInt();

                System.out.println("""
                        1.Set
                        2.Common""");
                int input1 = nokia.nextInt();
                System.out.println("""
                        1.Message centre number
                        2.Message sent as 
                        3.Message validity""");
                int input2 = nokia.nextInt();
                System.out.println("""
                        1.Delivery reports
                        2.Reply via same centre
                        3.Character support""");
            }
            case 3 -> System.out.println("Chat");
            case 4 -> {
                System.out.println("""
                        1.Missed calls
                        2.Received calls
                        3.Dialed numbers
                        4.Erase recent call lists
                        5.Show call duration
                        6.Show call costs
                        7.Call cost settings
                        8.Prepaid credit""");
                int input5 = nokia.nextInt();
                System.out.println("""
                        1.Last call duration
                        2.All calls' duration
                        3.Received calls' duration
                        4.Dialed calls' duration
                        5.Clear timers""");
                int input6 = nokia.nextInt();
                System.out.println("""
                        1.Last call cost
                        2.All calls' cost
                        3.Clear counters""");
                int input7case4 = nokia.nextInt();
                System.out.println("""
                        1.Call cost limit
                        2.Show costs in""");
            }
            case 5 -> System.out.println("""
                    1.Ringing tones
                    2.Ringing volume
                    3.Incoming call alert
                    4.Composer
                    5.Message alert tone
                    6.keypad tones
                    7.Warning and game tones
                    8.Vibrating alert
                    9.Screen saver""");
            case 6 -> {
                System.out.println("""
                        1.Call settings
                        2.Phone settings
                        3.Security settings
                        4.Restore factory settings""");
                int input1case6 = nokia.nextInt();
                System.out.println("""
                        1.Automatic redial
                        2.Speed dialing
                        3.Call waiting options
                        4.Own number sending
                        5.phone line in use
                        6.Automatic answer""");
                int input2case6 = nokia.nextInt();
                System.out.println("""
                        1.Language
                        2.Cell info display
                        3.Welcome note
                        4.Network selection
                        5.Lights
                        6.Confirm SIM service actions""");
                int input3case6 = nokia.nextInt();
                System.out.println("""
                        1.Pin code request
                        2.Call barring service
                        3.Fixed dialing
                        4.Closed user group
                        5.Phone security
                        6.Change access codes""");
            }
            case 7 -> System.out.println("Call divert");
            case 8 -> System.out.println("Games");
            case 9 -> System.out.println("Calculator");
            case 10 -> System.out.println("Reminders");
            case 11 -> System.out.println("""
                    1.Alarm clock
                    2.Clock settings
                    3.Date setting
                    4.Stopwatch
                    5.Countdown timer
                    6.Auto update of date and time""");
            case 12 -> System.out.println("Profiles");
            case 13 -> System.out.println("Sim services");
            default -> System.out.println("Go back to main menu");
        }

        }
    }

