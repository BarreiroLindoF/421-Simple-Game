package ch.hesge.flavio.player;

import ch.hesge.flavio.dice.Dice;
import ch.hesge.flavio.dice.Tumbler;
import java.util.ArrayList;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PlayerTest {
    
    ArrayList<Dice> dices;
    Tumbler tumbler;
    Player player;
    
    @BeforeTest
    public void init(){
        dices = new ArrayList<Dice>();
        
        Dice dice1 = Mockito.mock(Dice.class);
        when(dice1.getValue()).thenReturn(1);
        dices.add(dice1);
                
        Dice dice2 = Mockito.mock(Dice.class);
        when(dice2.getValue()).thenReturn(2);
        dices.add(dice2);
        
        Dice dice4 = Mockito.mock(Dice.class);
        when(dice4.getValue()).thenReturn(4);
        dices.add(dice4);
        
        tumbler = new Tumbler(dices);
        player = new Player("Test player");
    }

    @Test
    public void test(){
        assertEquals(player.play(tumbler), true);
    }
    
}