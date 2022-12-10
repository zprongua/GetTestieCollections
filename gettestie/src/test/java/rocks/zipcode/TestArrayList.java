package rocks.zipcode;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TestArrayList {
    ArrayList<String> al = new ArrayList<>();

    @Before
    public void setUp() {
        al.add("Steve");
        al.add("John");
        al.add("Gary");
        al.add("Alan");
        al.add("Bob");
    }

    @Test
    public void testArraylist() {
        assertTrue(al.contains("Bob"));
        assertEquals(5, al.size());
        al.add("Gerry");
        al.remove("Gerry");
    }

    @Test
    public void testArrayList1() {
        al.remove(3);

        assertEquals("Bob", al.get(3));
    }
}
