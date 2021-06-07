package lecture_classes.day14_methods;

public class task69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrime(0));
		System.out.println(isPrime(1));
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(5));
		System.out.println(isPrime(11));
		System.out.println(isPrime(53));
		System.out.println(isPrime(297));

	}

	public static boolean isPrime(int number) {
		boolean result= true;
		if (number == 0 || number == 1) {
			result = false;
		}else {
			for (int i = 2; i < number; i++) {
				
				if (number%i == 0) {
					result = false;
					break;
				}
				
			}
		}
	
		return result;
	}
}
