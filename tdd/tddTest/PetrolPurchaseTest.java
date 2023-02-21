package tddTest;

import Chapter3.PetrolPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void testForPurchaseAmount(){
        //Given that I have a station
        PetrolPurchase ababa = new PetrolPurchase("Abia","Solid",100,250.00,5.00);
        //when I purchase five litres of petrol
        ababa.getPercentageDiscount();
        double ababaPetrolPurchase = ababa.getPercentageDiscount();
        //assert that amount is 5000
    }

}
