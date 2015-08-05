/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *  Licensed under the BSD license.
 */

package org.ratchetrobotics.algorithms.mapping;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.geojson.FeatureCollection;

import java.io.IOException;

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
    FeatureCollection geoJSONFeatures;
    public FieldMap(String mapString) {
        try {
            geoJSONFeatures = new ObjectMapper().readValue(mapString, FeatureCollection.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public FeatureCollection getFeatureCollection() {
        return this.geoJSONFeatures;
    }
}