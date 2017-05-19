package ch.hesge.flavio;

public class Tumbler {
    
    private Dice[] dices;
    
    public Tumbler(){
        dices = new Dice[3];
        createDices();
    }
    
    public Tumbler(int numberOfDices){
        dices = new Dice[numberOfDices];
        createDices();
    }    
    
    public Tumbler(Dice[] dices){
        this.dices = dices;
    }
    
    private void createDices(){
        for (int i = 0; i < dices.length; i++) {
            dices[i] = new Dice();
        }
    }
    
    public boolean contains(int value) {
        for (Dice dice : dices) {
            if (dice.getValue() == value) {
                return true;
            }
        }
        return false;
    }
            
    public void shakeTumbler(){
        for (Dice dice : dices){
            dice.roll();
        }
    }

    public int length(){
        return dices.length;
    }
    
    public Dice[] getDices(){
        return dices;
    }
    
}
