package lecture_classes.day40_accessModifiers_Final_Hiding;

import java.awt.Color;
import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ArrayList<String> COLORS = new ArrayList<>(); 
		
		COLORS.add("red");
		
		//COLORS = new ArrayList<>(); 
		//The final local variable COLORS cannot be assigned.
		// You can change reference.
	}

}
