import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FatoresPrimosTest {

    @Test
    public void fatorial() {
        assertThat(fatorialOf(1), is(empty()));
        assertThat(fatorialOf(2), is(contains(2)));
        assertThat(fatorialOf(3), is(contains(3)));
        assertThat(fatorialOf(4), is(contains(2,2)));
        assertThat(fatorialOf(5), is(contains(5)));
        assertThat(fatorialOf(8), is(contains(2, 2, 2)));
        assertThat(fatorialOf(9), is(contains(3, 3)));
    }

    private List<Integer> fatorialOf(int n) {
        ArrayList<Integer> fatorial = new ArrayList<>();

        for (int divisor = 2; n > 1; divisor++) {
            for (; n % divisor == 0; n /= divisor) {
                fatorial.add(divisor);
            }
        }

        return fatorial;
    }
}
