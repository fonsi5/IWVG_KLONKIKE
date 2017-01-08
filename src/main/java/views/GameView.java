package views;

import controllers.ActionController;
import controllers.ColocateControllerBuilder;
import controllers.DiscardController;
import controllers.ExitController;
import controllers.FlipController;
import controllers.FoundationToTableauController;
import controllers.TableauToFoundationController;
import controllers.TableauToTableauController;
import controllers.WasteToDeckController;
import controllers.WasteToFoundationController;
import controllers.WasteToTableauController;
import utils.LimitedIntDialog;

public class GameView implements View {

    private ColocateControllerBuilder ColocateControllerBuilder;

    public GameView(ColocateControllerBuilder ColocateControllerBuilder) {
        this.ColocateControllerBuilder = ColocateControllerBuilder;
    }

    public void render() {
        ActionController controller;
        int option;

        do {
            option = this.chosenOption();
            controller = ColocateControllerBuilder.getController(option);
            if (controller != null) {
                controller.accept(this);
            }
        } while (controller.getPlaying());
    }

    private int chosenOption() {
        showMenu();

        int option = new LimitedIntDialog("Que opcion quieres?", 1, 9).read();
        return option;
    }

    private void showMenu() {
        System.out.println("-----------------------------");
        System.out.println("1. Mover de baraja a descarte");
        System.out.println("2. Mover de descarte a baraja");
        System.out.println("3. Mover de descarte a palo");
        System.out.println("4. Mover de descarte a escalera");
        System.out.println("5. Mover de escalera a palo");
        System.out.println("6. Mover de escalera a escalera");
        System.out.println("7. Mover de palo a escalera");
        System.out.println("8. Voltear en escalera");
        System.out.println("9. Salir");

    }

    public void visit(DiscardController DiscardController) {
        new DiscardView(DiscardController).render();
    }

    public void visit(WasteToDeckController WasteToDeckController) {
        new WasteToDeckView(WasteToDeckController).render();
    }

    public void visit(WasteToFoundationController WasteToFoundationController) {
        new WasteToFoundationView(WasteToFoundationController).render();
    }

    public void visit(WasteToTableauController WasteToTableauController) {
        new WasteToTableauView(WasteToTableauController).render();
    }

    public void visit(TableauToFoundationController TableauToFoundationController) {
        new TableauToFoundationView(TableauToFoundationController).render();
    }

    public void visit(TableauToTableauController fromStairToSuit) {
        new TableauToTableauView(fromStairToSuit).render();
    }

    public void visit(FoundationToTableauController FoundationToTableauController) {
        new FoundationToTableauView(FoundationToTableauController).render();
    }

    public void visit(FlipController FlipController) {
        new FlipView(FlipController).render();
    }

    public void visit(ExitController exitController) {
        new ExitView(exitController).render();
    }

}