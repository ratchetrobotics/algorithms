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
public class PointConverter {
	private List<Vector2D> points;

	public PointConverter(List<Vector2D> points) {
		this.points = points;
	}

	public PointConverterDoubleArray toDoubleArrays() {
		List<Double> x = new ArrayList<Double>();
		List<Double> y = new ArrayList<Double>();

		points.stream().forEach((point) -> {
			x.add(point.getX());
			y.add(point.getY());
		});

		return new PointConverterDoubleArray(
			ArrayUtils.toPrimitive(x.toArray(new Double[0])),
			ArrayUtils.toPrimitive(y.toArray(new Double[0])));
	}
}