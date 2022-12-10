package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;

public class TestPriorityQueue {
    PriorityQueue<Integer> pqi = new PriorityQueue<>();

    @Before
    public void setUp() {
        for (int i=0; i<100; i++) {
            pqi.add(i);
        }
    }

    @Test
    public void testPriorityQueue() {
        assertEquals(0, (int) pqi.poll());
        for (int i=0; i<50; i++) {
            pqi.poll();
        }
        pqi.add(25);
        assertEquals(25, (int) pqi.poll());
    }

    @Test
    public void testPriorityQueue1() {
        assertTrue(pqi.offer(50));
        assertEquals(0, (int) pqi.peek());
    }
}
