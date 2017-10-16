package day03.practice03;

public class Dealer {
	private Deck deck;

	public Dealer(Deck deck) {
		super();
		this.deck = deck;
	}
	
	public Dealer() {
		super();
	}

	public void shuffle() {
		int numCards = deck.size();
		for (int i = 0; i < numCards; i++) {
			int index = (int) (Math.random() * numCards);
			Card cardI = deck.get(i);
			Card cardIndex = deck.get(index);
			deck.replace(i,  cardIndex);
			deck.replace(index, cardI);
		}
	}
	
	public Card dealCard() {
		if (deck.size() > 0) {
			return deck.removeFromFront();
		}
		return null;
	}

}
