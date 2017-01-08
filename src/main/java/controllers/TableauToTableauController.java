package controllers;

import views.GameView;
import models.Game;

public class TableauToTableauController extends ActionController {

    public TableauToTableauController(Game game) {
        super(game);
    }

    public boolean movePossible(int orStair, int deStair) {
        if (super.isEmptyStair(orStair)) {
            return false;
        } else if (super.isEmptyStair(deStair)) {
            return true;
        } else {
            if (super.lastCardStair(orStair).follows(super.lastCardStair(deStair))) {
                return true;
            }
        }
        return false;
    }

    public void TableauToTableau(int orStair, int deStair) {
        super.pushTableau(deStair, super.popTableau(orStair));
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}