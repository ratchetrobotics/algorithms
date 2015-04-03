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
        CartesianCoordinate coordinate = new CartesianCoordinate(1,2);
        assertEquals("getX should return 1 when x in the constructor was 1", 1, coordinate.getX(), 0.0/*ε, a small fudge for doubles*/);
    }

    @Test
    public void storesYCoordinates() {
        CartesianCoordinate coordinate = new CartesianCoordinate(1,2);
        assertEquals("getY should return 2 when y in the constructor was 2", 2, coordinate.getY(), 0.0/*ε, a small fudge for doubles*/);
    }

    @Test
    public void settableXCoordinates() {
        CartesianCoordinate coordinate = new CartesianCoordinate(1,2);
        coordinate.setX(8);
        assertEquals("getX should return 8 when x in the constructor was 1 but was overriden with 8 by setX", 8, coordinate.getX(), 0.0/*ε, a small fudge for doubles*/);
    }

    @Test
    public void settableYCoordinates() {
        CartesianCoordinate coordinate = new CartesianCoordinate(1,2);
        coordinate.setY(10);
        assertEquals("getY should return 10 when y in the constructor was 2 but was overriden with 10 by setY", 2, coordinate.getY(), 0.0/*ε, a small fudge for doubles*/);
    }
}
