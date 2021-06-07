package lecture_classes.day27_arrays_part4;

public class RaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = new int[4][];
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
		
		array[1][3] = 45;
		
		System.out.println(array[1][3]);
		
		System.out.println(array[0].length);
		
		System.out.println(array[0][1]);
	}

}
