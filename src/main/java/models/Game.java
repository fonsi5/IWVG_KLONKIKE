package models;

public class Game {

    private Deck deck;
    private Deck waste;
    private CardStack tableau;
    private CardStack foundation;

    public static final int OPTIONS = 9;
    public static final int NUMSUITS = 4;
    public static final int NUMTABLEU = 7;

    public Game() {
        deck = new Deck();
        waste = new Deck();
        tableau = new CardStack(NUMTABLEU);
        foundation = new CardStack(NUMSUITS);
    }

    public Deck getDeck() {
        return deck;
    }

    public void putCardonDeck(Card target) {
        deck.push(target);
    }

    public void putCardonWaste(Card target) {
        waste.push(target);
    }

    public Deck getWaste() {
        return waste;
    }

    public CardStack getTableau() {
        return tableau;
    }

    public CardStack getFoundation() {
        return foundation;
    }

    public boolean exitKlondike() {
        return foundation.exitKlondike(NUMSUITS);
    }

    public int getNumOptions() {
        return OPTIONS;
    }

    public void fillDeck() {
        deck.fillDeck();
    }

    public void fillTableau() {
        tableau.fillTableau(NUMTABLEU, deck);
    }

    public void pushTableau(int nPosTabl, Card NewCard) {
        tableau.push(NewCard, nPosTabl);
    }

    public boolean isEmptyDeck() {
        return deck.isEmpty();
    }

    public boolean isWasteempty() {
        return waste.isEmpty();
    }

    public void pushWaste(Card NewCard) {
        waste.push(NewCard);
    }

    public Card popDeck() {
        return deck.pop();
    }

    public Card popWaste() {
        return waste.pop();
    }

    public int getNumTableaus() {
        return NUMTABLEU;
    }

    public Card lastCardWaste() {
        return waste.getLastCard();
    }

    public Card lastCardDeck() {
        return deck.getLastCard();
    }

    public Card lastCardStair(int nTableau) {
        return tableau.topCard(nTableau);
    }

    public Boolean isEmptyStair(int nTableau) {
        return tableau.isEmpty(nTableau);
    }

    public Boolean isEmptyFoundation(Suit st) {
        return foundation.isEmpty(st);
    }

    public Boolean isEmptyFoundation(int nFoun) {
        return foundation.isEmpty(nFoun);
    }

    public Card lastCardFoundation(Suit st) {
        return tableau.topCard(st);
    }

    public Card lastCardFoundation(int nFou) {
        return tableau.topCard(nFou);
    }

    public void pushFoundation(Suit st, Card NewCard) {
        foundation.push(NewCard, st);
    }

    public Card popTableau(int nTableau) {
        return tableau.pop(nTableau);
    }

    public Card popFoundation(int nFou) {
        return tableau.pop(nFou);
    }

}