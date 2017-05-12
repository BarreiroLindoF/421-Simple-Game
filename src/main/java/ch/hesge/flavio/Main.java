package ch.hesge.flavio;

public class Main {
    
    private static int tries = 0;
    private static final int MAX_TRIES = 3;
    
    private static boolean has(int value, Dice[] dices){
        for (Dice dice : dices){
            if (dice.getValue() == value) return true;
        }
        return false;
    }
        
    private static boolean victory(Dice[] dices){
        return has(4, dices) && has(2, dices) && has(1, dices);
    }
        
    private static void rollDices(Dice[] dices){
        for (Dice dice : dices){
            dice.roll();
        }
    }
    
    private static void newTry(Dice[] dices){
        tries++;
        rollDices(dices);
        
        if (victory(dices)){
            System.out.println("Gagné!");
        } else {
            if (tries < MAX_TRIES){
                newTry(dices);
            } else {
                System.out.println("Perdu!");
            }
        }
    }
    
    private static void getNewDices(Dice[] dices){
        for (int i = 0; i < 3; i++) {
            dices[i] = new Dice();
        }
    }
    
    public static void main( String[] args ){
        Dice[] dices = new Dice[3];
        getNewDices(dices);
        newTry(dices);
    }
}
