package lecture_classes.day44_OOP_Practice.CallCenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = false; //can only public static final
	
	void call(String contact);// public abstract void call
	
	public static void decline() {
		System.out.println("Mike declined voice call..."); //we can NOT override it
	}
	
	//we can override public default methods
	//default keyword just for interfaces. when we override it we don't use default keyword.
	public default void accept() {
		System.out.println("Mike finally accepted voice call...");  
	}
}
