package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DeckTest {

    private Deck DeckTest;

    private Card Card1;

    private Card Card2;

    @Before
    public void initialize() {
        DeckTest = new Deck();
        Card1 = new Card('5', Suit.OROS);
        Card2 = new Card('3', Suit.BASTOS);
    }

    @Test
    public void isEmptyTest() {
        assertTrue(DeckTest.isEmpty());
    }

    @Test
    public void fillDeckTest() {
        DeckTest.fillDeck();
        assertFalse(DeckTest.isEmpty());
    }

    @Test
    public void getCardTest() {
        if (DeckTest.isEmpty()) {
            DeckTest.fillDeck();
        }
        assertNotNull(DeckTest.getCard(1));
    }

    @Test
    public void pushTest() {
        DeckTest = new Deck();
        DeckTest.push(Card1);
        assertFalse(DeckTest.isEmpty());

    }

    @Test
    public void getLastCardTest() {
        DeckTest = new Deck();
        DeckTest.push(Card1);
        DeckTest.push(Card2);
        assertEquals(DeckTest.getLastCard(), Card2);
    }

    @Test
    public void popTest() {
        DeckTest = new Deck();
        DeckTest.push(Card1);
        DeckTest.push(Card2);
        assertEquals(DeckTest.pop(), Card2);
        assertEquals(DeckTest.getLastCard(), Card1);
    }

}
