package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class PurchaseTest {

    @Test
    public void productTest(){
        Purchase purchase = new Purchase();

        int product = purchase.productOf(4);
        assertEquals(8000,product);

    }
    @Test
    public void product2Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product2Of(9);
        assertEquals(16_200,product);
    }
    @Test
    public void product3Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product3Of( 29);
        assertEquals(46_400, product);
    }
    @Test
    public void product4Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product4Of( 49);
        assertEquals(73_500, product);
    }
    @Test
    public void product5Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product5Of(99);
        assertEquals(128_700,product);
    }
    @Test
    public void product6Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product6Of(199);
        assertEquals(238_800,product);
    }
    @Test
    public void product7Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product7Of(499);
        assertEquals(548_900,product);
    }
    @Test
    public void product8Test(){
        Purchase purchase = new Purchase();

        int product = purchase.product8Of(500);
        assertEquals(500_000,product);
    }
}



