package controllers;

import models.Game;
import views.GameView;
import models.Suit;

public class WasteToFoundationController extends ActionController {

    public WasteToFoundationController(Game game) {
        super(game);
    }

    public boolean movePossible() {

        if (super.isWasteempty()) {
            return false;
        }
        if (super.isEmptyFoundation(super.lastCardWaste().getSuite()) && super.lastCardWaste().getValue() == 'A') {
            return true;
        } else {
            if (super.lastCardFoundation(super.lastCardWaste().getSuite()).follows(super.lastCardWaste())) {
                return true;
            }
        }
        return false;
    }

    public void moveWasteToFoundation() {
        Suit SuitWasteCard;
        SuitWasteCard = super.lastCardWaste().getSuite();
        super.pushFoundation(SuitWasteCard, super.popWaste());
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}
