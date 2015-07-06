/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.junit.Test;
import org.ratchetrobotics.algorithms.ai.ResponseCurve;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ResponseCurveTest {
    @Test
    public void aPointShouldInterpolateToItself() {
        ResponseCurve responseCurve = new ResponseCurve(
                new double[]{0.0, 1.0, 2.0},
                new double[]{0.0, 1.0, 2.0});

        assertEquals("respond(0.0) for y 0.0 should be 0.0", 0.0, responseCurve.respond(0.0), 0.0/*ε, a small fudge for doubles*/);
        assertEquals("respond(1.0) for y 1.0 should be 1.0", 1.0, responseCurve.respond(1.0), 0.0/*ε, a small fudge for doubles*/);
        assertEquals("respond(2.0) for y 2.0 should be 2.0", 2.0, responseCurve.respond(2.0), 0.0/*ε, a small fudge for doubles*/);
    }

    public void aVector2DShouldInterpolateToItself() {
        List<Vector2D> points = new ArrayList<>();
        points.add(new Vector2D(0, 0));
        points.add(new Vector2D(1, 1));
        points.add(new Vector2D(2, 2));

        ResponseCurve responseCurve = new ResponseCurve(points);

        assertEquals("respond(0.0) for y 0.0 should be 0.0", 0.0, responseCurve.respond(0.0), 0.0/*ε, a small fudge for doubles*/);
        assertEquals("respond(1.0) for y 1.0 should be 1.0", 1.0, responseCurve.respond(1.0), 0.0/*ε, a small fudge for doubles*/);
        assertEquals("respond(2.0) for y 2.0 should be 2.0", 2.0, responseCurve.respond(2.0), 0.0/*ε, a small fudge for doubles*/);
    }
}
