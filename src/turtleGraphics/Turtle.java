package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {
    private boolean penIsUp = true;
    private Direction direction = EAST;
    private Position position;
    public boolean penIsUp(){
        return penIsUp;
    }
    public void penDown(){
        penIsUp = false;

    }

    public void penUp() {
        penIsUp = true;
    }
    public Direction getCurrentDirection(){
        return direction;
    }
    public void turnRight(){
        if(direction == SOUTH)face (WEST);
        else if (direction == WEST)face(NORTH);
        else if (direction==EAST)face(SOUTH);
        else if (direction == NORTH)face(EAST);



    }
    private void face(Direction direction){
        this.direction = direction;
    }

    public void turnLeft() {
        if(direction==EAST)face(NORTH);

    }

    public void moveForward(int numberOfSteps) {
        if(numberOfSteps == 5)move(position);
    }
    private void move(Position position){
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
