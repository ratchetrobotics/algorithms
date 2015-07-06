/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.ratchetrobotics.algorithms.geometry.converter.PointsConverter;

import static org.junit.Assert.assertEquals;

public class PointsConverterTest {
	@Test
	public void convertVector2DToDoubleArrayShouldPreserveCoordinates() {
		List<Vector2D> points = new ArrayList<>();
		points.add(new Vector2D(1, 1));
		points.add(new Vector2D(2, 2));
		points.add(new Vector2D(3, 3));
		PointsConverter pointsConverter = new PointsConverter(points);
		double[] x = pointsConverter.toDoubleArrays().getX();
		double[] y = pointsConverter.toDoubleArrays().getY();

		// point 1
		assertEquals("X for point 1 should be 1", 1, x[0], 0.0/*ε, a small fudge for doubles*/);
		assertEquals("Y for point 1 should be 1", 1, y[0], 0.0/*ε, a small fudge for doubles*/);
		// point 2
		assertEquals("X for point 2 should be 2", 2, x[1], 0.0/*ε, a small fudge for doubles*/);
		assertEquals("Y for point 2 should be 2", 2, y[1], 0.0/*ε, a small fudge for doubles*/);
		// point 3
		assertEquals("X for point 3 should be 3", 3, x[2], 0.0/*ε, a small fudge for doubles*/);
		assertEquals("Y for point 3 should be 3", 3, y[2], 0.0/*ε, a small fudge for doubles*/);
	}
}