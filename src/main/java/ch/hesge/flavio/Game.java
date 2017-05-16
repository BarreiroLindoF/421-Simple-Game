package ch.hesge.flavio;

public class Game {

    private int tries = 0;
    private final int MAX_TRIES = 3;

    private ListOfDices listOfDices;

    public Game() {
        listOfDices = new ListOfDices();
    }

    public String play() {
        tries++;
        listOfDices.rollDices();
        if (listOfDices.victory()) {
            return "Won!";
        } else if (tries < MAX_TRIES) {
            return play();
        }
        return "Lost!";
    }
}
