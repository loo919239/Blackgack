package card.model;

public class CardDto {
	public String pattern;
	public String cardNumber;
	private int point;
	
	public CardDto(String pattern, String cardNumber, int point) {
		this.pattern = pattern;
		this.cardNumber = cardNumber;
		this.point = point;
	}
	
	public CardDto(String pattern, int index) {
		this.pattern = pattern;
		this.cardNumber = this.numberToCardNumver(index);
		this.point = numberToPoint(index);
	}
	
	private String numberToCardNumver(int number) {
		if (number == 1) {
			cardNumber = "A";
		} else if (number == 11) {
			cardNumber = "J";
		} else if (number == 12) {
			cardNumber = "Q";
		} else if (number == 13) {
			cardNumber = "K";
		}
		return String.valueOf(number);
	}
	
	private int numberToPoint(int number) {
		if (number >= 11) return 10;
		return number;
	}
	
}
