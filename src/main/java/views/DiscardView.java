package views;

import controllers.Controller;
import controllers.DiscardController;

public class DiscardView {

	private DiscardController DiscardController;

	public DiscardView(Controller controller) {
		this.DiscardController = (DiscardController) controller;
	}

	public void render() {
		if (DiscardController.isDeckempty()) {
			System.out.println("ERROR!!! la baraja está vacia");
		} else {
			this.DiscardController.DiscardCard();
		}
		System.out.println("");
		new DeckView(DiscardController.getDeck()).render();
		new WasteView(DiscardController.getWaste()).render();
		new SuitView(DiscardController.getFoundation()).render();
		new StairView(DiscardController.getTableau()).render();
	}

}
