/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.geometry.converter;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.*;
import com.google.common.primitives.Doubles;
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
	private List<Vector2D> points;

	public PointsConverter(List<Vector2D> points) {
		this.points = points;
	}

	public PointsConverterDoubleArrays toDoubleArrays() {
		List<Double> x = points.stream().map(p -> p.getX()).collect(Collectors.toList());
		List<Double> y = points.stream().map(p -> p.getY()).collect(Collectors.toList());

		return new PointsConverterDoubleArrays(Doubles.toArray(x), Doubles.toArray(y));
	}
}