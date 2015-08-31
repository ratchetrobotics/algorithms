/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *  Licensed under the BSD license.
 */

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import org.geotools.feature.FeatureIterator;
import org.junit.Test;
import org.ratchetrobotics.algorithms.mapping.FieldMap;

import java.io.IOException;
import java.io.StringReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class FieldMapTest {
    @Test
    public void itShouldNotBarfOnValidInput() throws IOException {
        String someGeoJSON = "{ \"type\": \"FeatureCollection\",\n" +
                "  \"features\": [\n" +
                "    { \"type\": \"Feature\",\n" +
                "      \"geometry\": {\"type\": \"Point\", \"coordinates\": [102.0, 0.5]},\n" +
                "      \"properties\": {\"prop0\": \"value0\"}\n" +
                "      },\n" +
                "    { \"type\": \"Feature\",\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"LineString\",\n" +
                "        \"coordinates\": [\n" +
                "          [102.0, 0.0], [103.0, 1.0], [104.0, 0.0], [105.0, 1.0]\n" +
                "          ]\n" +
                "        },\n" +
                "      \"properties\": {\n" +
                "        \"prop0\": \"value0\",\n" +
                "        }\n" +
                "     }\n" +
                "     ]\n" +
                "   }";
        FieldMap aFieldMap = new FieldMap(someGeoJSON);
        assertNotNull(aFieldMap.getFeatureCollection());
    }

    @Test
    public void itShouldNotBarfOnValidReader() throws IOException {
        String someGeoJSON = "{ \"type\": \"FeatureCollection\",\n" +
                "  \"features\": [\n" +
                "    { \"type\": \"Feature\",\n" +
                "      \"geometry\": {\"type\": \"Point\", \"coordinates\": [102.0, 0.5]},\n" +
                "      \"properties\": {\"prop0\": \"value0\"}\n" +
                "      },\n" +
                "    { \"type\": \"Feature\",\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"LineString\",\n" +
                "        \"coordinates\": [\n" +
                "          [102.0, 0.0], [103.0, 1.0], [104.0, 0.0], [105.0, 1.0]\n" +
                "          ]\n" +
                "        },\n" +
                "      \"properties\": {\n" +
                "        \"prop0\": \"value0\",\n" +
                "        }\n" +
                "     }\n" +
                "     ]\n" +
                "   }";
        FieldMap aFieldMap = new FieldMap(new StringReader(someGeoJSON));
        assertNotNull(aFieldMap.getFeatureCollection());
    }

    @Test
    public void aGeoJsonPointShouldBeTranslated() throws IOException {
        FieldMap aFieldMap = new FieldMap("{\n" +
                "  \"type\": \"FeatureCollection\",\n" +
                "  \"features\": [\n" +
                "    {\n" +
                "      \"type\": \"Feature\",\n" +
                "      \"geometry\": {\n" +
                "        \"type\": \"Point\",\n" +
                "        \"coordinates\": [\n" +
                "          0.5,\n" +
                "          0.5\n" +
                "        ]\n" +
                "      },\n" +
                "      \"properties\": {}\n" +
                "    }\n" +
                "  ]\n" +
                "}\n");
        FeatureIterator it = aFieldMap.getFeatureCollection().features();
        Geometry point = (Geometry) it.next().getDefaultGeometryProperty().getValue();
        GeometryFactory geometryFactory = new GeometryFactory();
        Geometry expectedPoint = geometryFactory.createPoint(new Coordinate(0.5, 0.5));
        assertEquals(point, expectedPoint);
    }
}
