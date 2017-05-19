package ch.hesge.flavio;

public class ListOfDices {
    
    
    private Dice[] dices;
    
    public ListOfDices(){
        dices = new Dice[3];
        createDices();
    }
    
    public ListOfDices(int numberOfDices){
        dices = new Dice[numberOfDices];
        createDices();
    }    
    
    private void createDices(){
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
        }
    }
    
    private boolean contains(int value) {
        for (Dice dice : dices) {
            if (dice.getValue() == value) {
                return true;
            }
        }
        return false;
    }
        
    public boolean victory() {
        return contains(4) && contains(2) && contains(1);
    }
    
    public void rollDices(){
        for (Dice dice : dices){
            dice.roll();
        }
    }

    public int length(){
        return dices.length;
    }
    
}
