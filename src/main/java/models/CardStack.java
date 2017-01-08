package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardStack {

    private Map<Integer, List<Card>> cards;

    public CardStack(int numStacks) {
        this.cards = new HashMap<>();
        for (int i = 0; i < numStacks; i++) {
            this.cards.put(i, new ArrayList<Card>(i));
        }
    }

    public void push(Card card, int stair) {
        assert card != null;
        this.cards.get(stair).add(card);
    }

    public void push(Card card, Suit st) {
        assert card != null;
        this.cards.get(st.ordinal()).add(card);
    }

    public Card pop(int pos) {
        assert pos > 0 && this.cards.size() >= pos;
        Card CardPoped;
        CardPoped = this.cards.get(pos).get(cards.get(pos).size() - 1);
        cards.get(pos).remove(cards.get(pos).size() - 1);
        return CardPoped;
    }

    public boolean exitKlondike(int SUITES) {
        for (int i = 0; i < SUITES; i++) {

            if (this.cards.get(i).isEmpty() || this.cards.get(i).get(this.cards.size() - 1).getValue() != this.cards.get(i)
                    .get(this.cards.size() - 1).moreValuedCard()) {
                return false;
            }

        }
        return true;
    }

    public void fillTableau(int NUMTABLEU, Deck deckIni) {

        for (int i = 0; i < NUMTABLEU; i++) {
            for (int j = i; j < NUMTABLEU; j++) {
                this.push(deckIni.pop(), i);
            }
            this.topCard(i).CardFlip();

        }
    }

    public Card topCard(int tableu) {
        return this.cards.get(tableu).get(this.cards.get(tableu).size() - 1);
    }

    public Card topCard(Suit type) {
        return this.cards.get(type.ordinal()).get(this.cards.get(type).size() - 1);
    }

    public boolean isEmpty(Suit type) {
        return this.cards.get(type.ordinal()).isEmpty();
    }

    public boolean isEmpty(int suit) {
        return this.cards.get(suit).isEmpty();
    }

    public Map<Integer, List<Card>> getCards() {
        return this.cards;
    }

    public int size() {
        return this.cards.size();
    }

}