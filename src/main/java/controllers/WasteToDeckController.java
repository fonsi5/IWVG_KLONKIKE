package controllers;

import views.GameView;
import models.Card;
import models.Game;

public class WasteToDeckController extends ActionController {

    public WasteToDeckController(Game game) {
        super(game);
    }

    public void WasteToDeck() {
        Card CardToMove;
        CardToMove = super.popWaste();
        CardToMove.CardFlip();
        super.pushWaste(CardToMove);

    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}
