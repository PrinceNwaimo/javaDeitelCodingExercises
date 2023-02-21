package tddTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HekkaParcelsTest {
    @Test
    public void collectionRateTest(){
        //Given that I have a parcel
        Parcel scan = new Parcel(55);
        assertEquals(11000, scan.getAmount());




    }

}
