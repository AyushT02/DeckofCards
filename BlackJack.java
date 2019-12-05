import java.util.*;
public class BlackJack {

    public static void main(String[] args) {
        Deck d = new Deck();
        Hand player = new Hand();
        Hand dealer = new BlackJackHand();
        int j = (int) (Math.random() * 52);
        System.out.println("Do you want to hit or stand");
        Scanner s = new Scanner(System.in);
        String hitOrStand = s.nextLine();
        if(hitOrStand.equalsIgnoreCase("hit")) {
            d.shuffle();
            player.draw(d.dealCard());
            dealer.draw(d.dealCard());
            System.out.println(player.toString() + " ");
            System.out.println("Player Hand: " + player.toString() + " ");
            System.out.println("Dealer Hand: " + dealer.toString() + " ");
            player.totalValue();
            System.out.println(player.totalValue());
            dealer.totalValue();
            System.out.println(dealer.totalValue());
            if(player.checkAce() == true) {
                if(player.totalValue() > 21) {
                    aceVar = player.totalValue() - 10;
            } else {
                    aceVar = player.totalValue();
            }
            if(player.totalValue() == 21) {
               System.out.println("You win!");   
            }
            if(dealer.totalValue() <= 17) {
               dealer.draw(d.dealCard());   
            }
            if(player.totalValue() > 21) {
               System.out.println("You lose!");   
            }
        }
        while(!hitOrStand.equalsIgnoreCase("hit")) {
            System.out.println("Please say hit or stand");
            Scanner n = new Scanner(System.in);
            String h = n.nextLine();
            if(h.equalsIgnoreCase("hit")) {
                break;
            }
            if(player.checkAce() == true) {
                if(player.totalValue() > 21) {
                    aceVar = player.totalValue() - 10;
            } else {
                    aceVar = player.totalValue();
            }
            if(player.totalValue() == 21) {
               System.out.println("You win!");   
            }
            if(dealer.totalValue() <= 17) {
               dealer.draw(d.dealCard());   
            }
            if(player.totalValue() > 21) {
               System.out.println("You lose!");   
            }
        }
        }
        while(hitOrStand.equalsIgnoreCase("hit")) {
            System.out.println("Would you like to hit or stand?");
            Scanner t = new Scanner(System.in);
            String o = t.nextLine();
            if(o.equalsIgnoreCase("hit")) {
                d.shuffle();
                player.draw(d.dealCard());
                dealer.draw(d.dealCard());
                System.out.println("Player Hand: " + player.toString() + " ");
                System.out.println("Dealer Hand: " + dealer.toString() + " ");
                player.totalValue();
                System.out.println(player.totalValue());
                dealer.totalValue();
                System.out.println(dealer.totalValue());
            }
            if(player.checkAce() == true) {
                if(player.totalValue() > 21) {
                    aceVar = player.totalValue() - 10;
            } else {
                    aceVar = player.totalValue();
            }
            if(player.totalValue() == 21) {
               System.out.println("You win!");   
            }
            if(dealer.totalValue() <= 17) {
               dealer.draw(d.dealCard());   
            }
            if(player.totalValue() > 21) {
               System.out.println("You lose!");   
            }
        }
        }
        if(player.totalValue() == 21) {
            System.out.println("You win!");
          }
        if(dealer.totalValue() <=  17) {
            dealer.draw(d.dealCard());
          }
        if(player.totalValue() > 21) {
            System.out.println("You lose!");
          }
        }
}



