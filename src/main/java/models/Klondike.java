package models;

import views.GameView;
import views.StartView;
import controllers.ColocateControllerBuilder;
import controllers.StartController;

public class Klondike {

    private Game game;
    private StartController startController;
    private ColocateControllerBuilder ColocateControllerBuilder;
    private StartView startView;
    private GameView gameView;

    public Klondike() {
        game = new Game();
        ColocateControllerBuilder = new ColocateControllerBuilder(game);
        gameView = new GameView(ColocateControllerBuilder);
        startController = new StartController(game, ColocateControllerBuilder);
        startView = new StartView(startController);
    }

    public void play() {
        startView.render();
        gameView.render();
    }

    public static void main(String[] args) {
        Klondike klondike = new Klondike();
        klondike.play();
    }

}