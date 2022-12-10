package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.TreeSet;

import static org.junit.Assert.*;

public class TestTreeSet {
    TreeSet<String> st = new TreeSet<>();

    @Before
    public void setUp() {
        st.add("violin");
        st.add("piano");
        st.add("guitar");
    }

    @Test
    public void testTreeSet() {
        assertNotNull(st.ceiling("banjo"));

        String first = st.pollFirst();
        assertEquals("guitar", first);
        assertEquals("piano", st.pollFirst());
        for (String s : st) {
            System.out.println(s);
        }
    }

    @Test
    public void testTreeSet1() {
        TreeSet<String> reverse = (TreeSet<String>) st.descendingSet();
        assertEquals(3, reverse.size());

        for (String s : reverse) {
            System.out.println(s);
        }
    }
}
