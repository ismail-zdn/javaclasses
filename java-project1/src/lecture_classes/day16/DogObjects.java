package lecture_classes.day16;

public class DogObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		dog dog1 = new dog();
		dog dog2 = new dog();
	//	dog dog3 = new dog();

		dog1.breed="Kont";
		dog2.color="black";
		dog1.name="kurt";
		System.out.println(dog1.breed+dog2.color+dog1.name);
		dog1.barking();
	}

}
