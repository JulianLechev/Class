package Profitable;

public class Recursion3 {

	public static void main(String[] args) {
		
		System.out.println(degree(6));
		

	}

		public static int degree(int n){
			int ans = 0;
			if(n == 1) {
				return 2;
			}
			else {
				ans = degree(n-1)*2;
			}
			return ans;
		}
		
		
//		public static int degree(int n) {
//			int ans = 1;
//			while(n!=0) {
//				
//			ans *= 2;	
//			n--;
//			}
//			return ans;
//		}
		
		
}
