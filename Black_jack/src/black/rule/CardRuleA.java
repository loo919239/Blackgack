package black.rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import black.card.CardBase;
import black.service.RuleService;

public class CardRuleA implements RuleService {
	Scanner scan = null;
	String[] card;
	String patterns;
	String cardNumbers;
	
	List<String[]> cardList = null;
	
	String[] cardView;
	
	public CardRuleA() {
		scan = new Scanner(System.in);
		cardList = new ArrayList<String[]>();
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
			String[] cardView = {
					String.format("┌──────┐ "),
					String.format("│  %1s   │ ", card[i].substring(0,1)),
					String.format("│      │ "),
					String.format("│      │ "),
					String.format("│  %2s  │ ", card[i].substring(1)),
					String.format("└──────┘ ")
					
			};
			cardList.add(cardView);
		}// end for 1

		
		
		
	}// end cardDeck()

	public void printBlackJeckFinal() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dealerScore(int dlCount, int dealerScore) {
		// TODO Auto-generated method stub
	}

	@Override
	public void playererScore(int plCount, int playerScore) {
		// TODO Auto-generated method stub
		
	}


	
	

}
