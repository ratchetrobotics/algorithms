/*
 * algorithms  Copyright (C) 2015 Ratchet Robotics
 *  Licensed under the BSD license.
 */

import org.junit.Test;
import org.ratchetrobotics.algorithms.mapping.FieldMap;

import java.io.IOException;
import java.io.StringReader;

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

}
