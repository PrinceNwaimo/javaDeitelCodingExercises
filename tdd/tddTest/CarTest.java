package tddTest;

import Chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test

    public void testThatCarCanBeCreated(){
        Car benz = new Car("G-990","2022",50.00);

        assertNotNull(benz);


    }
    @Test

    public void testThatCarAttributesAreProperlyInitialised(){
        Car benz= new Car("G-990","2022",50.00);
     assertEquals ("G-990",benz.getModel());
     assertEquals("2022",benz.getYear());
     assertEquals(50.00,benz.getPrice());
    }
    @Test
    public void testThatOnlyPositiveAmountsAreAllowedAsCarPrice(){
        Car benz= new Car("G-990","2022",50.00);
        benz.setPrice(-200000);

        assertEquals(50.00,benz.getPrice());

    }
    @Test
    public void testDiscount(){
        Car benz = new Car("G-990","2022",50.00);
        benz.applyDiscount(10);
        assertEquals(45,benz.getPrice());

    }

}
