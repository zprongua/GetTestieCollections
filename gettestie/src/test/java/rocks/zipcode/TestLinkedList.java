package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.junit.Assert.*;

public class TestLinkedList {
    List<Integer> ls = new LinkedList<>();

    @Before
    public void setUp() {
        for (int i=0; i<100; i++) {
            ls.add(i);
        }
    }

    @Test
    public void testLinkedList1() {
        for (int i=0; i<100; i++) {
            ls.add(i);
        }

        assertEquals(50, (int) ls.get(50));
        assertFalse(ls.isEmpty());


        ls.remove(50);
        assertEquals(51, (int) ls.get(50));

    }

    @Test
    public void testLinkedList2() {
        assertEquals(100, ls.size());

        ls.clear();

        assertEquals(0, ls.size());
    }
}
