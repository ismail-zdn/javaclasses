package lecture_classes.week3Review;

public class EqualsPracrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String season = "Summer" ; 
		if( season.equals("Spring") ) {
			System.out.println("picnic!!");
		} else if ( season.equals("Summer")  ) {
			System.out.println("Swimming!!");
		} else if ( season.equals("Fall")  ) {
			System.out.println("HIKING");
		} else if ( season.equals("Winter") ) {
			System.out.println("Skiing ");
		} else {
			System.out.println("INVALID SEASON!!!!");
		}

	}

}
