package models;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

    private Card cardTest;
    private Card cardTestS;

    @Before
    public void initialize() {
        cardTest = new Card('5', Suit.OROS);
        cardTestS = new Card('6', Suit.OROS);
    }
      
    @Test
    public void getSuiteTest() {
        assertEquals(Suit.OROS, cardTest.getSuite());
    }
    
    @Test
    public void getValueTest(){ 
        assertEquals('5', cardTest.getValue());
    }
    
    @Test
    public void getStateTest(){
        assertEquals(CardState.HIDEN, cardTest.getState());
    }    
    
    @Test
    public void CardFlipTest() {
        cardTest.CardFlip();
        assertEquals(CardState.SHOWN, cardTest.getState());
    }

    @Test
    public void moreValuedCardTest() {
        assertEquals('K', cardTest.moreValuedCard());    
    }

    @Test
    public void PaintTest() {
        if(CardState.HIDEN == cardTest.getState()){
          cardTest.CardFlip();  
        }
        
        assertEquals("[5,O]", cardTest.Paint()); 
    }
    @Test
    public void followsTest() {
        assertTrue(cardTest.follows(cardTestS));

    }        

}
