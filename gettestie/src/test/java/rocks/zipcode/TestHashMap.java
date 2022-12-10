package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class TestHashMap {
    HashMap<Integer, String> hm = new HashMap<>();

    @Before
    public void setUp() {
        hm.put(1, "violin");
        hm.put(2, "piano");
        hm.put(3, "guitar");
        hm.put(4, "banjo");
    }

    @Test
    public void testHashMap() {
        assertTrue(hm.containsKey(1));
        assertTrue(hm.containsValue("banjo"));
    }

    @Test
    public void testHashMap1() {
        assertFalse(hm.isEmpty());
        assertEquals("piano", hm.get(2));
    }
}
