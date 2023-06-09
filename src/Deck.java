import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        int count = 0;
        for (Palo palo : Palo.values()) {
            for (Color color : Color.values()) {
                for (Valor valor : Valor.values()) {
                    if (count < 52) {
                        cards.add(new Card(palo, color, valor));
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
        System.out.println("Se mezcló el deck.");
    }

    public void head() {
        if (cards.isEmpty()) {
            System.out.println("No quedan cartas en el deck.");
        } else {
            Card card = cards.remove(0);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }

    public void pick() {
        if (cards.isEmpty()) {
            System.out.println("No quedan cartas en el deck.");
        } else {
            int randomIndex = (int) (Math.random() * cards.size());
            Card card = cards.remove(randomIndex);
            System.out.println(card.toString());
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }

    public void hand() {
        if (cards.size() < 5) {
            System.out.println("No hay suficientes cartas en el deck para repartir una mano.");
        } else {
            System.out.println("Mano de 5 cartas:");
            for (int i = 0; i < 5; i++) {
                Card card = cards.remove(0);
                System.out.println(card.toString());
            }
            System.out.println("Quedan " + cards.size() + " cartas en el deck.");
        }
    }
}
