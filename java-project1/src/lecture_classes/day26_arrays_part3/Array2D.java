package lecture_classes.day26_arrays_part3;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = new int[3][4];
		
		System.out.println(scores[0]); //address
		System.out.println(scores[1]); //address
		
		scores[0][3] = 4;
		
		scores[2][0] = 99;
		
		System.out.println(scores[0][3]);
		System.out.println(scores[2][0]+1);
		
		

	}

}
