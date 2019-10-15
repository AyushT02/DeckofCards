import java.util.*;
public class Deck extends Card
{
    private int cardsUsed;
    ArrayList<Card> deck = new ArrayList(52);
    public Deck() {
        for (int i = 1; i <= 4; i++) {
            for (int s = 0; s < 13; s++) {
                Card c = new Card();
                if (i == 1) {
                    c.setSuit("Hearts");
                }
                if (i == 2) {
                    c.setSuit("Clubs");
                }
                if (i == 3) {
                    c.setSuit("Spades");
                }
                if (i == 4) {
                    c.setSuit("Diamonds");
                }
                if (s == 0) {
                    c.setValue("Ace");
                }
                if (s == 1) {
                    c.setValue("2");
                }
                if (s == 2) {
                    c.setValue("3");
                }
                if (s == 3) {
                    c.setValue("4");
                }
                if (s == 4) {
                    c.setValue("5");
                }
                if (s == 5) {
                    c.setValue("6");
                }
                if (s == 6) {
                    c.setValue("7");
                }
                if (s == 7) {
                    c.setValue("8");
                }
                if (s == 8) {
                    c.setValue("9");
                }
                if (s == 9) {
                    c.setValue("10");
                }
                if (s == 10) {
                    c.setValue("Jack");
                }
                if (s == 11) {
                    c.setValue("Queen");
                }
                if (s == 12) {
                    c.setValue("King");
                }
                deck.add(c);
            }
        }
    }

    public void putCard(Card card, int position) {
        deck.add(position, card);
    }
    public void removeCard(int position) {
        deck.remove(position);
    }
    public Card getCard(int i) {
        return deck.get(i);
    }
    public Card getCard(Card card) {
        System.out.println(card.string());
        return card;
    }
    public void shuffle() {
        Collections.shuffle(deck);
    }
    public void shufflePartialDeck() {
        Collections.shuffle(deck);
    }
    public Card dealCard() {
        return deck.remove(0);
    }
}

