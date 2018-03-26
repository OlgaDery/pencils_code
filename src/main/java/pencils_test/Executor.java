/**
 * 
 */
package pencils_test;

/**
 * @author olga
 *
 */
public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Method to run all the business logic methods from DeckClass
		DeckClass deck = new DeckClass(StaticArrays.names, 
				StaticArrays.suits);
		
		deck.shuffle();
		
		System.out.println("*************");
		
		System.out.println("Deal: " + deck.deal());	
		
		System.out.println("*************");
		
		System.out.println("Dealing all cards: ");
		deck.dealAll();

	}
}
