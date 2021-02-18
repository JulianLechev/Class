package Profitable;

public class Recursion2 {
	public static void main(String[] args) {
	   	 reverse(4321);
	}

	public static void reverse(int n) {
	   
		while(n!=0) {
			System.out.print(n%10);
			n= n/10;
		}
		
	 }

}
