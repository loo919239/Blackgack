package black.rule;

import java.util.Scanner;

public class Print {
	Scanner scan = null;
	public Print() {
		scan = new Scanner(System.in);
	}
	public void printBlack() {
//		CardRule cardRulse = new CardRule();
		CardRule cardRulse = new CardRule();
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
