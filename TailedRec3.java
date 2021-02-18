package Profitable;

public class TailedRec3 {

	public static void main(String[] args) {
		System.out.println(degree(2,10));

	}

	public static int degree(int n, int deg) {
		return degree(n, deg, 1);
	}
	
	public static int degree(int n,int deg, int res) {
		if(deg == 0) {
			return res;
		}
		else {
			return degree(n,deg-1, res*n);
		}
	}
	
}
