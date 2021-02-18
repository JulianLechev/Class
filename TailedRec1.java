package Profitable;

public class TailedRec1 {
	public static void main(String[] args) {
	   	System.out.println(foo(4,3));
	   	System.out.println(2%1);
	}

	 public static int foo (int x, int y)
	    {
	   	if (y == 0)
	     	    return x;
	   	else
	     	    return foo(y, x % y);
	    }

}
