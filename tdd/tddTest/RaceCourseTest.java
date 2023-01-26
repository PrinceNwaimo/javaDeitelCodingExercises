package tddTest;

import HareTortoiseGame.RaceCourse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RaceCourseTest {
    private RaceCourse raceCourse;

    @BeforeEach
    public void setUp(){
        raceCourse = new RaceCourse();
    }
    @Test
    public void testThatRaceCourseExists(){
        assertNotNull(raceCourse);
    }
    @Test
    public void testThatRaceCourseHasRaceTRack(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getRaceTrack());
    }
    @Test
    public void testThatRaceCourseHasPail(){
        assertNotNull(raceCourse);
        assertNotNull(raceCourse.getPail());
    }
}
