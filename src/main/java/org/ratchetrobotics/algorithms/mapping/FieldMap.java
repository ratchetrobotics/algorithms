/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *  Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.mapping;

import org.geotools.feature.FeatureCollection;
import org.geotools.geojson.feature.FeatureJSON;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/**
 * The FieldMap's purpose is to take data from a GeoJSON file,
 * and present it to the AStarPathFinder in an easy-to-use way.
 * Cool things which it will be able to do:
 * <ul>
 *     <li>Generate a triangulated-graph representation of any GeoJSON file!</li>
 *     <li>Map from a triangulated-graph to actual coordinates!</li>
 *     <li>Add pushpins for important locations!</li>
 * </ul>
 *
 * @author Liam Marshall (archimedespi at Keybase)
 * @version 1.0
 */
public class FieldMap {
    FeatureJSON fjson;
    FeatureCollection geoJsonFeatures;

    public FieldMap(String mapString) throws IOException {
        fjson = new FeatureJSON();
        geoJsonFeatures = fjson.readFeatureCollection(new StringReader(mapString));
    }

    public FieldMap(Reader reader) throws IOException {
        fjson = new FeatureJSON();
        geoJsonFeatures = fjson.readFeatureCollection(reader);
    }

    public FeatureCollection getFeatureCollection() {
        return this.geoJsonFeatures;
    }
}