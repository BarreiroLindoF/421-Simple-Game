package ch.hesge.flavio.dice;

import ch.hesge.flavio.dice.Dice;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DiceTest {

    @Test
    public void diceValueIsCorrect() {
        assertEquals(4, new Dice(4).getValue());
    }

    @Test
    public void randomIsBetween1And6() {
        Dice dice;
        for (int i = 0; i < 10; i++) {
            dice = new Dice();
            assertEquals((dice.getValue() >= 1 && dice.getValue() <= 6), true);
        }
    }

}
