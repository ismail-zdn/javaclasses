package lecture_classes.day45_Error_Exception;

public class RuntimeError {

	public static void main(String[] args) {
		go();
	}
	
	public static void go() {
		System.out.println("Going");
		go();
	}
	
	//StackOverflowError
}
