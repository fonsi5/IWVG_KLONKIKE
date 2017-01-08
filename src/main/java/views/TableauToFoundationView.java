package views;

import controllers.Controller;
import controllers.TableauToFoundationController;
import utils.LimitedIntDialog;

public class TableauToFoundationView {

	private TableauToFoundationController TableauToFoundationController;

	public TableauToFoundationView(Controller controller) {
		this.TableauToFoundationController = (TableauToFoundationController) controller;
	}

	public void render() {
		int stair;
		stair = new LimitedIntDialog("De que escalera?", 1, TableauToFoundationController.getNumTableaus()).read();
		if (this.TableauToFoundationController.movePossible(stair - 1)) {
			this.TableauToFoundationController.TableauToFoundation(stair - 1);
			System.out.println("");
		} else {
			System.out.println("Error, las cartas no conectan");
		}

		if (this.TableauToFoundationController.exitKlondike()) {
			System.out.println("Has ganado!!!");
			TableauToFoundationController.setPlaying(false);
		} else {
	        new DeckView(TableauToFoundationController.getDeck()).render();
	        new WasteView(TableauToFoundationController.getWaste()).render();
	        new SuitView(TableauToFoundationController.getFoundation()).render();
	        new StairView(TableauToFoundationController.getTableau()).render();
		}
	}
}