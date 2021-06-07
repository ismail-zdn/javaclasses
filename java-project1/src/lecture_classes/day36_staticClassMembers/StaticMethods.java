package lecture_classes.day36_staticClassMembers;

public class StaticMethods {
	
	static String name ="Apple";
	int age = 10;
	
	public static void show1() {
		//show2(); // you cant call instance method/variable from static method.
		System.out.println(name);
	}public void show2() {
		show1();
		System.out.println(name);
		System.out.println(age);
	}
	public void show3() {
		show2();
		show1();
	}
	public static void show4() {
	
}


}
