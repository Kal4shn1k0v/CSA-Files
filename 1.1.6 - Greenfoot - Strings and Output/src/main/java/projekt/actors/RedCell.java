package projekt.actors;

import greenfoot.Actor;

public class RedCell extends Actor {
    public int velocity;
    public int direction;

    public RedCell (int speed, int rotation) {
        if (speed !=0 ) { //Set speed.
            velocity = speed;
        } else {
            velocity = speed + 3;
        }

        if (rotation < 3) { //Set turn rate.
            direction =  -3;
        } else if (rotation > 3) {
            direction = 3;
        }
    }

    public void act() { //Movement/
        setLocation(getX()-velocity, getY());
        turn(direction);

        if (getX() == 0) {
            getWorld().removeObject(this);
        }
    }
}
