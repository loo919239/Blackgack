package black.rule;

import java.util.Scanner;

public class Print {
	Scanner scan = null;
	public Print() {
		scan = new Scanner(System.in);
	}
	public void printBlack() {
		CardRuleB cardRulse = new CardRuleB();
//		CardRule2 cardRulse = new CardRule2();
		
		System.out.println("[Web발신]");
		System.out.println("(광고)'Black Jack 하고 갈래요?'");
		System.out.println("기다리던 그 게임, 드디어 출시!!\n");
		System.out.print("$$지금 바로 플레이 하세요!!$$\n"
				+ "Ｂｌａ✰ｃｋ ★ Ｊａｃｋ✠ ㅂㅏ로ㄱrㄱ1 (Enter) →");
		System.out.println();
		String next = scan.nextLine();
		
		while(true) {
			cardRulse.printBlackJeckFinal();
			System.out.println("게임을 재시작 하겠습니까?(Yse/No)");
			String str = scan.nextLine();
			if(str.equals("Yes")) {
				System.out.println("게임을 재시작 합니다\n");
				continue;
			}else if (str.equals("No")) {
				System.out.println("게임을 종료 합니다");
				break;
			}
		}
	}

}
