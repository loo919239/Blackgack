package black.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import black.card.CardBase;

public class Test1 {
	List<CardBase> cardDeck = null;
	String patterns;
	String cardNumbers;
	String[] card;
	Scanner scan = null;

	public Test1() {
		cardDeck = new ArrayList<CardBase>();
		scan = new Scanner(System.in);
	}

	public void cardDeck() {
		CardBase base = new CardBase();
		card = new String[52];
		for (int i = 0; i < card.length; i++) {
			int rndNum1 = (int) (Math.random() * 4) + 1;
			int rndNum2 = (int) (Math.random() * 13) + 1;

			patterns = base.cardPat(rndNum1);
			cardNumbers = base.cardNum(rndNum2);

			base.pattern = patterns;
			base.cardNumber = cardNumbers;

			card[i] = patterns + cardNumbers;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}

		}
		cardDeck.add(base);
	}


	public void start() {
		System.out.println("플레이어에게 전달된 카드");
		System.out.printf("%s\t%s\n", card[0], card[1]);
		int count = 2;
//		System.out.println("딜러에게 전달된 카드");
//		System.out.printf("%s\t%s\n", card[2], card[3]);
		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?(Hit/Stop)");
			String str = scan.nextLine();
			// Hit 입력 시
				if (str.equals("Hit")) {
					for (CardBase card : cardDeck) {
						System.out.println(card);
					}
			}

			if (str.equals("Stop")) {
				break;
			}
			if (str.equalsIgnoreCase("Stop")) {
				break;
			}
		}
		CardBase base = new CardBase();

	}

	public void print() {

	}
}
