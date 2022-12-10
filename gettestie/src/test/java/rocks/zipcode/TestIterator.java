package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import static org.junit.Assert.*;

public class TestIterator {
    Collection<Person> cp = new ArrayList<>();

    @Before
    public void setUp() {
        cp.add(new Person("Moe", 1932));
        cp.add(new Person("Larry", 1931));
        cp.add(new Person("Curly", 1933));
    }

    @Test
    public void testIterator() {
        Iterator<Person> it = cp.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        assertEquals("Moe", cp.iterator().next().getName());
    }
}
