package views;

import controllers.StartController;

public class StartView {

	private StartController startController;

	public StartView(StartController startController) {
		this.startController = startController;
	}

	public void render() {
		startController.initial();
		System.out.println("================");
		new DeckView(startController.getDeck()).render();
		new WasteView(startController.getWaste()).render();
		new SuitView(startController.getFoundation()).render();
		new StairView(startController.getTableau()).render();
	}

}
