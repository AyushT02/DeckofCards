
import java.util.*;
public class Hand extends Card
{
    ArrayList<Card> hand = new ArrayList(52);
    public void draw(Card card) {
        hand.add(card);
    }
    public void discard(Card card) {
        hand.remove(card);
    }
    public String getCards() {
        return hand.toString();
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card c : hand) {
            sb.append(c.getValue() + " of " + c.getSuit());
        }
        return sb.toString();
    }
    public int totalValue() {
        int totalValue = 0;
        int handValue = 0;
        for(int i = 0; i <= hand.size(); i++) {
            if(hand.get(i).getValue().equals("King") || hand.get(i).getValue().equals("Queen") || hand.get(i).getValue().equals("Jack")) {
                totalValue = totalValue + 10;
            }
            if(hand.get(i).getValue().equals("Ace")) {

            }

         int intVal = Integer.parseInt(hand.get(i).getValue());
         totalValue = handValue + intVal;
        }
        return totalValue;
    }
        

    }

