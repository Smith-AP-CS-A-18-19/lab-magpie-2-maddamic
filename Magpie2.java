/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
//Michael Maddalon

public class Magpie2 {
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hola amigo, how are you?";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		// statement = statement.lowerCase();
		String response = "";
		if (statement.indexOf("no") >= 0) {
			response = "Why so negative?";
		} else if (statement.indexOf("I'm good") >= 0
					 || statement.indexOf("Im good") >= 0
					 || statement.indexOf("im good") >= 0)
		{
						 response = "That's great! Tell me more!";
		} else if (statement.indexOf("not good") >= 0
		 			 || statement.indexOf("Not good") >= 0
		 			 || statement.indexOf("I'm bad") >= 0
					 || statement.indexOf("Im bad") >= 0
					 || statement.indexOf("im bad") >= 0)
	  {
		 				 response = "Awwww man. Why's that?";
		} else if (statement.indexOf("How are you") >= 0)
		{
			response = "I'm good. How is life?";
		} else if (statement.indexOf("mother") >= 0
				   || statement.indexOf("father") >= 0
				   || statement.indexOf("sister") >= 0
				   || statement.indexOf("brother") >= 0
					 || statement.indexOf("family") >= 0)
		{
			response = "Tell me more about your family.";
		} else if (statement.indexOf("dog") >= 0
					 || statement.indexOf("cat") >= 0
					 || statement.indexOf("bird") >= 0
					 || statement.indexOf("fish") >= 0
					 || statement.indexOf("rock") >= 0
					 || statement.indexOf("pet") >= 0)
		{
			response = "Tell me more about your pets.";
		} else if (statement.indexOf("football") >= 0
					 || statement.indexOf("basketball") >= 0
					 || statement.indexOf("soccer") >= 0
					 || statement.indexOf("badminton") >= 0
					 || statement.indexOf("hockey") >= 0
					 || statement.indexOf("swimming") >= 0)
		{
			response = "Tell me more about your sports.";
		} else {
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		}

		return response;
	}
}
