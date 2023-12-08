package card.service;

import java.util.Iterator;

public class Service {
	String pattern; // 무늬
	String cardNumber; // 숫자


	public String cardPat(int rndNum1) {
		if (rndNum1 == 1) {
			pattern = "♠";
		} else if (rndNum1 == 2) {
			pattern = "♣";
		} else if (rndNum1 == 3) {
			pattern = "♥";
		} else if (rndNum1 == 4) {
			pattern = "◆";

		}
		return String.valueOf(pattern);

	}

	public String cardNum(int rndNum2) {
		if (rndNum2 == 1) {
			cardNumber = "A";
		} else if (rndNum2 == 11) {
			cardNumber = "J";
		} else if (rndNum2 == 12) {
			cardNumber = "Q";
		} else if (rndNum2 == 13) {
			cardNumber = "K";
		} else {
			cardNumber = String.valueOf(rndNum2);
		}
		return String.valueOf(cardNumber);
	}
	
	
}
