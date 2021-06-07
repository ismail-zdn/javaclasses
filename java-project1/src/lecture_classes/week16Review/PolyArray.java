package lecture_classes.week16Review;

public class PolyArray {
	
	public static void main(String[] args) {
		
		IPhone phone1 = new IPhone("11", 8.0, 2000);
		Samsung phone2 = new Samsung("Note", 1000, 8.0);
		CyberPhone phone3 = new CyberPhone();
		
		//If they are shares same reference which is Phone, this can be possible.
		Phone[] phones = new Phone[3];
		
		phones[0] = phone1;
		phones[1] = phone2;
		phones[2] = phone3;
		
		for (Phone phone : phones) {
			System.out.println(phone.brand);
			System.out.println(phone.model);
			System.out.println(phone.price);
		}
	}

}
