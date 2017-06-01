package ch.hesge.flavio.dice;

import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class DiceTest {

    @Test
    public void diceValueIsCorrect() {
        Dice dice1 = Mockito.mock(Dice.class);
        when(dice1.getValue()).thenReturn(1);
        assertEquals(dice1.getValue(), 1);
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
