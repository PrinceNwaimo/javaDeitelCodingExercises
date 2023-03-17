package turtleGraphics;

import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleTest {

    private Turtle Ijapa = new Turtle();

    @Test
    public void turtleCanMovePenDownTest() {
        //given I have a turtle
        Turtle Ijapa = new Turtle();
        assertTrue(Ijapa.penIsUp());
        //and the turtle pen is up
        //when I move pen down
        Ijapa.penDown();
        //confirm that the pen is down
        assertFalse(Ijapa.penIsUp());
    }

    @Test
    public void penCanGoUp() {
        //given I have a turtle
        Turtle Ijapa = new Turtle();
        //and pen is down
        Ijapa.penDown();
        assertFalse(Ijapa.penIsUp());
        //when I move pen up
        Ijapa.penUp();
        assertTrue(Ijapa.penIsUp());
        //check that pen is up
    }

    @Test
    public void turtleCanTurnRightToSouthWhileFacingEastTest() {
        //given I have a turtle
        assertSame(EAST, Ijapa.getCurrentDirection());
        //and it is facing East
        //when it turns right
        Ijapa.turnRight();
        //confirm that it is facing south
        assertSame(SOUTH, Ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRightToWestWhileFacingSouthTest() {
        Ijapa.turnRight();
        assertSame(SOUTH, Ijapa.getCurrentDirection());
        Ijapa.turnRight();
        assertSame(WEST, Ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightToNorthWhileFacingWestTest(){
        Ijapa.turnRight();
        Ijapa.turnRight();
        assertSame(WEST,Ijapa.getCurrentDirection());
        Ijapa.turnRight();
        assertSame(NORTH,Ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnRightToEastWhileFacingNorthTest(){
        Ijapa.turnRight();
        Ijapa.turnRight();
        Ijapa.turnRight();
        assertSame(NORTH,Ijapa.getCurrentDirection());
        Ijapa.turnRight();
        assertSame(EAST,Ijapa.getCurrentDirection());
    }


    @Test
    public void turtleCanTurnLeftWhileFacingEastTest(){
        assertSame(EAST,Ijapa.getCurrentDirection());
        Ijapa.turnLeft();
        assertSame(NORTH,Ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingNorthTest(){
        assertSame(NORTH,Ijapa.getCurrentDirection());
        Ijapa.turnLeft();
        assertSame(WEST,Ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingWestTest(){
        assertSame(WEST,Ijapa.getCurrentDirection());
        Ijapa.turnLeft();
        assertSame(SOUTH,Ijapa.getCurrentDirection());
    }
    @Test
    public void turtleCanTurnLeftWhileFacingSouthTest(){
        assertSame(SOUTH,Ijapa.getCurrentDirection());
        Ijapa.turnLeft();
        assertSame(EAST,Ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveForwardWhileFacingEastTest(){
        assertSame(Ijapa.getCurrentDirection(), EAST);
        assertEquals(new Position(0,5), Ijapa.getPosition());

        Ijapa.moveForward(5);
        assertEquals(new Position(0,5), Ijapa.getPosition());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingWestTest(){
        assertSame(Ijapa.getCurrentDirection(),WEST);
        assertEquals(new Position(0,5),Ijapa.getPosition());
        Ijapa.moveForward(5);
        assertEquals(new Position(0,5),Ijapa.getPosition());
    }
    @Test
    public void turtleCanMoveForwardWhileFacingNorthTest() {
        assertSame(Ijapa.getCurrentDirection(), NORTH);
        assertEquals(new Position(0, 5), Ijapa.getPosition());
        Ijapa.moveForward(5);
        assertEquals(new Position(0, 5), Ijapa.getPosition());
    }
    //todo add west,north and south
    @Test
    public void turtleCanMoveForwardWhileFacingSouthTest() {
        assertSame(Ijapa.getCurrentDirection(), SOUTH);
        assertEquals(new Position(0, 5), Ijapa.getPosition());
        Ijapa.moveForward(5);
        assertEquals(new Position(0, 5), Ijapa.getPosition());
    }
}
