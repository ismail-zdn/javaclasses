package lecture_classes.day10_printing_comments;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result;
		int score = 65;
		
//		if (score>60) {
//			result = "pass";
//		} else {
//			result = "fail";
//
//		}
		
		result = score>60 ? "pass" : "fail" ;
		
		System.out.println(result);
		
		
		
		/////////////////////////////////////
		
		int x = 5;
		
//		if (x>2) {
//			if (x<4) {
//				System.out.println(10);
//			}else {
//				System.out.println(8);
//			}
//		}else {
//			System.out.println(7);
//		}
		
		
		System.out.println(x>2 ? x<4 ? 10 : 8 : 7);

	}

}
