package rocks.zipcode;

import org.junit.*;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {
    Stack<String> stack = new Stack<>();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestStack1() {
        stack.push("Hello world");
        assertFalse(stack.isEmpty()); // false
    }

    @Test
    public void TestStack2() {
        stack.push("HumptyDumpty");
        assertEquals("HumptyDumpty", stack.pop());
    }

    @Test
    public void TestStack3() {
        stack.push("Hello world");
        assertEquals("Hello world", stack.peek());
    }


    // Make a bigger test exercising more Stack methods.....
}
