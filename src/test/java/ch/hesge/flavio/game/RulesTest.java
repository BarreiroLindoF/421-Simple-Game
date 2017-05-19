package ch.hesge.flavio.game;

import ch.hesge.flavio.dice.*;
import java.util.ArrayList;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class RulesTest {

    @Test
    public void numberOfTriesCannotBeMoreThan3() {
        assertEquals(Rules.keepPlaying(4), false);
    }

    @Test
    public void canPlayWith1Try() {
        assertEquals(Rules.keepPlaying(1), true);
    }

    @Test
    public void canPlayWith2Tries() {
        assertEquals(Rules.keepPlaying(2), true);
    }

    @Test
    public void cannotPlayWith3Tries() {
        assertEquals(Rules.keepPlaying(3), false);
    }

    @Test
    public void testingWin() {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        dices.add(new Dice(4));
        dices.add(new Dice(2));
        dices.add(new Dice(1));
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }

    @Test
    public void winWithDifferentOrders() {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        dices.add(new Dice(1));
        dices.add(new Dice(4));
        dices.add(new Dice(2));
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }

    @Test
    public void winWith555() {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        dices.add(new Dice(5));
        dices.add(new Dice(5));
        dices.add(new Dice(5));
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), true);
    }

    @Test
    public void testingLostGame() {
        ArrayList<Dice> dices = new ArrayList<Dice>();
        dices.add(new Dice(1));
        dices.add(new Dice(1));
        dices.add(new Dice(2));
        Tumbler tumbler = new Tumbler(dices);
        assertEquals(Rules.victory(tumbler), false);
    }

}
