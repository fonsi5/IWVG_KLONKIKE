package views;

import controllers.Controller;
import controllers.FlipController;
import utils.LimitedIntDialog;

public class FlipView {

	private FlipController FlipController;

	public FlipView(Controller controller) {
		this.FlipController = (FlipController) controller;
	}

	public void render() {
		int stair;
		stair = new LimitedIntDialog("A que Escalera?", 1, FlipController.getNumTableaus()).read();
		if (this.FlipController.movePossible(stair - 1)) {
			this.FlipController.flipCard(stair - 1);
			System.out.println("Carta volteada");
		} else {
			System.out.println("No se puede");
		}
        new DeckView(FlipController.getDeck()).render();
        new WasteView(FlipController.getWaste()).render();
        new SuitView(FlipController.getFoundation()).render();
        new StairView(FlipController.getTableau()).render();
	}

}