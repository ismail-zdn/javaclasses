package lecture_classes.day45_Error_Exception;

public class CheckedVSUncheckedException {
	
	public static void main(String[] args) {
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
