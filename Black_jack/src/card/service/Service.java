package card.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import card.model.CardDto;

public class Service {
	List<CardDto> service = null;
	String[] card;
	Scanner scan = null;

	public Service() {
		service = new ArrayList<CardDto>();
		scan = new Scanner(System.in);
	}

	public void cardDeck() {
		CardDto dto = new CardDto();
		card = new String[52];
		for (int i = 0; i < card.length; i++) {
			int rndNum1 = (int) (Math.random() * 4) + 1;
			int rndNum2 = (int) (Math.random() * 13) + 1;

			dto.pattern = dto.cardPat(rndNum1);
			dto.cardNumber = dto.cardNum(rndNum2);
			
			
			card[i] = dto.pattern + dto.cardNumber;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}
			
		}
		service.add(dto);
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
			for (int i = 4; i < card.length; i++) {
				if (str.equalsIgnoreCase("Hit")) {
					count ++;
					i++;
					
					System.out.println("뽑은 카드");
					System.out.println(card[i]);
				}
				if (str.equalsIgnoreCase("Stop")) {
					break;
				}
			}
			if (str.equalsIgnoreCase("Stop")) {
				break;
			}
		}
		CardDto dto = new CardDto();
		
		int intPl = 0;
		if (dto.cardNumber == "A") {
			intPl = 1;
		} else if (dto.cardNumber == "J") {
			intPl = 11;
		} else if (dto.cardNumber == "Q") {
			intPl = 12;
		} else if (dto.cardNumber == "K") {
			intPl = 13;
		} else if (dto.cardNumber != "" ) {
			intPl = Integer.valueOf(dto.cardNumber);
		}
		String plNum = "01";
		if (service.size() > 0) {
			plNum = service.get(service.size() - 1).cardNumber;
		}
		int intPlNum = Integer.valueOf(plNum.substring(1));
		intPl++;

	}

	public void print() {

	}
}
