package lecture_classes.day27_arrays_part4;

public class Task95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] scores = {
				{68,75,54,80},
				{100,64,20,50},
				{10,35,90}
		};
		int sum =0;
		
		for (int i = 0; i < scores[0].length; i++) {
			
			sum = sum+scores[0][i];
		}
		
		System.out.println("Avg of student-1: "+sum/scores[0].length);
		sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum= sum+scores[i][0];
		}
		
		System.out.println("Total math scores: "+sum);

	}

}
