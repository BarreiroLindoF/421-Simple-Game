package ch.hesge.flavio;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DiceTest {
    
    @Test
    public void diceValueIsCorrect(){
        assertEquals(4, new Dice(4).getValue());
    }
    
}
