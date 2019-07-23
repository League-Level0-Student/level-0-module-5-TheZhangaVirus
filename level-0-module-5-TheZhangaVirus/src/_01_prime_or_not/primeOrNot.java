package _01_prime_or_not;

import javax.swing.JOptionPane;

public class primeOrNot {
	
	public static void main(String[] args) {
		
		String number = JOptionPane.showInputDialog("enter a number");
		int Number = Integer.parseInt(number); {
		
			boolean prime = false;
			
					for(int i = Number-1; i > 1; i--) {
					if(Number % i != 0) {
						prime = true;
					} else if(Number % i == 0) {
						prime = false;
						System.out.println("composite");
						System.exit(0);
					}

				}
					System.out.println("prime");	
		}
	}
}