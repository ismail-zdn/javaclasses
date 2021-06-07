package lecture_classes.day40_accessModifiers_Final_Hiding;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE= 600; // initialize same statement
	public final int MODEL_3_MAXSPEED ;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	public FinalVariables() {
		MODEL_3_MAXSPEED = 200; //initialize in constructor
		
	}
	
	{
		MODEL_X_PASSENGERS=7; //initialize in init block
		
		//if you don't create a object instance block will not run
		//instance block will be executed when an object created
	}
	
	static {
		ADMIN_USERNAME = "OZZY";
		//when class is loaded, static block is executed once
	}
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT = 5; // Local variables can not have
		// access modifiers. // public final int SNN ***
		final int SSN; 
		SSN = 6656486; // local final variable we can assign later.
		
		FinalVariables finalVars = new FinalVariables();
		
		System.out.println(finalVars.ROADSTER_MAX_RANGE);
		System.out.println(finalVars.MODEL_3_MAXSPEED);
		
		System.out.println(ADMIN_USERNAME); // finalVars.ADMI... is ok too.
		
		
	}
}
