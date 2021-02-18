package Profitable;

public class decToBinary {

	public static void main(String[] args) {
		System.out.println(dec2Bin(75));
	}

	
	public static String dec2Bin ( int a ) {
		
		if(a == 1) {
			return "1";
		}
		
		return dec2Bin(a/2) + a%2;
	}

}
