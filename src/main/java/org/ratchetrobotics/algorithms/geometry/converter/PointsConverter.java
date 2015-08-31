/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.geometry.converter;

import java.util.List;
import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;

/**
 * This class implements a converter for point types.
 * As of version 1.0, it can convert between double[] x, y format and
 * org.apache.commons.math3.geometry.euclidean.twod.Vector2D.
 *
 * @author Liam Marshall (archimedespi at Keybase)
 * @version 1.0
 */
public class PointsConverter {
  private final List<Vector2D> points;

  public PointsConverter(List<Vector2D> points) {
    this.points = points;
  }

  public PointsConverterDoubleArray toDoubleArrays() {
    List<Double> x = new ArrayList<>();
    List<Double> y = new ArrayList<>();

    for (Vector2D point : points) {
      x.add(point.getX());
      y.add(point.getY());
    }

    return new PointsConverterDoubleArray(
             ArrayUtils.toPrimitive(x.toArray(new Double[x.size()])),
             ArrayUtils.toPrimitive(y.toArray(new Double[y.size()])));
  }
}