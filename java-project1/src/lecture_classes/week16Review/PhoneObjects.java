package lecture_classes.week16Review;

public class PhoneObjects {

	public static void main(String[] args) {
		
		IPhone phone1 = new IPhone("11", 8.0, 2000);
		Phone phone2 = new IPhone("8", 6.5, 1000);
		Object phone3 = new IPhone("5", 6.5, 500);
		AppleApp phone4 = new IPhone("7", 7.0, 1500);
		
		
		phone1.faceTiming(123131321); // faceTiming() is coming from IPhone class.
		
		((IPhone) phone2).faceTiming(222222222); //casting 
		
		((IPhone) phone3).faceTiming(333333333); //casting
		
		((IPhone)phone4).faceTiming(444444444); //casting
		
		
		phone1.download();
		
		((IPhone)phone2).download();
		
		((AppleApp)phone3).download(); // ????
		
		phone4.download();
		
		//1. Option - casting
		((IPhone)phone3).calling(3333333);
		
		//2. Option
		((Phone)phone3).calling(3333333);
		
		
		((Phone)phone4).calling(4444444); //casting
		
		// the method is calling always from object - right side****
		
		
		
	}

}
