package card.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceB {
	List<Service> service = null;
	String[] card;
	Scanner scan = null;
	
	public ServiceB() {
		service = new ArrayList<Service>();
		scan = new Scanner(System.in);
	}
	public void cardDeck() {
		Service service = new Service();
		card = new String[52];
		for (int i = 0; i < card.length; i++) {
			int rndNum1 = (int) (Math.random() * 4) + 1;
			int rndNum2 = (int) (Math.random() * 13) + 1;
		
			String patterns1 = service.cardPat(rndNum1);
			String cardNumbers1 = service.cardNum(rndNum2);
			
			card[i] = patterns1 + cardNumbers1;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}
		}
	}

	public void start() {
		System.out.println("플레이어에게 전달된 카드");
		System.out.printf("%s\t%s\n",card[0],card[1]);
		System.out.println("딜러에게 전달된 카드");
		System.out.printf("%s\t%s\n",card[51],card[50]);
		System.out.println("한장 더 뽑으시겠습니까?(Hit/Stop)");
		String str = scan.nextLine();
		// Hit 입력 시
		if(str.equalsIgnoreCase("Hit")) {
			System.out.println(card[2]);
			
			
		} else if (str.equalsIgnoreCase("Stop")) {
			System.out.println("");
//			System.out.println("딜러의 숫자");
//			String strCardNum = "0";
//			if (service.size() > 0) {
//				strCardNum = service.get(service.size() - 1).cardNumber;
//			}
//
//			int intStdNum = Integer.valueOf(strCardNum.substring(1));
//			System.out.println(intStdNum);
		}
		
		// stop 입력 시
		
		
	}
	
}
