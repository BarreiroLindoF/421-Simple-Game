package ch.hesge.flavio;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TumblerTest {

    Tumbler tumbler;
    
    @BeforeTest
    public void creatingTumbler(){
        Dice[] dices = {new Dice(1), new Dice(5), new Dice(3)};
        tumbler = new Tumbler(dices);
    }
    
    @Test
    public void numberOfDicesMatches(){
        assertEquals(3, new Tumbler(3).length());
    }
    
    @Test
    public void containsIsWorking(){
        assertEquals(tumbler.contains(1), true);
        assertEquals(tumbler.contains(5), true);
        assertEquals(tumbler.contains(3), true);
        assertEquals(tumbler.contains(2), false);
    }
    
}