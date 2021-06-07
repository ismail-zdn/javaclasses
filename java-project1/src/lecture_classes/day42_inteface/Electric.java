package lecture_classes.day42_inteface;

public interface Electric {
	
	public static final boolean HAS_BATARRIES= true;
	
	boolean HAS_BATARRIES2 = false; // it is automatically public final static 
	
	public abstract void charge();

	void charge2(); // it is automatically public abstract
	
	public default void methodA() {
		//code
	}
	public static void methodB() {
		//code
	}
}
