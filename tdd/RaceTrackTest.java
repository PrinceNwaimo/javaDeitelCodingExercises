import HareTortoiseGame.RaceTrack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RaceTrackTest {
    private RaceTrack raceTrack;
    @BeforeEach
    public void setUp(){
        raceTrack = new RaceTrack();
    }
    @Test
    public void testThatRaceTrackExists(){
        assertNotNull(raceTrack);
    }
    @Test
    public void testThatRaceTrackLaneHas_70_squares(){
        String[] lane = raceTrack.getLane();
        assertEquals(70,lane.length);
    }
}
