package Profitable;

public class TailedRec2 {

	public static void main(String[] args) {
		System.out.println(sum(5));
	}
	
	
	public static int sum(int n) {
		return sum(n,1);
	}

	
	public static int sum(int n, int res) {
		if(n == 0) {
			return res;
		}
		else {
			return sum(n-1, res + n);
		}
		
	}
}
