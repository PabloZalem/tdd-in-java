import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowilgTest {
    Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void gutterGame() {
        rollMany(0, 20);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        rollMany(1, 20);
        assertEquals(20, game.score());
    }

    @Test
    public void spare() {
        spares();
        game.roll(7);
        rollMany(17, 0);
        assertEquals(24, game.score());
    }

    @Test
    public void strike() {
        strikes();
        game.roll(2);
        game.roll(3);
        rollMany(16, 0);
        assertEquals(20, game.score());
    }

    private void strikes() {
        game.roll(10);
    }

    private void spares() {
        rollMany(2, 5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}
