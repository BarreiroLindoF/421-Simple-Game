package ch.hesge.flavio.dice;

import ch.hesge.flavio.game.Rules;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TumblerTest {

    Tumbler tumbler;
    
    @BeforeTest
    public void creatingTumbler(){
        ArrayList<Dice> dices = new ArrayList<Dice>();
        dices.add(new Dice(1));
        dices.add(new Dice(5));
        dices.add(new Dice(3));
        tumbler = new Tumbler(dices);
    }
    
    @Test
    public void numberOfDicesMatches(){
        assertEquals(3, new Tumbler(3).length());
    }
    
    @Test
    public void containsIsWorking(){
        assertEquals(Rules.contains(tumbler, 1), true);
        assertEquals(Rules.contains(tumbler, 5), true);
        assertEquals(Rules.contains(tumbler, 3), true);
        assertEquals(Rules.contains(tumbler, 2), false);
    }
    
}