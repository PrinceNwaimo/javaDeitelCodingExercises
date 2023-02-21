//package tddTest;
//
//import HareTortoiseGame.RaceCourse;
//import HareTortoiseGame.RaceTrack;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class RaceCourseTest {
//    private RaceCourse raceCourse;
//
//    @BeforeEach
//    public void setUp() {
//        raceCourse = new RaceCourse();
//    }
//
//    @Test
//    public void testThatRaceCourseExists() {
//        assertNotNull(raceCourse);
//    }
//
//    @Test
//    public void testThatRaceCourseHasRaceTRack() {
//        assertNotNull(raceCourse);
//        assertNotNull(raceCourse.getRaceTrack());
//    }
//
//    @Test
//    public void testThatRaceCourseHasPail() {
//        assertNotNull(raceCourse);
//        assertNotNull(raceCourse.getPail());
//
//    }
//
//    @Test
//    public void testGenerateRandomNumberBetween_1_and_10() {
//        int number = RaceCourse.generateRandomNumber();
//        assertTrue(number >= 1 && number <= 10);
//    }
//
//    @Test
//    public void testThatTortoiseIsInFirstSquareWhenRaceStarts() {
//        RaceTrack raceTrack = raceCourse.getRaceTrack();
//        String[][] lanes = raceTrack.getLanes();
//        String[] ijapaLane = lanes[0];
//        assertEquals("T", ijapaLane[0]);
//    }
//
//    @Test
//    public void testThatHareIsInFirstSquareWhenRaceStarts() {
//        RaceTrack raceTrack = raceCourse.getRaceTrack();
//        String[][] lanes = raceTrack.getLanes();
//        String[] hareLane = lanes[1];
//        assertEquals("H", hareLane[0]);
//    }
//
//    @Test
//    public void testThatRaceTrackLaneSquareIsBlankByDefault() {
//        String[][] lanes = raceTrack.getLanes();
//        for (int counter = 0; counter < lanes.length; counter++) {
//            for (int counterTwo = 1; counterTwo < lanes[counter].length; counterTwo++) {
//                assertEquals(raceTrack.getBlankSpace(), lanes[counter][counterTwo]);
//                for (String[] lane : lanes) {
//                    for (int counter = 1; counter < lane.length; counter++) {
//                        assertEquals(raceTrack.getBlankSpace(), lane[counter]);
//                    }
//                }
//            }
//
//            @Test
//            public void testTortoiseFast_PlodMove () {
//                public void testTortoiseFastPlodMove () {
//                    raceTrack.move(5);
//                    String[] tortoiseLane = raceTrack.getLanes()[0];
//                    assertEquals(raceTrack.getTORTOISE_SYMBOL(), tortoiseLane[3]);
//                    String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//                    assertEquals(raceTrack.getTortoise(), tortoiseLane[3]);
//                }
//
//                @Test
//                public void testTortoiseSlipMove () {
//                    raceTrack.move(3);
//                    raceTrack.move(7);
//                    String[] tortoiseLane = raceTrack.getLanes()[0];
//                    assertEquals("T", tortoiseLane[0]);
//                    String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//                    assertEquals(raceTrack.getTortoise(), tortoiseLane[0]);
//                }
//
//
//                @Test
//                void testTortoiseMakesSlipMoveAtCell_9 () {
//                    raceTrack.move(5);
//                    raceTrack.move(5);
//                    raceTrack.move(5);
//                    String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//                    raceTrack.move(6);
//                    assertEquals(raceTrack.getTortoise(), tortoiseLane[3]);
//                }
//
//                @Test
//                void testTortoiseMakesSlipMoveAtCell_8 () {
//                    raceTrack.move(5);
//                    raceTrack.move(5);
//                    raceTrack.move(9);
//                    raceTrack.move(9);
//                    raceTrack.move(6);
//                    String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//                    assertEquals(raceTrack.getTortoise(), tortoiseLane[2]);
//                }
//                @Test
//                public void testTortoiseSlowPlodMove () {
//                    raceTrack.move(9);
//                    String[] tortoiseLane = raceTrack.getLanes()[raceTrack.getTortoiseLane()];
//                    assertEquals(raceTrack.getTortoise(), tortoiseLane[1]);
//                }
//
//                @Test
//                public void testHareSleepMove () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    raceTrack.move(1);
//                    assertEquals(raceTrack.getHare(), hareLane[0]);
//                }
//
//                @Test
//                public void testHareBigHopMove () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    raceTrack.move(3);
//                    assertEquals(raceTrack.getHare(), hareLane[9]);
//                }
//
//                @Test
//                public void testHareBigSlipMove () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    raceTrack.move(3);
//                    raceTrack.move(5);
//                    assertEquals(raceTrack.getHare(), hareLane[0]);
//                }
//
//                @Test
//                public void testHareSmallHopMove () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    raceTrack.move(7);
//                    assertEquals(raceTrack.getHare(), hareLane[1]);
//                }
//
//                @Test
//                public void testHareSmallSlipMove () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    raceTrack.move(4);
//                    raceTrack.move(9);
//                    assertEquals(raceTrack.getHare(), hareLane[7]);
//                }
//
//                @Test
//                public void testAnimalMoveStaysWithinTrackBound () {
//                    int hareLaneIndex = raceTrack.getHareLane();
//                    String[] hareLane = raceTrack.getLanes()[hareLaneIndex];
//                    for (int i = 0; i < 8; i++) {
//                        raceTrack.move(3);
//                    }
//                    assertEquals(raceTrack.getHare(), hareLane[69]);
//                }
//
//            }
//        }
//    }
//}
//
