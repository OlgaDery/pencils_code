package pencils_test;

import java.util.List;
//This is a template interface for the DeckClass. It provides the 
//only one mandatory method (because the rest of the methods to manipulate
//a Deck object, like "shuffle" and "deal" may be declared within the
//scopes of the DeckClass as well as within a separate class representing the
//business logic methods.

public interface Deck {
	
	List<Card> getCards();

}
