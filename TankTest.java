package ca.ubc.cs.cpsc210.spaceinvaders.test;

import ca.ubc.cs.cpsc210.spaceinvaders.model.SIGame;
import ca.ubc.cs.cpsc210.spaceinvaders.model.Tank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static ca.ubc.cs.cpsc210.spaceinvaders.model.SIGame.WIDTH;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * Unit tests for the Tank class.
 */
public class TankTest {
	private static final int XLOC = WIDTH / 2;
	private static final int Y_POS = SIGame.HEIGHT - 40;
	private Tank testTank;
	
	@BeforeEach
	public void runBefore() {
		testTank = new Tank(XLOC, true);
	}


    // EFFECTS: places tank at position (x, Y_POS) moving right.
//	@Test
//	public void testTank() {
//
//        //assertEquals(tank,)
//		// template for tests
//	}

    @Test
    public void testGetX() {
        assertEquals(testTank.getX(testTank),XLOC);
    }

    // EFFECTS: tank is facing left
    @Test
    public void testFaceLeft() {
	    testTank.faceRight(testTank);
        testTank.faceLeft(testTank);
        assertFalse(testTank.isFacingRight(testTank));
        // template for tests
    }

    // EFFECTS: tank is facing right
    @Test
    public void testFaceRight() {
	    testTank.faceRight(testTank);
	    assertTrue(testTank.isFacingRight(testTank));
        // template for tests
    }

    // EFFECTS: tank is constrained to remain within horizontal bounds of game
    @Test
    public void testHandleBoundary() {
	    Tank testTank2 = new Tank(WIDTH, true);
	    testTank2.move(testTank2);
	    assertEquals(testTank2.getX(testTank2),WIDTH);

	    Tank testTank3 = new Tank(0, false);
	    testTank3.move(testTank3);
	    assertEquals(testTank3.getX(testTank3), 0);
        // template for tests
    }

    // EFFECTS: returns true if tank is facing right, false otherwise
    @Test
    public void testIsFacingRight() {
	    testTank.faceLeft(testTank);
	    assertFalse(testTank.isFacingRight(testTank));
	    testTank.faceRight(testTank);
	    assertTrue(testTank.isFacingRight(testTank));
        // template for tests
    }

    // EFFECTS:  tank is moved DX units in whatever direction it is facing and is
    //           constrained to remain within horizontal bounds of game
    @Test
    public void testMove() {
	    testTank.faceRight(testTank);
	    testTank.move(testTank);
        assertEquals(testTank.getX(testTank),XLOC+2);

        Tank testTank4 = new Tank(WIDTH, true);
        testTank4.move(testTank4);
        assertEquals(testTank4.getX(testTank4),WIDTH);

        Tank testTank5 = new Tank(0,false);
        testTank5.move(testTank5);
        assertEquals(testTank5.getX(testTank5),0);
    }
}
