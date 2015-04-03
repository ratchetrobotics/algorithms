/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *     This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *     This is free software, and you are welcome to redistribute it
 *     under certain conditions; type `show c' for details.
 */

package org.ratchetrobotics.algorithms.util;

/**
 * A point.
 * 
 * Used in some of our pathfinding and AI implementations. 
 *
 * @author Liam Marshall (archimedespi on Keybase)
 */
public class CartesianCoordinate {
    private double x, y;

    public CartesianCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
