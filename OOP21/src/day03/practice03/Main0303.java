package day03.practice03;

/*Please note: to display unicode characters need to 
 * set Run -> Run Configuration -> Common to UTF*/
public class Main0303 {
	public static void main(String[] args) {
		Deck deckOne = new Deck();
		Dealer dealerJohn = new Dealer(deckOne);
			
		dealerJohn.shuffle();

		Card card;
		while ((card = dealerJohn.dealCard()) != null) {			
			System.out.println(card.display());
		}
	}
}
