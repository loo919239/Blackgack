package black.rule;

import black.card.CardBase;
import black.utils.Line;

public class CardRuleB extends CardRuleA {
	
	
	public CardRuleB() {
		super();
	}
	

	public void printBlackJeckFinal() {
		CardBase base = new CardBase();
		this.cardDeck();
		int playerScore = 0;
		int dealerScore = 0;

		int lineNum = 20;
		CardRuleA cRule = new CardRuleA();
		

		Line.dLine(lineNum);
		System.out.print("\t       BlackJekc\n");
		Line.sLine(lineNum);

		System.out.print("플레이어의 이름을 입력해 주세요 >> ");
		String name = scan.next();
		Line.dLine(lineNum);
		
		System.out.println("딜러가 카드를 섞습니다...");
		Line.dLine(lineNum);

		int dlCount = 2;
		for (int i = 51; i >= 52 - dlCount; i--) {
			String score = card[i].substring(1);
			dealerScore += base.intCard(score);
		}
			
		System.out.println(name + "님에게 전달된 카드");
		System.out.printf("%s   %s\n", card[0], card[1]);
				
		
		
		int plCount = 1;
		for (int i = 0; i < plCount + 1; i++) {
			String score = card[i].substring(1);
			playerScore += base.intCard(score);
		}
		System.out.printf("\nscore : %d\n", playerScore);
		Line.sLine(lineNum);

		while (true) {
			System.out.println("한장 더 뽑으시겠습니까?");
			System.out.print("(Hit/Stop) >> ");
			String str = scan.next();
			
			if (!str.equalsIgnoreCase("Hit")&&!str.equalsIgnoreCase("Stop")) {
				System.out.println("다시 입력해 주세요");
					continue;
				}
			
			if (dealerScore < 17) {
				for (int i = 0; i < i + 1;) {
					Line.dLine(lineNum);
					System.out.println("딜러가 카드 한 장을 가져갑니다...");
					Line.dLine(lineNum);
					dlCount++;
					break;
				}
			} else {
				Line.dLine(lineNum);
				System.out.println("딜러는 카드를 가져가지 않습니다.");
				Line.dLine(lineNum);
			}

			if (str.equalsIgnoreCase("Hit")) {
				plCount++;
				for (int index = 0; index < index + 1;) {
					System.out.println(name + "님이 뽑은 카드");
					System.out.println(card[plCount]);
					Line.sLine(lineNum);
					break;
				}
				System.out.println(name + "님이 보유중인 카드");
				for (int i = 0; i < plCount + 1; i++) {
					System.out.printf("%s   ", card[i]);
				}
				System.out.println();
				
				playerScore = 0;
				for (int i = 0; i < plCount + 1; i++) {
					String score = card[i].substring(1);
					playerScore += base.intCard(score);
				}
				System.out.printf("\nscore : %d\n", playerScore);
				Line.sLine(lineNum);
			}

			dealerScore = 0;
			for (int i = 51; i >= 52 - dlCount; i--) {
				card[i] = card[i];
			}

			for (int i = 51; i >= 52 - dlCount; i--) {
				String score = card[i].substring(1);
				dealerScore += base.intCard(score);
			}


			if (str.equalsIgnoreCase("Stop")) {
				System.out.println("카드를 공개합니다");
				System.out.println("딜러의 카드");
				
				dealerScore = 0;
				for (int i = 51; i >= 52 - dlCount; i--) {
					card[i] = card[i];
					System.out.printf("%s   ", card[i]);
				}
				System.out.println();

				for (int i = 51; i >= 52 - dlCount; i--) {
					String score = card[i].substring(1);
					dealerScore += base.intCard(score);
				}
				System.out.printf("\nscore : %d\n", dealerScore);
				Line.sLine(lineNum);
				
				System.out.println(name + "님의 카드");
				for (int i = 0; i < plCount + 1; i++) {
					System.out.printf("%s   ", card[i]);
				}
				System.out.println();

				playerScore = 0;
				for (int i = 0; i < plCount + 1; i++) {
					String score = card[i].substring(1);
					playerScore += base.intCard(score);
				}
				System.out.printf("\nscore : %d\n", playerScore);
				Line.sLine(lineNum);
				
				if(dealerScore > 21) {
					System.out.println("you win");
					break;
				} else if(playerScore > 21) {
					System.out.println("you lose");
					break;
				} else if (playerScore > dealerScore) {
					System.out.println("you win");
					break;
				} else if (playerScore < dealerScore) {
					System.out.println("you lose");
					break;
				} else if (playerScore == dealerScore) {
					System.out.println("til");
					break;
				}
			} // if Stop 

			if (playerScore == 21) {
				System.out.println("BlackJack!");
			} else if (playerScore > 21) {
				System.out.println("GAME OVER~");
				System.out.println("21을 넘겼습니다");
				break;
			} 

		} // end While
	}// end final~~~~~~

}
