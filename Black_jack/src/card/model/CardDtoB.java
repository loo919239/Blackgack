package card.model;

import java.util.List;

public class CardDtoB {
	List<CardDto> cardDeck = null;
	String[] card;
	String patterns;
	String cardNumbers;
	
	public void cardDeck() {
		CardDto dto = new CardDto();
		card = new String[52];
		for (int i = 0; i < card.length; i++) {
			int rndNum1 = (int) (Math.random() * 4) + 1;
			int rndNum2 = (int) (Math.random() * 13) + 1;

			patterns = dto.cardPat(rndNum1);
			cardNumbers = dto.cardNum(rndNum2);

			dto.pattern = patterns;
			dto.cardNumber = cardNumbers;

			card[i] = patterns + cardNumbers;
			for (int j = 0; j < i; j++) {
				if (card[j].equals(card[i])) {
					i--;
					break;
				}
			}

		}
		cardDeck.add(dto);
	}
	public Card drawCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }
}
