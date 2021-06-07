package lecture_classes.day25_arrays_part2;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] products = {"Timberland","Shirt","Watch"};
		
		int[] prices = {100,55,99,45,56};
		
		for (int i = products.length-1; i >= 0 ; i--) {
			System.out.println(products[i]);
		}
		
		System.out.println("222222222222222222222");
		
		for (String hebele : products) {
			System.out.println(hebele);
		}
		
		System.out.println("222222222222222222222");
		
		for (int i : prices) {
			System.out.println(i);
		}

	}

}
