//import HareTortoiseGame.RaceTrack;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.Arrays;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotNull;
//
//public class RaceTrackTest {
//    private RaceTrack raceTrack;
//    @BeforeEach
//    public void setUp(){
//        raceTrack = new RaceTrack();
//    }
//    @Test
//    public void testThatRaceTrackExists(){
//        assertNotNull(raceTrack);
//    }
//    @Test
//    public void testThatRaceTrackLaneHas_70_squares(){
//        String[][] lanes = raceTrack.getLanes();
//        String[] laneOne= lanes[0];
//        String[] laneTwo = lanes[1];
//        System.out.println(Arrays.deepToString(lanes));
//        assertEquals(70,laneOne.length);
//        assertEquals(70,laneTwo.length);
//    }
//    @Test
//    public void testThatRaceTrackLaneSquareIsBlankBYDefault(){
//        String[][] lanes = raceTrack.getLanes();
//        for(String[] lane:lanes){
//            for(String square:lane){
//                assertEquals("",square);
//            }
//        }
//
//    }
//    @Test
//    public void testTortoiseFast_PlodMove(){
//        raceTrack.move(5);
//        String[] tortoiseLane = raceTrack.getLanes()[0];
//        assertEquals(raceTrack.getTORTOISE_SYMBOL(), tortoiseLane[3]);
//    }
//
//    @Test
//    public void testTortoiseSlipMove(){
//        raceTrack.move(3);
//        raceTrack.move(7);
//        String[] tortoiseLane = raceTrack.getLanes()[0];
//        assertEquals("T", tortoiseLane[0]);
//    }
//
//
//}
