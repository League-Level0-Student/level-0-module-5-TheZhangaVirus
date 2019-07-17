package _04_guessing_pi;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;
import java.util.Random;


public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {
		// 2. Make a String variable to hold the value of Pi.
		//    Get the first few digits from http://www.piday.org/million/.
		String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406";
		// 3. Print out the first 3 digits of Pi to the console.
		//    The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		//    Run your program to see how this works.
	
		//for(int i = 0; i < 4; i++) {
			
		//	System.out.println(pi.charAt(i));
			
		//}
		
		// 9. If you want to give the user more than one chance to guess,
		//    put a for loop around steps 4-8.

			// 4. Create a for loop that will step through each digit of pi (steps 5-8)
			//    NOTE: The number of digits in your string will be
			//       yourStringVariable.length()
		
		Random randomGenerator = new Random();
		int random = randomGenerator.nextInt(73);
		//System.out.println(pi.length()); (74 digits incl. the '.')
		
		for(int i = 0; i < random; i++) {
			System.out.println(pi.charAt(i));
				// 5. Ask the user for the NEXT digit of pi.

				// 6. Compare the user's input to the next digit of your pi variable 
				//    (look at step 3 for a clue).
				//    HINT: use charAt(0) to get 1st char of user input String 

					// 7. If they are correct, print out "correct".
		}
		
		String last = String.valueOf(pi.charAt(random));
		
		String answer = JOptionPane.showInputDialog("what's the next digit of pi? (digits before printed in console");
		
		if(last.equals(answer)) {
			System.out.println("you are correct, it is, in fact, " + last);
		} else {
			System.out.println("you are wrong, it is " + last);
		}
					// 8. If they are not, print out "incorrect" and tell them
					//    to start over. Use 'break;' to break out of the loop.
	}
}


