package controllers;

import models.Game;
import views.GameView;
import models.CardState;

public class FoundationToTableauController extends ActionController {

    public FoundationToTableauController(Game game) {
        super(game);
    }

    public boolean movePossible(int suit, int stair) {
        if (super.isEmptyFoundation(suit)) {
            return false;
        } else {
            if (super.lastCardFoundation(suit).follows(super.lastCardStair(stair))
                    || super.lastCardStair(stair).getState() == CardState.HIDEN) {
                return true;
            }
        }
        return false;
    }

    public void FoundationToTableau(int suit, int stair) {
        super.pushTableau(stair, super.popFoundation(suit));
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }
}
