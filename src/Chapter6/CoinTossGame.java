package Chapter6;

import java.security.SecureRandom;

public class CoinTossGame {
    private  int HEADS_COUNT;
    private  int TAILS_COUNT;
    private Coin coin;


    public static String getGameMenu() {
        return """
                1. Toss Coin
                2. Exit Game
                """;
    }
    public String flip(){
        SecureRandom secureRandom = new SecureRandom();
        int randomNumber = generateRandomNumberBetweenZeroAndOne();
        if(randomNumber == 0){
            HEADS_COUNT++;
            return coin.HEADS.name();
        }
           TAILS_COUNT++;
        return coin.TAILS.name();

    }

    public int getHEADS_COUNT() {
        return HEADS_COUNT;
    }

    public int getTAILS_COUNT() {
        return TAILS_COUNT;
    }

    private static int generateRandomNumberBetweenZeroAndOne(){
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.nextInt(2);
    }
    public void displayGameResult(){
        int totalFlips = HEADS_COUNT + TAILS_COUNT;
        System.out.printf("Total toss is: %d\nHEADS: %d\nTAILS: %d%n",totalFlips,HEADS_COUNT,TAILS_COUNT);

    }
}
