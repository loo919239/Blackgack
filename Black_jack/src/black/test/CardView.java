package black.test;

import java.util.ArrayList;
import java.util.List;

public class CardView {
		public static void main(String[] args) {
			String[] card = {
				String.format("┌──────┐ "),
				String.format("│  %1s   │ ", "patten"),
				String.format("│      │ "),
				String.format("│      │ "),
				String.format("│  %2s  │ ", "cardNum"),
				String.format("└──────┘ ")

			};
		
			
			List<String[]> cardList = new ArrayList();
			cardList.add(card);
			
			int cardLine = card.length;
			for(int arr = 0 ; arr < cardLine ; arr++) {
				int cardCount = cardList.size();
				for(int list = 0 ; list < cardCount ; list++) {
					String[] cards = cardList.get(list);
					System.out.print(card[arr] + "\t");
				}
				System.out.println();
			}
		}

}
