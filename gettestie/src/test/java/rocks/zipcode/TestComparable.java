package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TestComparable {
    List<Person> pl = new ArrayList<>();

    @Before
    public void setUp() {
        pl.add(new Person("Zach", 1988));
        pl.add(new Person("Charlie", 1972));
        pl.add(new Person("Jack", 1951));
    }

    @Test
    public void testComparable() {
        Person expected = pl.get(2);
        Collections.sort(pl);

        Person actual = pl.get(0);
        assertEquals(expected, actual);
    }
}
