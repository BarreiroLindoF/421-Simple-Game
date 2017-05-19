package ch.hesge.flavio;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class RulesTest {
    
    @Test
    public void numberOfTriesCannotBeMoreThan3(){
        assertEquals(Rules.keepPlaying(4), false);
    }
    
    @Test
    public void canPlayWith1Try(){
        assertEquals(Rules.keepPlaying(1), true);
    }
    
    @Test
    public void canPlayWith2Tries(){
        assertEquals(Rules.keepPlaying(2), true);        
    }
    
    @Test
    public void cannotPlayWith3Tries(){
        assertEquals(Rules.keepPlaying(3), false);
    }
    
    @Test
    public void testingWin(){
        Dice[] dices = {new Dice(1), new Dice(2), new Dice(4)};
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }
    
    @Test
    public void winWithDifferentOrders(){
        Dice[] dices = {new Dice(4), new Dice(1), new Dice(2)};
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }
    
    @Test
    public void winWith555(){
        Dice[] dices = {new Dice(5), new Dice(5), new Dice(5)};
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }
    
    @Test
    public void testingLostGame(){
        Dice[] dices = {new Dice(1), new Dice(1), new Dice(2)};
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), false);
    }
    
}
