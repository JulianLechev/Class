package Profitable;

public class Recursion1 {

	public static void main(String[] args) {
		 System.out.println("Sum is " + sum(3));


	}
	
	
	public static int sum(int n) {
		int result = 0;
		for(int i = 1; i <= n;i++) {
			result += i;
		}
		
		return result;
	}
	

}
