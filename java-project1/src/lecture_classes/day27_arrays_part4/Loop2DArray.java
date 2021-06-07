package lecture_classes.day27_arrays_part4;

import java.util.Arrays;

public class Loop2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] pizzas = {
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccuni","brocoli","spinach"}
		};
		
		System.out.println(Arrays.toString(pizzas[0]));
		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("--------------");
		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length +"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		
		System.out.println("--------------");
		for (String pizza : pizzas[3]) {
			System.out.println(pizza);
		}
		
		System.out.println("--------------");
		
		int[][] students = {
			{4,5,6},
			{12,5,7},
			{23,56,12,55,3}
		};
		
		for (int[] group : students) {
			for(int studentID : group) {
				System.out.println(studentID);
			}
		}
		
		System.out.println("--------------");
		
		

	}

}
