package ch.hesge.flavio;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ListOfDicesTest {

    @Test
    public void numberOfDicesMatches(){
        assertEquals(3, new ListOfDices(3).length());
    }
    
}
