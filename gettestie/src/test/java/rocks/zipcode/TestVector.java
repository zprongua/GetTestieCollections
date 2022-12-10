package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.Vector;

import static org.junit.Assert.*;

public class TestVector {
    Vector<Integer> iv = new Vector<>();

    @Before
    public void setUp() {
        Collections.addAll(iv, 1, 2, 3, 4, 5);
    }

    @Test
    public void testVector() {
        assertTrue(iv.contains(4));
        iv.add(6);
        assertEquals(6, iv.size());
    }

    @Test
    public void testVector1() {
        iv.add(6);
        iv.add(7);
        iv.add(8);
        iv.add(9);
        iv.add(10);
        iv.add(11);
        assertEquals(20, iv.capacity());
    }

    @Test
    public void testVector2() {
        iv.set(3, 51);

        assertEquals(51, (int) iv.get(3));
    }
}
