package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TestHashSet {
    HashSet<Integer> is = new HashSet<>();

    @Before
    public void setUp() {
        for (int i=0; i<100; i++) {
            is.add(i);
        }
    }

    @Test
    public void testHashSet() {
        assertTrue(is.contains(5));
        assertFalse(is.isEmpty());
    }

    @Test
    public void testHashSet1() {
        is.remove(5);
        assertEquals(99, is.size());
    }
}
