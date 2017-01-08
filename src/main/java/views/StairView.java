package views;
import models.CardStack;
import models.Card;

public class StairView {

    private CardStack Tableau;

    public StairView(CardStack Tableau) {
        this.Tableau = Tableau;
    }

    public void render() {
        System.out.println("");
        for (int i = 0; i < Tableau.size(); i++) {
            paintStair(i);
        }

    }

    private void paintStair(int stair) {
        int showStair = stair + 1;
        if (this.Tableau.isEmpty(stair)) {
            System.out.println("Escalera " + showStair + " Vacia");
        } else {
            System.out.print("Escalera " + showStair + " ");
            for (Card elem : this.Tableau.getCards().get(stair)) {
                System.out.print(elem.Paint());
            }
        }
        System.out.println("");
    }

}