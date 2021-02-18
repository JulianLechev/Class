package Profitable;

public class Hanoi {

	public static void main(String[] args) {
		
		moveDisks(4,'A','B','C');
	}
	
	
	public static void moveDisks(int a,char startTower, char helpTower, char goalTower ) {
		
		if(a ==1) {
			System.out.println("Move disk " + a +  " from " + startTower + " to " + goalTower);
		}
		else {
			moveDisks( a-1,  startTower,   goalTower,  helpTower );
			System.out.println("Move disk " + a +  " from " + startTower + " to " + goalTower);
			moveDisks(a-1,startTower, helpTower, goalTower);
		}
	}
	
	

}
