package ch.hesge.flavio;

import ch.hesge.flavio.game.Game;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(new Game().play());

        }
    }

}
