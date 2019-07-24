package _06_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		
		
			

		
	}
		
	
		//Single For Loops
		
		//1. Display all numbers from 0 to 100
		static void numberOne() {
			for(int i = 0; i <= 100; i++) {
				System.out.println(i);
			}
		}
	
		
		
		//2. Display all numbers from 100 to 0
		static void numberTwo() {
			for(int j = 100; j >= 0; j--) {
				System.out.println(j);
			}
		}
		
	
	
		//3. Display all even numbers from 2 to 100
		static void numberThree() {
			for(int k = 2; k <= 100; k++) {
				if(k % 2 == 0) {
					System.out.println(k);
				}
			}
		}


		//4. Display all odd numbers from 1 to 99
		static void numberFour() {
			for(int l = 1; l <= 99; l++) {
					if(l % 2 != 0) {
						System.out.println(l);
					}
				}
			}
		
		

		//5.Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
		static void numberFive() {
			for(int p = 1; p <= 500; p++) {
				if(p % 2 == 0) {
					System.out.println(p + " is even");
				} else {
					System.out.println(p + " is odd");
				}
			}
		}
		
		
		//6. Display all multiples of 7 from 0 to 777.
		static void numberSix() {
			for(int o = 0; o <= 777; o++) {
				if(o % 7 == 0) {
					System.out.println(o);
				}
			}
		}
		

		//7. Print all the years you were alive and how old you were in each. e.g. “In 1979, i was 2 years old.” (for a really old person)
		static void numberSeven() {
			for(int o = 0; o <= 15; o++) {
				int t = 2004 + o;
				System.out.println("in " + t + ", i was " + o + " years old.");
			}
		}

//---------------------------------- Nested For Loops ----------------------------------\\
		
		//1.
		static void NFLOne() {
			for(int c = 0; c < 3; c++) {
				for(int b = 0; b < 3; b++) {
					System.out.println(b);
					for(int a = 0; a < 3; a++) {
						System.out.println(a+1);
					}	
				}
			}
		}
		
		
		
		//2.
		static void NFLTwo() {
			for(int a = 0; a < 3; a++) {
				System.out.println((1 + (a * 3)) + " " + (2 + (a * 3)) + " " + (3 + (a * 3)) );
			}
		}

		
		
		//3.
		static void NFLThree() {
			for(int a = 0; a < 10; a++) {
				System.out.println((1 + (a * 10)) + " " + (2 + (a * 10)) + " " + (3 + (a * 10)) + " " + (4 + (a * 10)) + " " + (5 + (a * 10)) + " " + (6 + (a * 10)) + " " + (7 + (a * 10)) + " " + (8 + (a * 10)) + " " + (9 + (a * 10)) + " " + (10 + (a * 10)));
			}
		}

		
		
		//4.
		static void NFLFour() {
			for(int i = 0; i < 6; i++) {
				if(i == 0) {
					System.out.println("*");
				} else if(i == 1) {
					System.out.println("* *");
				} else if(i == 2) {
					System.out.println("* * *");
				} else if(i == 3) {
					System.out.println("* * * *");
				} else if(i == 4) {
					System.out.println("* * * * *");
				} else if(i == 5) {
					System.out.println("* * * * * *");
				}
			}
		}

		
		
//---------------------------------- Nested For Loops ----------------------------------\\



		//Bonus
		static void bonus() {
			for(int i = 0; i >= -100; i--) {
				int l = i + 100;
				System.out.println(l);
			}
		}





}



