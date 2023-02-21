package Chapter8;

import org.junit.jupiter.api.Test;

import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.*;

class Geo_Political_ZonesTest {
    @Test
    public void testThatStatesAreInGeoPoliticalZone(){

     Geo_Political_Zones zone = Geo_Political_Zones.getStates("Abia");
        System.out.println(zone);
        assertEquals(Geo_Political_Zones.SOUTH_EAST, zone);





    }

}