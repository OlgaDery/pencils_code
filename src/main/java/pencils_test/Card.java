package pencils_test;

public interface Card {
//For this specific project the creation of the interface for 
//each model class may be ignore, but it is useful for real-life 
//projects, where one template interface can have multiple Java classes 
//implementing it`s methods (like JTO and Entity classes).	

	//get the name of the card
	String getName ();
	
	//get the suit
	String getSuit();
}
