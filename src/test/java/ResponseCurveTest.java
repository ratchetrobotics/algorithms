/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *     This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *     This is free software, and you are welcome to redistribute it
 *     under certain conditions; type `show c' for details.
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

        assertEquals("the origin of the response curve should be zero", responseCurve.respond(0.0), 0.0, 0.0/*ε, a small fudge for doubles*/);
    }
}
