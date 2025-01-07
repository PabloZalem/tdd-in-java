public class Game {

    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0; // Inicializa a pontuação
        int i = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(i)) { // Strike
                score += 10 + rolls[i + 1] + rolls[i + 2];
                i++; // Avança apenas 1 posição para um strike
            } else if (isSpare(i)) { // Spare
                score += 10 + rolls[i + 2];
                i += 2; // Avança 2 posições para um spare
            } else { // Jogada normal
                score += rolls[i] + rolls[i + 1];
                i += 2; // Avança 2 posições
            }
        }

        return score;
    }


    private boolean isStrike(int i) {
        return rolls[i] == 10;
    }

    private boolean isSpare(int i) {
        return rolls[i] + rolls[i + 1] == 10;
    }
}
