package black.card;

public class CardBase {
	public String pattern; // 무늬
	public String cardNumber; // 숫자

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
		return cardNumber;
	}
	
	public Integer intCard(String cardNumber) {
		if (cardNumber.equals("A")) {
			return 1;
		} else if (cardNumber.equals("J")) {
			return 10;
		} else if (cardNumber.equals("Q")) {
			return 10;
		} else if (cardNumber.equals("K")) {
			return 10;
		} else {
			return Integer.valueOf(cardNumber);
		}
	}
}
