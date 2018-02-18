package ca.ubc.cs.cpsc210.spaceinvaders.model;

import javax.swing.plaf.SplitPaneUI;

import static ca.ubc.cs.cpsc210.spaceinvaders.model.SIGame.WIDTH;


public class SpeedyTank extends Tank {
    //SpeedyTank stank;

    public SpeedyTank(int x, int dx, boolean facing) {
        super(x, facing);
        DX = dx;
        // stank = new SpeedyTank(x, facing);
        //  super.faceRight();
    }

//    @Override
//    public int getX(SpeedyTank stank) {
//        return (stank.xLoc);
//    }
//
//
//    public boolean isFacingRight(SpeedyTank stank) {
//        return stank.face;
//    }

    //@Override
    public void faceRight(SpeedyTank stank) {
        //super.faceRight(Tank tank);
        stank.face = right;
        //stank.DX = (stank.DX + 1);
        stank.DX = stank.DX++;
        //stank.DX = 100;
//        int i = 1;
//        while(i<100){
//            stank.DX = DX + i;
//        }
        // stank.DX += DX;
    }

    //   @Override
    public void faceLeft(SpeedyTank stank) {
        //super.faceLeft(Tank tank);
        stank.face = left;
        stank.DX = stank.DX++;
        //stank.DX += DX;
    }

    //}
    public void move(SpeedyTank stank) {
        int tx = getX(stank);
        int i = 0;
        if ((tx <= WIDTH) && (stank.isFacingRight(stank))) {
            i =+ 1;
            stank.DX = (stank.DX + i);
            // tank.xLoc = WIDTH;
            stank.xLoc = xLoc + stank.DX;
            //add dx to posx
        }
        if ((tx <= WIDTH) && (!stank.isFacingRight(stank))) {
            i =+ 1;
            stank.DX = (stank.DX + i);
            stank.xLoc = xLoc - stank.DX;
            //move tank dx to the left
        }
        if ((tx >= WIDTH) && (stank.isFacingRight(stank))) {
            stank.xLoc = WIDTH;
            //keep tank at border
        }
        if ((tx <= 0) && (!stank.isFacingRight(stank))) {
            stank.xLoc = 0;
            //keep tank at border
        }
        //i = (i+1);
    }
}
//    protected void handleBoundary(SpeedyTank stank) {
//        int tx = getX(stank);
//        if ((tx >= WIDTH - 1) && (stank.isFacingRight(stank))) {
//            stank.xLoc = WIDTH;
//            //keep tank at border
//        }
//        if ((tx <= 0) && (!stank.isFacingRight(stank))){
//            stank.xLoc = 0;
//            //keep tank at border
//        }

    //    @Override
//    public void move(SpeedyTank et){
//
//    }
// MODIFIES: this
// EFFECTS: tank is facing left, add onto dx
//    @Override
//    public void faceLeft(SpeedyTank et){
//       //super.faceLeft(et);
//        et.face = right;
//        DX =+ DX;
//    }
//
//    // MODIFIES: this
//    // EFFECTS: tank is facing right, add onto dx
//    @Override
//    public void faceRight(SpeedyTank et){
//        et.face = left;
//        DX =+ DX;
//    }
