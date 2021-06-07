package lecture_classes.day45_Error_Exception;

public class ThrowAndThrows {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Hello World");
		
		//throw new RuntimeException("This is some exception.");
		
		try {
			throw new Exception("Another exception");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		String username="";
		
		if (username.isEmpty()) {
			throw new RuntimeException("USername can not be empty.");
		}else {
			System.out.println("Valid username");
		}
		
		//throw new Exception("Another exception");
		
		sleep3(2);
		
	}
	
	public static void sleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds*1000);
	}
	
	public static void sleep2(int seconds) throws InterruptedException {
		sleep(seconds);
	}
	
	public static void sleep3(int seconds) {
		try {
			sleep2(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
