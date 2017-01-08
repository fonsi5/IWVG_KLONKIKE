package views;

import controllers.Controller;
import controllers.WasteToFoundationController;

public class WasteToFoundationView {

	private WasteToFoundationController WasteToFoundationController;

	public WasteToFoundationView(Controller controller) {
		this.WasteToFoundationController = (WasteToFoundationController) controller;
	}

	public void render() {
		if (this.WasteToFoundationController.movePossible()) {
			this.WasteToFoundationController.moveWasteToFoundation();
		} else {
			System.out.println("ERROR !!! movimiento no válido");
		}
		System.out.println("");
		if (this.WasteToFoundationController.exitKlondike()) {
			System.out.println("Has ganado!!!");
			WasteToFoundationController.setPlaying(false);
		} else {
	        new DeckView(this.WasteToFoundationController.getDeck()).render();
	        new WasteView(this.WasteToFoundationController.getWaste()).render();
	        new SuitView(this.WasteToFoundationController.getFoundation()).render();
	        new StairView(this.WasteToFoundationController.getTableau()).render();
		}
	}

}
