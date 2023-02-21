package tddTest;

import Chapter6.CoinTossGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CoinTossGameTest {
    private CoinTossGame coinTossGame;
    @BeforeEach
    public void setup(){
        coinTossGame = new CoinTossGame();
        String menu = """
                1. Toss Coin
                2. Exit Game
                """;
    }
    @Test
    public void testThatGameExists(){
        CoinTossGame coinTossGame = new CoinTossGame();
        assertNotNull(coinTossGame);
    }
    @Test
    public void testMenuOption(){
      String menu =  CoinTossGame.getGameMenu();
      assertTrue(menu.equals("""
              1. Test Coin
              2. Exit Game
              """));

    }
    @Test
    public void testCoinFlip(){
        String outcome = coinTossGame.flip();
        assertNotNull(outcome);
        assertTrue(outcome.equals("HEADS")||outcome.equals("TAILS"));
    }
    @Test
    public void testCountOutcome(){
        coinTossGame.flip();
    }
}
