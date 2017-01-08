package views;

import controllers.Controller;
import controllers.WasteToDeckController;

public class WasteToDeckView {

	private WasteToDeckController WasteToDeckController;

	public WasteToDeckView(Controller controller) {
		this.WasteToDeckController = (WasteToDeckController) controller;
	}

	public void render() {
		
	    if (this.WasteToDeckController.isWasteempty()) { 
	        System.out.println("ERROR!!! El descarte está vacio");
	    }else if (this.WasteToDeckController.isDeckempty()) {
			this.WasteToDeckController.WasteToDeck();
		} else{
			System.out.println("ERROR!!! La baraja no está vacia");
		}
		System.out.println("");
		new DeckView(WasteToDeckController.getDeck()).render();
		new WasteView(WasteToDeckController.getWaste()).render();
		new SuitView(WasteToDeckController.getFoundation()).render();
		new StairView(WasteToDeckController.getTableau()).render();
	}

}
