package projekt.actors;

import greenfoot.*;

public class WhiteKey extends Actor {
    private GreenfootImage textureInactive = new GreenfootImage("white-key.png");
    private GreenfootImage textureActive = new GreenfootImage("white-key-down.png");

    public WhiteKey(String whiteIndex) {
        setImage(textureInactive);
        getImage().scale(63, 280);
    }

    private boolean isDown = false;

    public void act() {


    }
}

