package lecture_classes.day11_loops;

public class Loops_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 7; i++) {
			
			
			
			for (int j = 0; j < 6; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		/////////////task-48
		
		for (int i = 1; i <= 7; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		///////////////// task 49
		
for (int i = 1; i <= 6; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
				
			}
			
			System.out.println("#");
		}

///////////////// task 49

for (int i = 1; i <= 5; i++) {
	
	for (int j = 1; j <= i; j++) {
		System.out.print(j+" ");
		
	}
	
	System.out.println();
}

		

	}

}
