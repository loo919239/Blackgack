package card.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardDtoB {
	Scanner scan = null;

	String[] card;
	String patterns;
	String cardNumbers;

	public CardDtoB() {
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

			card[i] = patterns + cardNumbers;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}
		}
	}

	public void drawCard() {
		this.cardDeck();

	}

	public void printBlackJeckPl() {
		this.cardDeck();
		CardDto dto = new CardDto();
		int playerScore = 0;

		System.out.println("BlackJekc\n");
		System.out.println("플레이어에게 전달된 카드");
		System.out.printf("%s   %s\n", card[0], card[1]);

		int count = 1;
		for (int i = 0; i < count + 1; i++) {
			String score = card[i].substring(1);
			playerScore += dto.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", playerScore);
		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?(Hit/Stop)");
			String str = scan.nextLine();
			// Hit 입력 시
			if (str.equals("Hit")) {
				count++;
				for (int index = 0; index < index + 1; index++) {
					index++;
					System.out.println(card[count]);
					break;
				}
			}
			playerScore = 0;
			System.out.println("보유중인 카드");
			for (int i = 0; i < count + 1; i++) {
				System.out.printf("%s   ", card[i]);
			}
			for (int i = 0; i < count + 1; i++) {
				String score = card[i].substring(1);
				playerScore += dto.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", playerScore);
			if (str.equals("Stop")) {
				for (int i = 0; i < card.length; i++) {
					break;
				}
			}
			if (playerScore == 21) {
				System.out.println("BlackJack!");
				System.out.println("you Win");
				break;
			} else if (playerScore > 21) {
				System.out.println("GAME OVER~");
				System.out.println("21을 넘겼습니다");
				break;
			}
		} // end While

	}// end printBlackJeckP1
	
	public void printBlackJeckFinal() {
		this.cardDeck();
		CardDto dto = new CardDto();
		int playerScore = 0;
		int dealerScore = 0;
		
		
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int dlCount = 2;
		for (int i = 51, j = dlCount; i >= 52 - dlCount; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += dto.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", dealerScore);
	
		System.out.println("BlackJekc\n");
		System.out.println("플레이어에게 전달된 카드");
		System.out.printf("%s   %s\n", card[0], card[1]);

		int plCount = 1;
		for (int i = 0; i < plCount + 1; i++) {
			String score = card[i].substring(1);
			playerScore += dto.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", playerScore);
		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?(Hit/Stop)");
			String str = scan.nextLine();
			// Hit 입력 시
			if (str.equals("Hit")) {
				plCount ++;
				for (int index = 0; index < index + 1; index++) {
					index++;
					System.out.println(card[plCount ]);
					break;
				}
			}
			if (dealerScore < 17) {
				for (int i = 0; i < i + 1; i++) {
					i++;
					System.out.println(card[51-dlCount]);
					dlCount++;
					break;
				}
			}
			System.out.println("딜러가 보유중인 카드");
			for (int i = 51 , j = dlCount; i >= 52 - dlCount; i--, j++) {
				card[j] = card[i];
				System.out.println(card[j]);
			}
			for (int i = 51, j = dlCount; i >= 52 - dlCount; i--, j++) {
				card[j] = card[i];
				String score = card[j].substring(1);
				dealerScore += dto.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", dealerScore);
			
			playerScore = 0;
			System.out.println("플레이어가 보유중인 카드");
			for (int i = 0; i < plCount + 1; i++) {
				System.out.printf("%s   ", card[i]);
			}
			for (int i = 0; i < plCount + 1; i++) {
				String score = card[i].substring(1);
				playerScore += dto.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", playerScore);
			
			if (str.equals("Stop")) {
				if (playerScore > dealerScore) {
					System.out.println("you win");
					break;
				} else if (playerScore < dealerScore) {
					System.out.println("you lose");
					break;
				} else if (playerScore == dealerScore) {
					System.out.println("til");
					break;
				}
			}
			
			if (playerScore == 21) {
				System.out.println("BlackJack!");
				System.out.println("you Win");
				break;
			} else if (playerScore > 21) {
				System.out.println("GAME OVER~");
				System.out.println("21을 넘겼습니다");
				break;
			}else if (dealerScore > 21) {
				System.out.println("you Win");
				System.out.println("딜러가 21을 넘었습니다");
				break;
			} 
			
			
		}// end While		
	}// end final~~~~~~
	
 // 딜러 test1!!!!!
	public void printBlackJeckDl() {
		this.cardDeck();
		CardDto dto = new CardDto();
		int dealerScore = 0;
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int count = 2;
		for (int i = 51, j = count; i >= 52 - count; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += dto.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", dealerScore);

		while (true) {
			// Hit 입력 시
			if (dealerScore < 17) {
				for (int i = 0; i < i + 1; i++) {
					i++;
					System.out.println(card[51-count]);
					count++;
					break;
				}
			}
			dealerScore = 0;
			System.out.println("보유중인 카드");
			for (int i = 51 , j = count; i >= 52 - count; i--, j++) {
				card[j] = card[i];
				System.out.println(card[j]);
			}
			for (int i = 51, j = count; i >= 52 - count; i--, j++) {
				card[j] = card[i];
				String score = card[j].substring(1);
				dealerScore += dto.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", dealerScore);

			if (dealerScore > 21) {
				System.out.println("you Win");
				System.out.println("딜러가 21을 넘었습니다");
				break; 
				
			}
		} // end While
	}// end Dl()
	
	// 딜러 test2!!!
 	public void printBlackJeckDl2() {
		this.cardDeck();
		CardDto dto = new CardDto();
		int dealerScore = 0;
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int count = 2;
		for (int i = 51, j = count; i >= 52 - count; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += dto.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", dealerScore);

		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?(Hit/Stop)");
			String str = scan.nextLine();
			// Hit 입력 시
			if (str.equals("Hit")) {
				for (int i = 0; i < i + 1; i++) {
					i++;
					System.out.println(card[51-count]);
					count++;
					break;
				}
			}
			dealerScore = 0;
			System.out.println("보유중인 카드");
			for (int i = 51 , j = count; i >= 52 - count; i--, j++) {
				card[j] = card[i];
				System.out.println(card[j]);
			}
			for (int i = 51, j = count; i >= 52 - count; i--, j++) {
				card[j] = card[i];
				String score = card[j].substring(1);
				dealerScore += dto.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", dealerScore);

			if (dealerScore > 21) {
				System.out.println("you Win");
				System.out.println("딜러가 21을 넘었습니다");
				break;
				
			}
		} // end While
	}// end Dl()
}
