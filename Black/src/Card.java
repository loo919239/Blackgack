import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private final String suit; // 무늬
    private final String rank; // 숫자

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }

    public int getValue() {
        if (rank.equals("Ace")) {
            return 11;
        } else if (rank.equals("2") || rank.equals("3") || rank.equals("4") || rank.equals("5") || rank.equals("6") ||
                   rank.equals("7") || rank.equals("8") || rank.equals("9")) {
            return Integer.parseInt(rank);
        } else {
            return 10;
        }
    }
}

class Deck {
    private final List<Card> cards;

    public Deck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                Card card = new Card(suit, rank);
                cards.add(card);
            }
        }
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}

class Hand {
    private final List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public int calculateScore() {
        int score = 0;
        int numberOfAces = 0;

        for (Card card : cards) {
            score += card.getValue();
            if (card.getValue() == 11) {
                numberOfAces++;
            }
        }

        while (score > 21 && numberOfAces > 0) {
            score -= 10;
            numberOfAces--;
        }

        return score;
    }

    public void displayHand() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }
}