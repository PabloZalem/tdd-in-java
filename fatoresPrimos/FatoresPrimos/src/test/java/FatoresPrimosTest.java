import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FatoresPrimosTest {
    @Test
    public void factores() {
        assertThat(factor(1), is(empty()));
        assertThat(factor(2), is(contains(2)));
        assertThat(factor(3), is(contains(3)));
        assertThat(factor(4), is(contains(2, 2)));
        assertThat(factor(8), is(contains(2, 2, 2)));
        assertThat(factor(9), is(contains(3, 3)));
        assertThat(factor(180), is(contains(2, 2, 3, 3, 5)));
    }

    private List<Integer> factor(int n) {
        ArrayList<Integer> factor = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                factor.add(divisor);
            }
        }

        return factor;
    }
}
