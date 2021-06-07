package lecture_classes.day44_OOP_Practice.CallCenter;

public abstract class MessagingApp {
	
	public String name;
	protected boolean isFree; //just accessible with inheritance
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messanger";
	
	public MessagingApp() {
		System.out.println("MesssaginApp no-args constructor");
	}
	
	public MessagingApp(String name,int count) {
		this.name = name;
		MessagingApp.count = count;
	}

	public abstract void sendMessage(String msg);
	
	public void launch() {
		System.out.println("Messaging App is launch...");
	}
	
	public static void close() {
		System.out.println("Messaging App is closing...");
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}
	
	

}
