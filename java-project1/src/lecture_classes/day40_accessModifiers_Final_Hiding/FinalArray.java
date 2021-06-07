package lecture_classes.day40_accessModifiers_Final_Hiding;

import lecture_classes.day27_arrays_part4.Teams;

public class FinalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int[] TEAMS = {
				11,11
		};
		
		System.out.println(TEAMS[0]);
		
		TEAMS[0] = 99;
		
		System.out.println(TEAMS[0]); // there is no problem.
		
		int nums[] = new int[] {20,20,30};
		nums=new int[] {4,2}; // the reference is changed.
		
		//TEAMS = new int [] {4,9,6,6}; //The final local variable TEAMS cannot be assigned
		// You can not change reference
	}

}
