package views;

import controllers.Controller;
import controllers.ExitController;

public class ExitView {
    
    private ExitController ExitController;

    public ExitView(Controller controller) {
        this.ExitController = (ExitController) controller;
    }


	public void render() {
		System.out.println("Adios!!!");	
		ExitController.setPlaying(false);
	}

}