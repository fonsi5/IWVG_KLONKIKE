package controllers;

import models.Game;

public class StartController extends Controller {

    private ColocateControllerBuilder colocateControllerBuilder;

    public StartController(Game game, ColocateControllerBuilder colocateControllBuilder) {
        super(game);
        assert colocateControllBuilder != null;
        this.colocateControllerBuilder = colocateControllBuilder;
    }

    public void initial() {

        colocateControllerBuilder.build();
        super.fillDeck();
        super.fillTableau();
    }

}
