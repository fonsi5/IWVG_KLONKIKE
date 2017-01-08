package views;
import models.CardStack;
import models.Suit;
import models.Card;

public class SuitView {

    private CardStack st;

    public SuitView(CardStack suit) {
        this.st = suit;
    }

    public void render() {

        Suit[] allSuits = Suit.values();

        for (Suit acSuit : allSuits) {
            if (st.isEmpty(acSuit.ordinal())) {
                System.out.println("Palo " + acSuit.name() + " Vacio");
            } else {
                System.out.print("Palo " + acSuit.name() + " ");
                for (Card elem : this.st.getCards().get(acSuit.ordinal())) {
                    System.out.print(elem.Paint());
                }
                System.out.println("");
            }

        }
    }

}
