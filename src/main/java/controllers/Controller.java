package controllers;

import models.Game;
import models.Card;
import models.CardStack;
import models.Deck;

public abstract class Controller {

    private Game game;
    private  boolean Playing;

    protected Controller(Game game) {
        assert game != null;
        this.game = game;
    }

    public Game getGame() {
        return game;
    }    
    
    public Deck getWaste() {
        return game.getWaste();
    }

    public Deck getDeck() {
        return game.getDeck();
    }

    public CardStack getTableau() {
        return game.getTableau();
    }

    public CardStack getFoundation() {
        return game.getFoundation();
    }

    public boolean exitKlondike() {
        return game.exitKlondike();
    }

    protected void putCardonDeck(Card target) {
        game.putCardonDeck(target);

    }

    protected void fillDeck() {
        game.fillDeck();

    }

    protected void fillTableau() {
        game.fillTableau();

    }

    protected void pushTableau(int nPosTable, Card NewCard) {
        game.pushTableau(nPosTable, NewCard);
    }

    public int getNumTableaus() {
        return game.getNumTableaus();
    }

    public boolean getPlaying() {
        return Playing;
    }

    public void setPlaying(boolean playing) {
        Playing = playing;
    }

}