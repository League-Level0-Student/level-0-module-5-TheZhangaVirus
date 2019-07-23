package _06_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		
		NFLOne();
	

		
	}
		
	
		//Single For Loops
		
		//1. Display all numbers from 0 to 100
		static void numberOne() {
		} {
			for(int i = 0; i <= 100; i++) {
				System.out.println(i);
			}
		}
	
		
		
		//2. Display all numbers from 100 to 0
		static void numberTwo() {
		} {
			for(int j = 100; j >= 0; j--) {
				System.out.println(j);
			}
		}
		
	
	
		//3. Display all even numbers from 2 to 100
		static void numberThree() {
		} {
			for(int k = 2; k <= 100; k++) {
				if(k % 2 == 0) {
					System.out.println(k);
				}
			}
		}


		//4. Display all odd numbers from 1 to 99
		static void numberFour() {
		} {
			for(int l = 1; l <= 99; l++) {
					if(l % 2 != 0) {
						System.out.println(l);
					}
				}
			}
		
		

		//5.Display all numbers from 1 to 500. If the number is odd, print “odd” next to the number. If the number is even, print “even” next to the number.
		static void numberFive() {
		} {
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
		} {
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

//---------------------------------- Nested For Loops ----------------------------------
		
		//1.
		static void NFLOne() {
		} {
			for(int c = 0; c < 3; c++) {
				for(int b = 0; b < 3; b++) {
					System.out.println(b);
					for(int a = 0; a < 3; a++) {
						System.out.println(a+1);
					}	
				}
			}
		}
		
}