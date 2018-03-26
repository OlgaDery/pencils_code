package pencils_test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

//Testing the Deck class including methods and the properties of the
//array of cards.

public class DeckClassTest {
	DeckClass deck;

	@Before
	public void setUp() throws Exception {
		deck = new DeckClass (StaticArrays.names, 
				StaticArrays.suits);
	}

	@Test
	public void assureQuantity() {
		//Making sure that the size of array is as expected
		assertEquals(52, deck.getCards().size());	
		assertEquals(deck.getCards().getClass().getSimpleName(), 
				"ArrayList");
		
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void assureUniqueness() {
		//Making sure that each card is unique. To achieve this, we are 
		//creating a set of CardClass objects and filling it up with the objects
		//from the CardClass arraylist of DeckClass. If there are duplicates,
		//they will be removed in the set and it`s size will be different than
		//the size of source arraylist.
		
		Set<CardClass> set = new HashSet<CardClass>();
		int size = deck.getCards().size();
		set.addAll((Collection<? extends CardClass>) deck.getCards());
		assertEquals (size, set.size());
		
	}
	
	@Test
	public void testDealOneCard() {
		//Testing the deal() method of the DeckClass. Asserting that it 
		//returns the first card of the array of cards (CardClass objects).
		DeckClass newDeck = new DeckClass (StaticArrays.names, 
				StaticArrays.suits);
		newDeck.shuffle();
		CardClass initCard = (CardClass) newDeck.getCards().get(0);
		assertEquals (newDeck.deal(), initCard);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testShuffle() {
		//Testing the DealEach() method of the DeckClass. Making sure that
		//it empties the array.
		DeckClass newDeck = new DeckClass (StaticArrays.names, 
				StaticArrays.suits);
		List<CardClass> cards = new ArrayList<CardClass>(newDeck.getCards().size());
		cards.addAll((Collection<? extends CardClass>) newDeck.getCards());
		newDeck.shuffle();
		int count = 0;
		boolean notEqualFound = false;
		for (Card c: cards) {
			if (c.equals(newDeck.getCards().get(count))) {
				count++;
			} else {
				notEqualFound = true;
				break;
				
			}
		}
		assertTrue (notEqualFound);
	}

	@Test
	public void testDealAll() {
		//Testing the DealEach() method of the DeckClass. Making sure that
		//it empties the array.
		DeckClass newDeck = new DeckClass (StaticArrays.names, 
				StaticArrays.suits);
		newDeck.dealAll();
		assertTrue (newDeck.getCards().isEmpty());
	}

}
