package _02_fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 1;
		int num3 = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		for(int i = 0; i < 3; i++) {
			
			num1 = num2 + num3;
			System.out.println(num1);
			num2 = num1 + num3;
			System.out.println(num2);
			num3 = num1 + num2;
			System.out.println(num3);
			
		}
	}
	
}
