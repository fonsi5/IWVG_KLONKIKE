package controllers;

import models.Game;
import views.GameView;

public class DiscardController extends ActionController {

    public DiscardController(Game game) {
        super(game);
    }

    public void DiscardCard() {
        super.lastCardDeck().CardFlip();
        super.pushWaste(super.popDeck());
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}