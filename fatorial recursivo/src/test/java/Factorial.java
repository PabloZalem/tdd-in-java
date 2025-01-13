import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial {
    @Test
    public void factorial() {
        assertEquals(1, factor(0));
        assertEquals(1, factor(1));
        assertEquals(2, factor(2));
        assertEquals(6, factor(3));
        assertEquals(24, factor(4));
    }

    private int factor(int n) {
        if (n < 2) return 1;
        return factor(n - 1) * n;
    }
}