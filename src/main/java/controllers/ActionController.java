package controllers;

import models.Game;
import views.GameView;
import models.Card;
import models.Suit;

public abstract class ActionController extends Controller {

    private Game game;

    public ActionController(Game game) {
        super(game);
        this.game = game;
    }

    protected Card popDeck() {
        return game.popDeck();
    }
    
    protected Card popWaste() {
        return game.popWaste();
    }

    protected void pushWaste(Card NewCard) {
        game.pushWaste(NewCard);
    }

    public boolean isDeckempty() {
        return game.isEmptyDeck();
    }

    public boolean isWasteempty() {
        return game.isWasteempty();
    }

    public Card lastCardWaste() {
        return game.lastCardWaste();
    }

    protected Card lastCardDeck() {
        return game.lastCardDeck();
    }

    public Card lastCardStair(int nTableau) {
        return game.lastCardStair(nTableau);
    }

    protected Boolean isEmptyStair(int nTableau) {
        return game.isEmptyStair(nTableau);
    }

    protected Boolean isEmptyFoundation(Suit st) {
        return game.isEmptyFoundation(st);
    }

    protected Boolean isEmptyFoundation(int nFoun) {
        return game.isEmptyFoundation(nFoun);
    }

    protected Card lastCardFoundation(Suit st) {
        return game.lastCardFoundation(st);
    }

    protected Card lastCardFoundation(int nFoun) {
        return game.lastCardFoundation(nFoun);
    }

    protected void pushFoundation(Suit st, Card NewCard) {
        game.pushFoundation(st, NewCard);
    }

    protected Card popFoundation(int nFoun) {
        return game.popFoundation(nFoun);
    }

    protected Card popTableau(int nTableau) {
        return game.popTableau(nTableau);
    }

    public abstract void accept(GameView gameView);
}