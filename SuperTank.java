package ca.ubc.cs.cpsc210.spaceinvaders.model;

import java.awt.*;

import static ca.ubc.cs.cpsc210.spaceinvaders.model.SIGame.WIDTH;

public abstract class SuperTank {
    public static final int SIZE_X = 15;
    public static final int SIZE_Y = 8;
    public static final int Y_POS = SIGame.HEIGHT - 40;
    public static final Color COLOR = new Color(250, 0, 20);
    public static int DX = 2;
    public boolean right = true;
    public boolean left = false;
    protected int xLoc = WIDTH / 2;
    protected boolean face;

    public SuperTank(int x, boolean facing) {
        xLoc = x;
        face = facing;
    }

    public abstract int getX();

    // EFFECTS: returns true if tank is facing right, false otherwise
    public abstract boolean isFacingRight();

    // MODIFIES: this
    // EFFECTS: tank is facing right
    public abstract void faceRight();

    // MODIFIES: this
    // EFFECTS: tank is facing left
    public abstract void faceLeft();

    // MODIFIES: this
    // EFFECTS:  tank is moved DX units in whatever direction it is facing and is
    //           constrained to remain within horizontal bounds of game
    public abstract void move();

    // MODIFIES: this
    // EFFECTS: tank is constrained to remain within horizontal bounds of game
    public abstract void handleBoundary();
}
