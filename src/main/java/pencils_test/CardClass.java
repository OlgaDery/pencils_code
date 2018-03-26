/**
 * 
 */
package pencils_test;

import java.util.Objects;

/**
 * @author olga
 * This class implements the Card interface and overrides it`s 2 methods.
 *
 */
public class CardClass implements Card {
	
	//As soon as the fields of the class are supposed to be initialized 
	//just ones (when the new instance is being created), it makes sense
	//to set all the fields via constructor (as parameters) and to make 
	//all the fields final.
	
	private final String name;
	
	private final String suit;
	
	public CardClass (String n, String s) {
	//It is critical to assure that any of the params is not null, because
	// in a real life all the cards in the deck have both properties.
		
		this.name = Objects.requireNonNull(n, "name must not be null");
		this.suit = Objects.requireNonNull(s, "suit must not be null");
	}

	/* (non-Javadoc)
	 * @see pencils_test.Card#getName()
	 */
	public String getName() {
		return name;
	}

	/* (non-Javadoc)
	 * @see pencils_test.Card#getSuit()
	 */
	public String getSuit() {
		return suit;
	}

	//Overriding "toString" method to output the information regarding 
	//the specific card.
	@Override
	public String toString() {
		return "Name: " + this.name + ", "+ "Suit: " + this.suit;
	}
	
	//The methods below are used mostly for test- they are required to make sure that there
	//are no duplicates in a deck of cards.

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardClass other = (CardClass) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}
	

}
