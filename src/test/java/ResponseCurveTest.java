/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

import org.junit.Test;
import org.ratchetrobotics.algorithms.ai.ResponseCurve;

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
}
