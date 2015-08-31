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
public class PointsConverterDoubleArray {
  private final double[] x;
  private final double[] y;

  public PointsConverterDoubleArray(double[] x, double[] y) {
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