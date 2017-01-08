package models;

import java.util.Arrays;
import java.util.List;

public class Card {

    private Suit cardSuit;

    private char cardValue;

    private CardState cardPosition;

    public static final List<Character> NumCardlist = Arrays.asList('A', '2', '3', '4', '5', '6', '7', '8', '9', 'J', 'Q', 'K');

    public Card() {
    }

    public Card(char Crdvalue, Suit CrdSuit) {
        assert NumCardlist.contains(Crdvalue);
        this.cardSuit = CrdSuit;
        this.cardValue = Crdvalue;
        this.cardPosition = CardState.HIDEN;
    }

    public Suit getSuite() {
        return this.cardSuit;
    }

    public char getValue() {
        return this.cardValue;
    }

    public CardState getState() {
        return this.cardPosition;

    }

    public void CardFlip() {
        if (this.cardPosition == CardState.SHOWN) {
            this.cardPosition = CardState.HIDEN;
        } else {
            this.cardPosition = CardState.SHOWN;
        }
    }

    public char moreValuedCard() {
        return NumCardlist.get(NumCardlist.size() - 1);
    }

    public String Paint() {
        if (this.cardPosition == CardState.HIDEN) {
            return "[";
        } else {
            return "[" + this.cardValue + "," + this.cardSuit.getValue() + "]";
        }
    }

    public boolean follows(Card card) {

        System.out.print(NumCardlist.indexOf(card.cardValue));

        System.out.print(NumCardlist.indexOf(this.cardValue));
        System.out.println(NumCardlist.indexOf(card.cardValue) - NumCardlist.indexOf(this.cardValue) == 1);
        if (NumCardlist.indexOf(card.cardValue) - NumCardlist.indexOf(this.cardValue) == 1 || card == null) {
            return true;
        }
        return false;
    }

}