package ch.hesge.flavio;

public class Rules {

    private static final int MAX_TRIES = 3;

    public static boolean keepPlaying(int tries) {
        return tries < MAX_TRIES;
    }

    private static boolean contains421(Tumbler tumbler) {
        return tumbler.contains(4) && tumbler.contains(2) && tumbler.contains(1);
    }
    
    private static boolean contains555(Tumbler tumbler){
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
