import java.util.*;
public class BlackJackHand extends Hand
{
  ArrayList<Card> jackHand = new ArrayList();
  Card holeCard = new Card();
  public void setHoleCard(Card c) {
     c = holeCard;
  }
  public Card getHoleCard() {
     return holeCard;
  }
  public Card getMaxValue() {
     return jackHand.stream().max(Comparator.comparing(Card::getValue)).get();
   }

  public String toStringShowCards() {
     return holeCard.getValue() + " of " + holeCard.getSuit();
  }
}

