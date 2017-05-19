package ch.hesge.flavio.game;

import ch.hesge.flavio.player.Player;
import ch.hesge.flavio.dice.Tumbler;
import java.util.ArrayList;

public class Game {

    private int rounds = 0;
    private Tumbler tumbler;
    private ArrayList<Player> players;

    public Game() {
        tumbler = new Tumbler();
        players.add(new Player("Flavio"));
        players.add(new Player("John"));
    }

    public String play() {
        if (rounds >= 3) {
            return "No players have won the game!";
        }
        rounds++;
        for (Player player : players) {
            if (player.play(tumbler)) {
                return player.getName() + " has won the game!";
            }
        }
        return play();
    }
}
