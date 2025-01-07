import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowilgTest {
    Game game = new Game();

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
    public void spares() {
        spare();
        game.roll(7);
        rollMany(17, 0);
        assertEquals(24, game.score());
    }

    @Test
    public void strikes() {
        strike();
        game.roll(2);
        game.roll(3);
        rollMany(16, 0);
        assertEquals(20, game.score());
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);
        assertEquals(300, game.score());
    }

    private void strike() {
        game.roll(10);
    }

    private void spare() {
        rollMany(2, 5);
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            game.roll(pins);
        }
    }
}
