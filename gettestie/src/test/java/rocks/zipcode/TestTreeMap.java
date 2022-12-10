package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class TestTreeMap {
    TreeMap<String, Integer> tm = new TreeMap<>();

    @Before
    public void setUp() {
        tm.put("violin", 1);
        tm.put("guitar", 2);
        tm.put("banjo", 3);
        tm.put("oboe", 4);
    }

    @Test
    public void testTreeMap() {
        tm.replace("banjo", 3, 51);

        assertEquals(51, (int) tm.get("banjo"));
        tm.clear();
        assertTrue(tm.isEmpty());
    }

    @Test
    public void testTreeMap1() {
        Collection<Integer> col = tm.values();
        assertTrue(col.contains(3));
    }
}
