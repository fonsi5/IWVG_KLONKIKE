package controllers;

import views.GameView;
import models.Game;
import models.Suit;

public class TableauToFoundationController extends ActionController {

    public TableauToFoundationController(Game game) {
        super(game);
    }

    public boolean movePossible(int stair) {
        if (super.isEmptyStair(stair)) {
            return false;
        } else if (super.isEmptyFoundation(super.lastCardStair(stair).getSuite()) && super.lastCardStair(stair).getValue() == 'A') {
            return true;
        } else {

            if (super.lastCardFoundation(super.lastCardStair(stair).getSuite()).follows(lastCardStair(stair))) {
                return true;
            }
        }
        return false;
    }

    public void TableauToFoundation(int stair) {

        Suit SuitCardToMove;
        SuitCardToMove = lastCardStair(stair).getSuite();
        super.pushFoundation(SuitCardToMove, super.popTableau(stair));
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}