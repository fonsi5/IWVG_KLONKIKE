package controllers;

import views.GameView;
import models.Game;

public class ExitController extends ActionController {

    public ExitController(Game game) {
        super(game);
    }

    @Override
    public void accept(GameView gameView) {
        gameView.visit(this);
    }

}