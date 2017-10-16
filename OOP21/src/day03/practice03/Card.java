package day03.practice03;

public class Card {
	private int rank;
	private int suit;
	private boolean faceUp;

	public static final int DIAMONDS = 9830;
	public static final int HEARTS = 9829;
	public static final int SPADES = 9824;
	public static final int CLUBS = 9827;

	public static final int TWO = 2;
	public static final int THREE = 3;
	public static final int FOUR = 4;
	public static final int FIVE = 5;
	public static final int SIX = 6;
	public static final int SEVEN = 7;
	public static final int EIGHT = 8;
	public static final int NINE = 9;
	public static final int TEN = 10;
	public static final int JACK = 74;
	public static final int QUEEN = 81;
	public static final int KING = 75;
	public static final int ACE = 65;

	public Card(int suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}

	public void faceUp() {
		faceUp = true;
	}

	public String display() {
		String display;

		if (rank > 10) {
			display = String.valueOf((char) rank);
		} else {
			display = String.valueOf(rank);
		}

		switch (suit) {
		case DIAMONDS:
			return display + String.valueOf((char) DIAMONDS);
		case HEARTS:
			return display + String.valueOf((char) HEARTS);
		case SPADES:
			return display + String.valueOf((char) SPADES);
		default:
			return display + String.valueOf((char) CLUBS);
		}
	}

	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}

	public boolean isFaceUp() {
		return faceUp;
	}

}
