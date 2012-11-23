/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package variabledemo;

/**
 *
 * @author kaiserfarrell
 */
public class Variabledemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //decclare and intialixe viable
		String myname = "Kaiser Farrell", openingMesssage,nameMessage, ageMessage,weightMessage, heightMessage, outputMessage;
		
		double myTrueAge = 20.5, myTrueWeight = 170.5, myHeight = 6.45;
		int	myAge, myWeight;
		
		// type cast double as integets
		myAge = (int) myTrueAge;
		myWeight = (int) myTrueWeight;
		
		//build individual strings
		openingMesssage = "This is testing variable demo!\n\n";
		nameMessage		= "Myname is " + myname + ".\n";
		ageMessage		= "My age is " + myAge + "years.\n";
		weightMessage	= "My weight is " + myWeight + "pound.\n";
		heightMessage	= "My height is " + myHeight + "feet.\n";
		
		//create output string
		outputMessage = openingMesssage + nameMessage + ageMessage  + weightMessage + heightMessage ;
		
		//print output
		System.out.println( outputMessage );
    }
}
