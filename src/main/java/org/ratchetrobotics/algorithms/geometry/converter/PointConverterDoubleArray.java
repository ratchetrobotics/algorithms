/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.geometry.converter;

/**
 * This class can push out double[] x, y pairs nicely
 * with getX() and getY() methods.
 *
 * @author Liam Marshall (archimedespi at Keybase)
 * @version 1.0
 */
public class PointConverterDoubleArray {
	private double[] x;
	private double[] y;

	public PointConverterDoubleArray(double[] x, double[] y) {
		this.x = x;
		this.y = y;
	}

	public double[] getX() {
		return x;
	}
	
	public double[] getY() {
		return y;
	}
}