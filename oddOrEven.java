package Profitable;

public class oddOrEven {

	
	public static void main(String[] args) {

	System.out.println(odd(168));
	System.out.println(even(169));

	}
	
	
	public static boolean odd(int a) {
		
		if(a == 0) {
			return false;
		}
		else if(a==1) {
			return true;
		}
		
		
			return(odd(a-2));
			//??????????????????
		
	}
	
	public static boolean even(int a) {
		if(a == 0) {
			return true;
		}
		else if(a==1) {
			return false;
		}
		
		
			return(even(a-2));
	}
	
	
}
