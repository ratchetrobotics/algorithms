/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *     This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *     This is free software, and you are welcome to redistribute it
 *     under certain conditions; type `show c' for details.
 */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.ratchetrobotics.algorithms.util.CartesianCoordinate;

public class CartesianCoordinateTest {
    @Test
    public void storesXCoordinates() {
        CartesianCoordinate coordinate = new CartesianCoordinate(1,3);
        assertEquals("getX should return 1 when x in the constructor was 1", 1, coordinate.getX(), 0.0/*ε, a small fudge for doubles*/);
    }
}
