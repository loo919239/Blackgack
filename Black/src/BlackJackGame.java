import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        Scanner scanner = new Scanner(System.in);

        // Initial deal
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());
        playerHand.addCard(deck.drawCard());
        dealerHand.addCard(deck.drawCard());

        System.out.println("Dealer's Hand:");
        System.out.println("Hidden Card");
        dealerHand.displayHand();

        System.out.println("\nYour Hand:");
        playerHand.displayHand();

        // Player's turn
        while (true) {
            int playerScore = playerHand.calculateScore();
            if (playerScore >= 21) {
                break;
            }

            System.out.println("\nDo you want to hit or stand? (H/S)");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals("H")) {
                playerHand.addCard(deck.drawCard());
                System.out.println("\nYour Hand:");
                playerHand.displayHand();
            } else if (choice.equals("S")) {
                break;
            }
        }

        // Dealer's turn
        System.out.println("\nDealer's Hand:");
        dealerHand.displayHand();
        while (dealerHand.calculateScore() < 17) {
            dealerHand.addCard(deck.drawCard());
        }

        // Determine the winner
        int playerScore = playerHand.calculateScore();
        int dealerScore = dealerHand.calculateScore();

        System.out.println("\nYour Hand:");
        playerHand.displayHand();
        System.out.println("\nDealer's Hand:");
        dealerHand.displayHand();

        if (playerScore > 21) {
            System.out.println("\nYou busted! Dealer wins.");
        } else if (dealerScore > 21 || playerScore > dealerScore) {
            System.out.println("\nYou win!");
        } else if (playerScore == dealerScore) {
            System.out.println("\nIt's a tie!");
        } else {
            System.out.println("\nDealer wins.");
        }

        scanner.close();
    }
}
