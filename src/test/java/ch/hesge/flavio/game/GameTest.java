package ch.hesge.flavio.game;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class GameTest {

    @Test
    public void itShouldReturnWonOrLost(){
        String s = new Game().play();
        boolean b = (s.contains(" has won the game!") || "No players have won the game!".equals(s));
        assertEquals(b, true);
    }
    
}
