package ch.hesge.flavio.dice;

import ch.hesge.flavio.dice.Dice;
import java.util.ArrayList;

public class Tumbler {
    
    private ArrayList<Dice> dices;
    
    public Tumbler(){
        dices = new ArrayList<Dice>(3);
        createDices();
    }
    
    public Tumbler(int numberOfDices){
        dices = new ArrayList<Dice>(numberOfDices);
        createDices();
    }    
    
    public Tumbler(ArrayList<Dice> dices){
        this.dices = dices;
    }
    
    private void createDices(){
        for (int i = 0; i < dices.size(); i++) {
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
