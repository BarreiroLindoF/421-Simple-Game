package ch.hesge.flavio.dice;

import java.util.ArrayList;

public class Tumbler {
    
    private ArrayList<Dice> dices;
    
    public Tumbler(){
        dices = new ArrayList<Dice>(3);
        createDices(3);
    }
    
    public Tumbler(int numberOfDices){
        dices = new ArrayList<Dice>(numberOfDices);
        createDices(numberOfDices);
    }    
    
    public Tumbler(ArrayList<Dice> dices){
        this.dices = dices;
    }
    
    private void createDices(int numberOfDices){
        for (int i = 0; i < numberOfDices; i++) {
            dices.add(new Dice());
        }
    }
    
    public void shakeTumbler(){
        for (Dice dice : dices){
            dice.roll();
        }
    }

    public int length(){
        return dices.size();
    }
    
    public ArrayList<Dice> getDices(){
        return dices;
    }
    
}
