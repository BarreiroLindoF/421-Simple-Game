package ch.hesge.flavio;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class GameTest {

    @Test
    public void itShouldReturnWonOrLost(){
        String s = new Game().play();
        boolean b = ("Won!".equals(s) || "Lost!".equals(s));
        assertEquals(b, true);
    }
    
}
