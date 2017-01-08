package views;

import controllers.DiscardController;
import controllers.ExitController;
import controllers.FlipController;
import controllers.FoundationToTableauController;
import controllers.TableauToFoundationController;
import controllers.TableauToTableauController;
import controllers.WasteToDeckController;
import controllers.WasteToFoundationController;
import controllers.WasteToTableauController;

public interface View {
	
	void render();

	void visit(DiscardController DiscardController);

	void visit(WasteToDeckController WasteToDeckController);

	void visit(WasteToFoundationController WasteToFoundationController);	
	
	void visit(WasteToTableauController WasteToTableauController);
	
	void visit(TableauToFoundationController TableauToFoundationController);

	void visit(TableauToTableauController FromStairToSuitController);

	void visit(FoundationToTableauController FromSuitToStairController);

	void visit(FlipController FlipController);

	void visit(ExitController ExitController);

}