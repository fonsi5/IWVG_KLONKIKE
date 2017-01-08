package views;

import controllers.Controller;
import controllers.WasteToTableauController;
import utils.LimitedIntDialog;

public class WasteToTableauView {

	private WasteToTableauController WasteToTableauController;

	public WasteToTableauView(Controller controller) {
		this.WasteToTableauController = (WasteToTableauController) controller;
	}

	public void render() {
		int stair;
		if (this.WasteToTableauController.isWasteempty()) {
			System.out.println("El decarte esta vacio");
		} else {
			stair = new LimitedIntDialog("A que escalera?", 1, WasteToTableauController.getNumTableaus()).read();
			if (this.WasteToTableauController.movePossible(stair - 1)) {
				this.WasteToTableauController.moveWasteToTableau(stair - 1);
			} else {
				System.out.println("ERROR!!! No se puede poner "+WasteToTableauController.lastCardWaste().Paint()+" "+WasteToTableauController.lastCardStair(stair - 1).Paint());
			}
		}
		System.out.println("");

		new DeckView(this.WasteToTableauController.getDeck()).render();
		new WasteView(this.WasteToTableauController.getWaste()).render();
		new SuitView(this.WasteToTableauController.getFoundation()).render();
		new StairView(this.WasteToTableauController.getTableau()).render();
	}
}
