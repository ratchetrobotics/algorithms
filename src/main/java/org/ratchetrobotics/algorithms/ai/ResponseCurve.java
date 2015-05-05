/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *     This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *     This is free software, and you are welcome to redistribute it
 *     under certain conditions; type `show c' for details.
 */

package org.ratchetrobotics.algorithms.ai;

import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;

import java.util.ArrayList;

/**
 * This class implements a bucketed response curve.
 * Response curves can be used in the processing of joystick or sensor input,
 * and in the processing of incidence significance.
 * ResponseCurves are static and cannot be updated dynamically as of this version.
 *
 * @author Liam Marshall (archimedespi at Keybase)
 * @version 1.0
 */
public class ResponseCurve {
    SplineInterpolator splineInterpolator;
    PolynomialSplineFunction splineFunction;

    /**
     * Constructs a <code>ResponseCurve</code> by interpolating arrays of curve points.
     *
     * @param x x-values of curve points
     * @param y y-values of curve points
     */
    public ResponseCurve(double[] x, double[] y) {
        this.splineInterpolator = new SplineInterpolator();
        this.splineFunction = this.splineInterpolator.interpolate(x, y);
    }

    /**
     * Respond to a stimulus.
     *
     * @param stimulus the stimulus to respond to.
     * @return the response to the stimulus.
     */
    public double respond(double stimulus) {
        return this.splineFunction.value(stimulus);
    }
}
