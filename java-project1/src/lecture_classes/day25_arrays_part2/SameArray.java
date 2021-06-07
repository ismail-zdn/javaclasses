		package lecture_classes.day25_arrays_part2;
		
		public class SameArray {
		public static void main(String[] args) {
			
			String[] hebele = {"hebe","hebele"};
			
			showArray(hebele);
			
			}
		
		public static void showArray(String[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			
			for (String string : array) {
				System.out.print(string+" ");
			}
		}
		}
