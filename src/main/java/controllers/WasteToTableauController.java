package controllers;

import views.GameView;
import models.Game;

public class WasteToTableauController extends ActionController {

    public WasteToTableauController(Game game) {
        super(game);
    }

    public boolean movePossible(int stair) {

        if (super.isEmptyStair(stair) && super.lastCardWaste().getValue() == 'A') {
            return true;
        }
        if (super.lastCardWaste().follows(super.lastCardStair(stair))) {
            return true;
        }
        return false;
    }

    public void moveWasteToTableau(int stair) {
        super.pushTableau(stair, super.popWaste());
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}
