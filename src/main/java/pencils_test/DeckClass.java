package pencils_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckClass implements Deck {
//This class implements the Deck interface and the method "getCards()". 
//The rest of the methods were left at the same class for the simplicity, 
//but in a real life it is better to define them in a separate Java business
//logic representing class (like EJB). 


	//This field has to be initialized only ones, so we are making it final
	private final List <Card> cards;
	
	public DeckClass (String [] names, String [] suits) {
	//The static arrays with string values for names and suits may be 
	//hardcoded within this class. At the same time, it is more common to 
	//store such data in files/databases and provide to Java model classes 
	// via dependency injection. So, we have defined a separate StaticArrays 
	//class to store the values.
		
		cards = new ArrayList<Card>(52);
		for (String name: names) {
			for (String suit : suits) {
				Card card = new CardClass (name, suit);
				cards.add(card);
			}
		}
		
	}

	public List<Card> getCards() {
		//inherited method
		return cards;
	}
	
	public void shuffle () {
		//method to shuffle all the cards
		Collections.shuffle(cards);
	}
	
	public Card deal () {
		//removes the card on the top (index 0) and returns this card
		return getCards().remove(0); //
	}
	
	public void dealAll () {
		//removes the cards in order unless the array is not empty
		while (!getCards().isEmpty()) {
			System.out.println(getCards().remove(0));
		}
	}

	
}
