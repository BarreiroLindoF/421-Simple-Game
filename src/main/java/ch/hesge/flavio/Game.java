package ch.hesge.flavio;

public class Game {

    private int tries = 0;
    private final int MAX_TRIES = 3;
    
    private Dice[] dices = new Dice[3];

    public Game() {
        for (int i = 0; i < 3; i++) {
            dices[i] = new Dice();
        }
    }
    
    public boolean has(int value, Dice[] dices) {
        for (Dice dice : dices) {
            if (dice.getValue() == value) {
                return true;
            }
        }
        return false;
    }

    public boolean victory(Dice[] dices) {
        return has(4, dices) && has(2, dices) && has(1, dices);
    }

    public void rollDices(Dice[] dices) {
        for (Dice dice : dices) {
            dice.roll();
        }
    }

    public String play() {
        tries++;
        rollDices(dices);
        if (victory(dices)) {
            return "Gagné!";
        } else {
            if (tries < MAX_TRIES) {
                return play();
            }
        }
        return "Perdu!";
    }
}
