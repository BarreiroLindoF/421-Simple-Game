package ch.hesge.flavio.game;

import ch.hesge.flavio.dice.Dice;
import ch.hesge.flavio.dice.Tumbler;

public class Rules {

    private static final int MAX_ROUNDS = 3;

    public static boolean keepPlaying(int tries) {
        return tries < MAX_ROUNDS;
    }

    public static boolean contains(Tumbler tumbler, int value) {      
        for (Dice dice : tumbler.getDices()) {
            if (dice.getValue() == value) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean contains421(Tumbler tumbler) {
        return contains(tumbler, 4) && contains(tumbler, 2) && contains(tumbler, 1);
    }
    
    public static boolean contains555(Tumbler tumbler){
        for (Dice dice : tumbler.getDices()){
            if (dice.getValue() != 5){
                return false;
            }
        }
      return true;
    }

    public static boolean victory(Tumbler tumbler) {
        return contains421(tumbler) || contains555(tumbler);
    }

}
