package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

import static org.junit.Assert.*;

public class TestArrayDeque {
    ArrayDeque<Integer> ad = new ArrayDeque<>();

    @Before
    public void setUp() {
        for (int i=0; i<100; i++) {
            ad.add(i);
        }
    }

    @Test
    public void testArrayDeque() {
        ad.add(5);
        ad.addFirst(51);

        assertEquals(51, (int) ad.getFirst());
        assertEquals(102, ad.size());
    }

    @Test
    public void testArrayDeque1() {
        ad.removeIf(o -> o > 50);

        assertEquals(50, (int) ad.getLast());
    }
}
