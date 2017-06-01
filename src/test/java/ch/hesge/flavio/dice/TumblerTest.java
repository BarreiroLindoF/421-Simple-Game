package ch.hesge.flavio.dice;

import ch.hesge.flavio.game.Rules;
import java.util.ArrayList;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TumblerTest {

    Tumbler tumbler;
    
    @BeforeTest
    public void creatingTumbler(){
        ArrayList<Dice> dices = new ArrayList<Dice>();
        
        Dice dice1 = Mockito.mock(Dice.class);
        when(dice1.getValue()).thenReturn(1);
        dices.add(dice1);
                
        Dice dice3 = Mockito.mock(Dice.class);
        when(dice3.getValue()).thenReturn(3);
        dices.add(dice3);
        
        Dice dice5 = Mockito.mock(Dice.class);
        when(dice5.getValue()).thenReturn(5);
        dices.add(dice5);
        
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