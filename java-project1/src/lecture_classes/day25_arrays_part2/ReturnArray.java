package lecture_classes.day25_arrays_part2;

public class ReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] values;
		
		values = getArray();
		
		for (double d : values) {
			System.out.println(d+" ");
		}

	}
	
	public static double[] getArray() {
		double[] array = {1.30,2.9,3.7,4.5,5.9,6.1};
		
		return array;
	}

}
