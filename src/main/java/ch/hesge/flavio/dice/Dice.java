package ch.hesge.flavio.dice;

public class Dice {

    private int value;

    public Dice() {
        roll();
    }

    public Dice(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        value = (int) (Math.random() * 6 + 1);
    }

}
