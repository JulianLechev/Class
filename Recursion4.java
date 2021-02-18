package Profitable;

public class Recursion4 {

	public static void main(String[] args) {
		System.out.print(degree(2,10));
		
	}
	
	
//	public static int degree(int x, int n) {
//		
//		int ans = 0;
//		if(n == 1) {
//			return x;
//		}
//		else {
//			ans = degree(x,n-1)*x;
//		}
//		return ans;
//	}
//	
	
	public static int degree(int x, int n) {
		int ans = 1;
		while(n!=0) {
			ans *= x;
			n--;
		}
		return ans;
	}
	

}
