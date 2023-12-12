package card.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import card.model.CardDto;

public class Service {
	List<CardDto> cardDeck = null;
	String patterns;
	String cardNumbers;
	String[] card;
	Scanner scan = null;

	public Service() {
		cardDeck = new ArrayList<CardDto>();
		scan = new Scanner(System.in);
	}

	public void cardDeck() {
		CardDto dto = new CardDto();
		card = new String[52];
		for (int i = 0; i < card.length; i++) {
			int rndNum1 = (int) (Math.random() * 4) + 1;
			int rndNum2 = (int) (Math.random() * 13) + 1;

			patterns = dto.cardPat(rndNum1);
			cardNumbers = dto.cardNum(rndNum2);

			dto.pattern = patterns;
			dto.cardNumber = cardNumbers;

			card[i] = patterns + cardNumbers;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}

		}
		cardDeck.add(dto);
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
					for (CardDto card : cardDeck) {
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
		CardDto dto = new CardDto();

	}

	public void print() {

	}
}
