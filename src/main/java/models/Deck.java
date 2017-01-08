package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<Card>();
    }

    public Card getCard(int pos) {
        assert pos <= this.cards.size();
        return this.cards.get(pos);
    }

    public Card getLastCard() {
        return this.cards.get(this.cards.size() - 1);
    }

    public void push(Card card) {
        this.cards.add(card);
    }

    public Card pop() {
        return this.cards.remove(this.cards.size() - 1);
    }

    public boolean isEmpty() {
        return this.cards.isEmpty();
    }

    public List<Card> getList() {
        return this.cards;
    }

    private void shufleDeck() {
        Collections.shuffle(this.cards);
    }

    public void fillDeck() {
        assert true == this.cards.isEmpty();

        for (char elem : Card.NumCardlist) {
            this.push(new Card(elem, Suit.BASTOS));
            this.push(new Card(elem, Suit.OROS));
            this.push(new Card(elem, Suit.COPAS));
            this.push(new Card(elem, Suit.ESPADAS));
        }

        this.shufleDeck();
    }

}