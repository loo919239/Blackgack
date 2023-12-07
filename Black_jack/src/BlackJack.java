
public class BlackJack {
	String pattern; //무늬
	String cardNumber; // 숫자
	public void card() {
		int rndNum1 = (int)(Math.random() * 4 ) + 1;
		int rndNum2 = (int)(Math.random() * 11 ) + 1;
	}
	public void card(String rndNum1) {
		if (rndNum1 == 1) {
			pattern = "♠";
		} else if (rndnum1 == 2) {
			pattern = "♣";
		}else if (rndnum1 == 3) {
			pattern = "♥";
		}
		else if (rndnum1 == 4) {
			pattern = "◆";
		}
	}
		public void card(int rndNum2) {
		if (rndNum2 == 1) {
			cardNumber = "A";
		} else if (rndNum2 == 11) {
			cardNumber = "J";
		}else if (rndNum2 == 12) {
			cardNumber = "Q";
		}else if (rndNum2 == 13) {
			cardNumber = "K";
		}
		
	}
	
		public void cardDeck() {
			String card1 = String.format("%s / %s",pattern,cardNumber);
			
		}
	
	
	public static void main(String[] args) {
		
	}

