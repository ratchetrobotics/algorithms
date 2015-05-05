/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 * Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.ai;

import org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunction;
import org.apache.commons.math3.analysis.interpolation.SplineInterpolator;

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
