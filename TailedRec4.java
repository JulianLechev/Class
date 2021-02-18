package Profitable;

public class TailedRec4 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1,2,7};
		System.out.println(avg(arr,arr.length));
		
	}

	public static double avg(int[] arr, int length) {
		return avg(arr,length,0)/length;
	}
	
	public static double avg(int[] arr, int length, double res) {
		
		if(length == 0) {
			return res;
		}
		else {
			return avg(arr,length-1,res+arr[length-1]);
		}
		
		
		
	}
	
}
