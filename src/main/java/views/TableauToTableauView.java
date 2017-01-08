package views;

import controllers.Controller;
import controllers.TableauToTableauController;
import utils.LimitedIntDialog;

public class TableauToTableauView {

    private TableauToTableauController TableauToTableauController;

    public TableauToTableauView(Controller controller) {
        this.TableauToTableauController = (TableauToTableauController) controller;
    }

    public void render() {
        int orStair;
        int deStair;
        orStair = new LimitedIntDialog("De que escalera?", 1, TableauToTableauController.getNumTableaus()).read();
        deStair = new LimitedIntDialog("A que escalera?", 1, TableauToTableauController.getNumTableaus()).read();
        if (orStair == deStair) {
            System.out.println("ERROR!!! La escalera origen y destino deben ser distintas");
        } else {
            if (this.TableauToTableauController.movePossible(orStair - 1, deStair - 1)) {
                this.TableauToTableauController.TableauToTableau(orStair - 1, deStair - 1);
            } else {
                System.out.println("No es posible el movimiento");
                System.out.println("ERROR!!! No se puede poner " + TableauToTableauController.lastCardStair(orStair - 1).Paint() + " "
                        + TableauToTableauController.lastCardStair(deStair - 1).Paint());
            }
        }
        new DeckView(TableauToTableauController.getDeck()).render();
        new WasteView(TableauToTableauController.getWaste()).render();
        new SuitView(TableauToTableauController.getFoundation()).render();
        new StairView(TableauToTableauController.getTableau()).render();
    }

}
