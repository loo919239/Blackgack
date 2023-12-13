package black.test;

import java.util.Scanner;

import black.card.CardBase;
import black.utils.Line;

public class CardBaseTest {
	Scanner scan = null;

	String[] card;
	String patterns;
	String cardNumbers;

	public CardBaseTest() {
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

			card[i] = patterns + cardNumbers;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}
		}
	}


	public void printBlackJeckPl() {
		while (true) {
			
		this.cardDeck();
		CardBase base = new CardBase();
		int playerScore = 0;

		System.out.println("BlackJekc\n");
		System.out.println("플레이어에게 전달된 카드");
		System.out.printf("%s   %s\n", card[0], card[1]);

		int count = 1;
		for (int i = 0; i < count + 1; i++) {
			String score = card[i].substring(1);
			playerScore += base.intCard(score);
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
				playerScore += base.intCard(score);
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
		}

	}// end printBlackJeckP1
	
	public void printBlackJeckFinal() {
		this.cardDeck();
		CardBase base = new CardBase();
		int playerScore = 0;
		int dealerScore = 0;
		int lineNum = 20;
		
		Line.dLine(lineNum);
		System.out.println("\t       BlackJekc");
		System.out.println("v1.0.0");
		Line.sLine(lineNum);
		System.out.print("플레이어의 이름을 입력해 주세요 >> ");
		String name = scan.nextLine();
		Line.dLine(lineNum);
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int dlCount = 2;
		for (int i = 51, j = dlCount; i >= 52 - dlCount; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += base.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", dealerScore);
		Line.sLine(lineNum);
	
		System.out.println(name + "님에게 전달된 카드");
		System.out.printf("%s   %s\n", card[0], card[1]);

		int plCount = 1;
		for (int i = 0; i < plCount + 1; i++) {
			String score = card[i].substring(1);
			playerScore += base.intCard(score);
		}
		System.out.printf("\n총합 : %d\n", playerScore);
		Line.sLine(lineNum);

		if (playerScore == 21) {
			System.out.println("BlackJack!");
			System.out.println("til");
			return;
		} else if (playerScore > 21) {
			System.out.println("GAME OVER~");
			System.out.println("21을 넘겼습니다");
			return;
		}else if (dealerScore > 21) {
			System.out.println("you Win");
			System.out.println("딜러가 21을 넘었습니다");
			return;
		} 
		
		
		
		
		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?");
			System.out.print("(Hit/Stop) >> ");
			String str = scan.nextLine();
			// Hit 입력 시
			
			if (dealerScore < 17) {
				for (int i = 0; i < i + 1; i++) {
					i++;
					System.out.println("딜러가 뽑은 카드");
					System.out.println(card[51-dlCount]);
					dlCount++;
					break;
				}
			}
			if (str.equals("Hit")) {
				plCount ++;
				for (int index = 0; index < index + 1; index++) {
					index++;
					System.out.println(name + "님이 뽑은 카드");
					System.out.println(card[plCount ]);
					Line.sLine(lineNum);
					break;
				}
			}
			
			dealerScore = 0;
			System.out.println("딜러가 보유중인 카드");
			for (int i = 51 , j = dlCount; i >= 52 - dlCount; i--, j++) {
				card[j] = card[i];
				System.out.printf("%s   ",card[j]);
			}
			System.out.println();
			
			for (int i = 51, j = dlCount; i >= 52 - dlCount; i--, j++) {
				card[j] = card[i];
				String score = card[j].substring(1);
				dealerScore += base.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", dealerScore);
			Line.sLine(lineNum);
			
			
			playerScore = 0;
			System.out.println(name + "님이 보유중인 카드");
			for (int i = 0; i < plCount + 1; i++) {
				System.out.printf("%s   ", card[i]);
			}
			for (int i = 0; i < plCount + 1; i++) {
				String score = card[i].substring(1);
				playerScore += base.intCard(score);
			}
			System.out.printf("\n총합 : %d\n", playerScore);
			Line.sLine(lineNum);
			
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
		CardBase base = new CardBase();
		int dealerScore = 0;
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int count = 2;
		for (int i = 51, j = count; i >= 52 - count; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += base.intCard(score);
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
				dealerScore += base.intCard(score);
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
		CardBase base = new CardBase();
		int dealerScore = 0;
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s   %s\n", card[51], card[50]);
		int count = 2;
		for (int i = 51, j = count; i >= 52 - count; i--, j++) {
			card[j] = card[i];
			String score = card[j].substring(1);
			dealerScore += base.intCard(score);
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
				dealerScore += base.intCard(score);
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
