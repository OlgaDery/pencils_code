package pencils_test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

//This test class is used to test the methods and the constructor of CardClass

public class CardClassTest {
	CardClass card;
	CardClass card1;
	CardClass card3;
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();
	
	@Before
	public void setUp () {
		card = new CardClass ("C", "2");
		card1 = new CardClass ("C", "4");
		card3 = new CardClass ("C", "2");
	}

	@Test
	public void testEqualsMethod() {
	//This method is to assert that the "equals" method of CardClass 
	//works properly. 
		assertEquals(card, card3);
		assertNotEquals(card, card1);
		
	}
	
	@Test
	public void testToString() {
		//Testing "toString" method of the same class
		assertTrue (card.toString().contains("C"));
		assertTrue (card.toString().contains("2"));
		
	}
	
	
	@Test
	//Testing that the constructor of the same class throws 
	//the NullPointerException with the custom message
	public void testNotNullsInConstructor () throws Exception {
		expectedEx.expect(NullPointerException.class);
	    expectedEx.expectMessage("name must not be null");
	    CardClass c = new CardClass (null, "C");
		
	}

}
