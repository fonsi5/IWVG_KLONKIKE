package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardStackTest {

    private CardStack StackTest;

    private Card Card1;

    private Card Card2;

    @Before
    public void initialize() {
        StackTest = new CardStack(3);
        Card1 = new Card('5', Suit.OROS);
        Card2 = new Card('K', Suit.BASTOS);
    }

    @Test
    public void isEmptyTest() {
        assertTrue(StackTest.isEmpty(1));
    }

    @Test
    public void pushTest() {
        StackTest = new CardStack(3);
        StackTest.push(Card1, 2);
        assertFalse(StackTest.isEmpty(2));
    }

    @Test
    public void exitKlondikeTest() {
        StackTest = new CardStack(3);
        assertFalse(StackTest.exitKlondike(3));
    }

    @Test
    public void popTest() {
        StackTest = new CardStack(3);
        StackTest.push(Card1, 1);
        StackTest.push(Card2, 1);
        assertEquals(Card2, StackTest.pop(1));
        assertEquals(Card1, StackTest.pop(1));
    }

    @Test
    public void topcardTest() {
        StackTest = new CardStack(3);
        StackTest.push(Card1, 1);
        StackTest.push(Card2, 1);
        assertEquals(Card2, StackTest.topCard(1));
    }

}
