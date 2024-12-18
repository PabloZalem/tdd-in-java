import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    Stack stack;

    @Before
    public void setup() {
        stack = new Stack();
    }

    @Test
    public void createStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushElement() {
        stack.push(0);
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void popElement() {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void getElementStack() {
        stack.push(0);
        stack.push(0);
        assertEquals(2, stack.getSize());
    }

    @Test
    public void throwUnderflowException() {
        assertThrows(Stack.UnderflowException.class,
                () -> stack.pop());
    }

    @Test
    public void pushXPopX() {
        stack.push(10);
        assertEquals(10, stack.pop());
        stack.push(20);
        assertEquals(20, stack.pop());
    }

    @Test
    public void pushXAndYPopYAndX() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void throwOverflowException() {
        stack.push(10);
        stack.push(20);
        assertThrows(Stack.OverflowException.class,
                () -> stack.push(30));
    }
}
