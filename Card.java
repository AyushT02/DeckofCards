import java.util.*;
public class Card
{
    public String suit;
    public String value;
    public Card() {
        this.suit = suit;
        this.value = value;
    }
    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    public String getSuit() {
        return suit;
    }
    public String getValue() {
        return value;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public boolean equals(Card card) {
        if(card == card) {
            return true;
        } else {
            return false;
        }
    }
    public String string() {
        return value + " of " + suit;
    }
}
