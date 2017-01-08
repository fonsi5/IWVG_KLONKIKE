package views;

import controllers.Controller;
import controllers.FoundationToTableauController;
import utils.LimitedIntDialog;

public class FoundationToTableauView {

    private FoundationToTableauController FoundationToTableauController;

    public FoundationToTableauView(Controller controller) {
        this.FoundationToTableauController = (FoundationToTableauController) controller;
    }

    public void render() {
        int suit;
        int stair;
        suit = new LimitedIntDialog("De que Palo?", 1, FoundationToTableauController.getNumTableaus()).read();
        stair = new LimitedIntDialog("A que Escalera?", 1, FoundationToTableauController.getNumTableaus()).read();
        if (this.FoundationToTableauController.movePossible(suit - 1, stair - 1)) {
            this.FoundationToTableauController.FoundationToTableau(suit - 1, stair - 1);
            System.out.println("Carta movida");
        } else {
            System.out.println("Error, las cartas no conectan");
        }

        new DeckView(FoundationToTableauController.getDeck()).render();
        new WasteView(FoundationToTableauController.getWaste()).render();
        new SuitView(FoundationToTableauController.getFoundation()).render();
        new StairView(FoundationToTableauController.getTableau()).render();

    }
}