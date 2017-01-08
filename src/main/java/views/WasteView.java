package views;
import models.Deck;
import models.Card;

public class WasteView {

	private Deck discard;

	public WasteView(Deck discard) {
		this.discard = discard;
	}

	public void render() {
		System.out.print("Descarte: ");
		if (this.discard.isEmpty()) {
			System.out.println("Vacio");
		} else {
			for (Card elem : this.discard.getList()) {
				System.out.print(elem.Paint());
			}
		}
		System.out.println("");
	}

}
