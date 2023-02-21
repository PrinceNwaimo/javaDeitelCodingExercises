package tddTest;


import Chapter4.DistanceExercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceExerciseTest {

    @Test
    public  void testTwoPointsInAPlaneRestOnLinePerpendicularToAxis(){
        assertTrue(DistanceExercise.isPerpendicular(2,2,4,5));
        }
    @Test
    public void testThatCoordinatesWithoutSlopeDon_tLieOnPerpendicularLine(){
        assertFalse(DistanceExercise.isPerpendicular(3,3,4,4));
    }
}


