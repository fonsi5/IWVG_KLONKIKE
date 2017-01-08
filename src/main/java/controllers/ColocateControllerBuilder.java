package controllers;

import models.Game;

public class ColocateControllerBuilder {

    private ActionController[] actionControllersArray;

    private Game game;

    public ColocateControllerBuilder(Game Ngame) {
        assert game.getDeck() != null;
        assert game.getFoundation() != null;
        assert game.getTableau() != null;
        assert game.getWaste() != null;

        this.game = Ngame;
        this.actionControllersArray = new ActionController[game.getNumOptions()];
    }

    public void build() {

        this.actionControllersArray[0] = new DiscardController(game);
        this.actionControllersArray[1] = new WasteToDeckController(game);
        this.actionControllersArray[2] = new WasteToFoundationController(game);
        this.actionControllersArray[3] = new WasteToTableauController(game);
        this.actionControllersArray[4] = new TableauToFoundationController(game);
        this.actionControllersArray[5] = new TableauToTableauController(game);
        this.actionControllersArray[6] = new FoundationToTableauController(game);
        this.actionControllersArray[7] = new FlipController(game);
        this.actionControllersArray[8] = new ExitController(game);

    }

    public ActionController getController(int option) {

        return actionControllersArray[option - 1];
    }

}