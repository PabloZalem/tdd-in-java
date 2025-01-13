import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FatoresPrimosTest {
    @Test
    public void factoresPrime() {
        assertThat(factor(1), is(empty()));
        assertThat(factor(2), is(contains(2)));
        assertThat(factor(3), is(contains(3)));
        assertThat(factor(4), is(contains(2, 2)));
        assertThat(factor(8), is(contains(2, 2, 2)));
        assertThat(factor(9), is(contains(3, 3)));
    }

    private List<Integer> factor(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        int divisor = 2;

        while (n > 1) {
            while (n % divisor == 0) {
                factors.add(divisor);
                n /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
