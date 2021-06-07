package lecture_classes.day45_Error_Exception;

public class TryCatch2 {
public static void main(String[] args) {
	
	int[] nums = {36,6,34,12};

	try {
		System.out.println(nums[6]);
	} catch (Exception e) {
		e.printStackTrace();	
		System.out.println(e.getMessage());
	}

	System.out.println("hebele");
	
	
	try {
		int j=100;
		int n=j/0;
	} catch (ArithmeticException e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
