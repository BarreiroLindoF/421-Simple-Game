package ch.hesge.flavio.player;

import ch.hesge.flavio.dice.Tumbler;
import ch.hesge.flavio.game.Rules;

public class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public boolean play(Tumbler tumbler) {
        tumbler.shakeTumbler();
        return Rules.victory(tumbler);
    }

    public String getName() {
        return name;
    }

}
