/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *     This program comes with ABSOLUTELY NO WARRANTY; for details type `show w'.
 *     This is free software, and you are welcome to redistribute it
 *     under certain conditions; type `show c' for details.
 */

package org.ratchetrobotics.algorithms;

import org.ratchetrobotics.algorithms.util.CartesianCoordinate;

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
    private float[][] bucketValues;

    /**
     * Construct a ResponseCurve from values
     * @param bucketValues an array of coordinates of the left-top bucket edges.
     */
    public ResponseCurve(CartesianCoordinate[] bucketValues) {
        this.bucketValues = bucketValues;
    }

    public float
}
