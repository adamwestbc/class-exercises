package ca.ubc.cs.cpsc210.spaceinvaders.model;

import java.awt.Color;

import static ca.ubc.cs.cpsc210.spaceinvaders.model.SIGame.WIDTH;

/**
 * Represents a tank
 */
public class Tank {
    public static final int SIZE_X = 15;
    public static final int SIZE_Y = 8;
    public static final int Y_POS = SIGame.HEIGHT - 40;
    public static final Color COLOR = new Color(250, 0, 20);
    public static int DX = 2;
    public boolean right = true;
    public boolean left = false;
    protected int xLoc = WIDTH / 2;
    protected boolean face;


    // EFFECTS: places tank at position (x, Y_POS) moving right.
	public Tank(int x, boolean facing) {
       // super(x, facing);
        xLoc = x;
        face = facing;
        //DX = dx;
    }
	
	//@Override
    public int getX(Tank tank) {
		//return WIDTH / 2;  // stub
//        return x;
        return (tank.xLoc);
        //return Tank.x;
        //return tank(int x); //??
	}

    // EFFECTS: returns true if tank is facing right, false otherwise
 //   @Override
    public boolean isFacingRight(Tank tank) {
        //return false;  // stub
        return tank.face;
        //return tank.facing;
        //return (Tank.face);
    }

	// MODIFIES: this
	// EFFECTS: tank is facing right
//	@Override
    public void faceRight(Tank tank) {
	    //right = tank.right;
	    tank.face = right;
		// stub
	}

	// MODIFIES: this
	// EFFECTS: tank is facing left
//	@Override
    public void faceLeft(Tank tank) {
	   tank.face = left;
	    //left = tank.right;
		// stub
	}

	// MODIFIES: this
	// EFFECTS:  tank is moved DX units in whatever direction it is facing and is
	//           constrained to remain within horizontal bounds of game
   // @Override
    public void move(Tank tank) {
	    int tx = getX(tank);
        if((tx <= WIDTH) && (tank.isFacingRight(tank))){
           // tank.xLoc = WIDTH;
            tank.xLoc = xLoc + DX;
            //add dx to posx
        }
        if ((tx <= WIDTH) && (!tank.isFacingRight(tank))){
            tank.xLoc = xLoc - DX;
            //move tank dx to the left
        }
        if ((tx >= WIDTH) && (tank.isFacingRight(tank))) {
            tank.xLoc = WIDTH;
            //keep tank at border
        }
        if ((tx <= 0) && (!tank.isFacingRight(tank))){
            tank.xLoc = 0;
            //keep tank at border
        }
		// stub
	}

	// MODIFIES: this
	// EFFECTS: tank is constrained to remain within horizontal bounds of game
   // @Override
    protected void handleBoundary(Tank tank) {
        int tx = getX(tank);
        if ((tx >= WIDTH - 1) && (tank.isFacingRight(tank))) {
            tank.xLoc = WIDTH;
            //keep tank at border
        }
        if ((tx <= 0) && (!tank.isFacingRight(tank))){
            tank.xLoc = 0;
            //keep tank at border
        }
	}

    //    @Override
    //    public void move(SpeedyTank et){
    //
    //    }

//    public abstract void faceLeft(SpeedyTank et);
//
//    public abstract void faceRight(SpeedyTank et);

//    public abstract void move(SpeedyTank et);
}
