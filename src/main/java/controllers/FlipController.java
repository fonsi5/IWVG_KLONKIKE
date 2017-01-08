package controllers;

import models.Game;
import views.GameView;
import models.CardState;

public class FlipController extends ActionController {

    public FlipController(Game game) {
        super(game);
    }

    public boolean movePossible(int stair) {
        if (super.lastCardStair(stair).getState() == CardState.HIDEN) {
            return true;
        } else {
            return false;
        }
    }

    public void flipCard(int stair) {
        this.lastCardStair(stair).CardFlip();
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}
