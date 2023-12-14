package black.test;

public class CardRuleTest {

	public CardRuleTest() {
		super();
	}

//	public void printBlackJeckFinal() {
//		CardBase base = new CardBase();
//		this.cardDeck();
//		int playerScore = 0;
//		int dealerScore = 0;
//
//		int lineNum = 20;
//
//		Line.dLine(lineNum);
//		System.out.print("\t   BlackJekc");
//		System.out.println("(v1.00.00)");
//		Line.sLine(lineNum);
//
//		System.out.print("플레이어의 이름을 입력해 주세요 >> ");
//		String name = scan.nextLine();
//		Line.dLine(lineNum);
//
//		System.out.println("딜러에게 전달된 카드");
//		System.out.printf("%s   %s\n", card[51], card[50]);
//
//		int dlCount = 2;
//		for (int i = 51; i >= 52 - dlCount; i--) {
//			String score = card[i].substring(1);
//			dealerScore += base.intCard(score);
//		}
//		System.out.printf("\nscore : %d\n", dealerScore);
//		Line.sLine(lineNum);
//
//		System.out.println(name + "님에게 전달된 카드");
//		System.out.printf("%s   %s\n", card[0], card[1]);
//
//		int plCount = 1;
//		for (int i = 0; i < plCount + 1; i++) {
//			String score = card[i].substring(1);
//			playerScore += base.intCard(score);
//		}
//		System.out.printf("\nscore : %d\n", playerScore);
//		Line.sLine(lineNum);
//
////	while	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
//		while (true) {
//			System.out.println("한장 더 뽑으시겠습니까?");
//			System.out.print("(Hit/Stop) >> ");
//			String str = scan.nextLine();
//
//			if (dealerScore < 17) {
//				for (int i = 0; i < i + 1; i++) {
//					i++;
//					System.out.println("딜러가 뽑은 카드");
//					System.out.println(card[51 - dlCount]);
//					dlCount++;
//					break;
//				}
//			}
//
//			if (str.equals("Hit")) {
//				plCount++;
//				for (int index = 0; index < index + 1; index++) {
//					index++;
//					System.out.println(name + "님이 뽑은 카드");
//					System.out.println(card[plCount]);
//					Line.sLine(lineNum);
//					break;
//				}
//			}
//
//			dealerScore = 0;
//			System.out.println("딜러가 보유중인 카드");
//			for (int i = 51, j = dlCount; i >= 52 - dlCount; i--, j++) {
//				card[j] = card[i];
//				System.out.printf("%s   ", card[j]);
//			}
//			System.out.println();
//
//			for (int i = 51; i >= 52 - dlCount; i--) {
//				String score = card[i].substring(1);
//				dealerScore += base.intCard(score);
//			}
//			System.out.printf("\nscore : %d\n", dealerScore);
//			Line.sLine(lineNum);
//
//			System.out.println(name + "님이 보유중인 카드");
//			for (int i = 0; i < plCount + 1; i++) {
//				System.out.printf("%s   ", card[i]);
//			}
//			System.out.println();
//
//			playerScore = 0;
//			for (int i = 0; i < plCount + 1; i++) {
//				String score = card[i].substring(1);
//				playerScore += base.intCard(score);
//			}
//			System.out.printf("\nscore : %d\n", playerScore);
//			Line.sLine(lineNum);
//
//			if (str.equals("Stop")) {
//				if (playerScore > dealerScore) {
//					System.out.println("you win");
//					break;
//				} else if (playerScore < dealerScore) {
//					System.out.println("you lose");
//					break;
//				} else if (playerScore == dealerScore) {
//					System.out.println("til");
//					break;
//				}
//			}
//
//			if (playerScore == 21) {
//				System.out.println("BlackJack!");
//				System.out.println("you Win");
//				break;
//			} else if (playerScore > 21) {
//				System.out.println("GAME OVER~");
//				System.out.println("21을 넘겼습니다");
//				break;
//			} else if (dealerScore > 21) {
//				System.out.println("you Win");
//				System.out.println("딜러가 21을 넘었습니다");
//				break;
//			}
//
//		} // end While
//	}// end final~~~~~~

}
