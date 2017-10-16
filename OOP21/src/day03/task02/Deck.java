package day03.task02;

import java.util.LinkedList;

import day03.practice03.Card;

/*Измените класс так, чтобы экземпляр класса
мог отобразить сам себя*/

public class Deck {
	private LinkedList<Card> deck;

	public Deck() {
		super();
		buildCards();
	}

	private final void buildCards() {
		deck = new LinkedList<>();

		deck.add(new Card(Card.CLUBS, Card.TWO));
		deck.add(new Card(Card.CLUBS, Card.THREE));
		deck.add(new Card(Card.CLUBS, Card.FOUR));
		deck.add(new Card(Card.CLUBS, Card.FIVE));
		deck.add(new Card(Card.CLUBS, Card.SIX));
		deck.add(new Card(Card.CLUBS, Card.SEVEN));
		deck.add(new Card(Card.CLUBS, Card.EIGHT));
		deck.add(new Card(Card.CLUBS, Card.NINE));
		deck.add(new Card(Card.CLUBS, Card.TEN));
		deck.add(new Card(Card.CLUBS, Card.JACK));
		deck.add(new Card(Card.CLUBS, Card.QUEEN));
		deck.add(new Card(Card.CLUBS, Card.KING));
		deck.add(new Card(Card.CLUBS, Card.ACE));

		deck.add(new Card(Card.SPADES, Card.TWO));
		deck.add(new Card(Card.SPADES, Card.THREE));
		deck.add(new Card(Card.SPADES, Card.FOUR));
		deck.add(new Card(Card.SPADES, Card.FIVE));
		deck.add(new Card(Card.SPADES, Card.SIX));
		deck.add(new Card(Card.SPADES, Card.SEVEN));
		deck.add(new Card(Card.SPADES, Card.EIGHT));
		deck.add(new Card(Card.SPADES, Card.NINE));
		deck.add(new Card(Card.SPADES, Card.TEN));
		deck.add(new Card(Card.SPADES, Card.JACK));
		deck.add(new Card(Card.SPADES, Card.QUEEN));
		deck.add(new Card(Card.SPADES, Card.KING));
		deck.add(new Card(Card.SPADES, Card.ACE));

		deck.add(new Card(Card.HEARTS, Card.TWO));
		deck.add(new Card(Card.HEARTS, Card.THREE));
		deck.add(new Card(Card.HEARTS, Card.FOUR));
		deck.add(new Card(Card.HEARTS, Card.FIVE));
		deck.add(new Card(Card.HEARTS, Card.SIX));
		deck.add(new Card(Card.HEARTS, Card.SEVEN));
		deck.add(new Card(Card.HEARTS, Card.EIGHT));
		deck.add(new Card(Card.HEARTS, Card.NINE));
		deck.add(new Card(Card.HEARTS, Card.TEN));
		deck.add(new Card(Card.HEARTS, Card.JACK));
		deck.add(new Card(Card.HEARTS, Card.QUEEN));
		deck.add(new Card(Card.HEARTS, Card.KING));
		deck.add(new Card(Card.HEARTS, Card.ACE));

		deck.add(new Card(Card.DIAMONDS, Card.TWO));
		deck.add(new Card(Card.DIAMONDS, Card.THREE));
		deck.add(new Card(Card.DIAMONDS, Card.FOUR));
		deck.add(new Card(Card.DIAMONDS, Card.FIVE));
		deck.add(new Card(Card.DIAMONDS, Card.SIX));
		deck.add(new Card(Card.DIAMONDS, Card.SEVEN));
		deck.add(new Card(Card.DIAMONDS, Card.EIGHT));
		deck.add(new Card(Card.DIAMONDS, Card.NINE));
		deck.add(new Card(Card.DIAMONDS, Card.TEN));
		deck.add(new Card(Card.DIAMONDS, Card.JACK));
		deck.add(new Card(Card.DIAMONDS, Card.QUEEN));
		deck.add(new Card(Card.DIAMONDS, Card.KING));
		deck.add(new Card(Card.DIAMONDS, Card.ACE));
	}

	public String display() {
		int numCards = deck.size();
		String display = "";
		int counter = 0;
		for (int i = 0; i < numCards; i++) {
			Card card = deck.get(i);
			display += card.display() + " ";
			counter++;
			if (counter == 13) {
				counter = 0;
				display += System.lineSeparator();
			}
		}
		return display;
	}

	public Card get(int index) {
		if (index < deck.size()) {
			return deck.get(index);
		}
		return null;
	}

	public void replace(int index, Card card) {
		deck.set(index, card);
	}

	public int size() {
		return deck.size();
	}

	public Card removeFromFront() {
		if (deck.size() > 0) {
			Card card = deck.removeFirst();
			return card;
		}
		return null;
	}

	public void retrunToBack(Card card) {
		deck.add(card);
	}

}
