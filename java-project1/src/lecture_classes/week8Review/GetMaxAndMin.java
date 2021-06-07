package lecture_classes.week8Review;

import java.util.Arrays;

public class GetMaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 15,79,-19,55};
		
		System.out.println(Arrays.toString(getMaxAndMin(arr)));
		
		System.out.println(Arrays.toString(getMaxAndMin2(arr)));

	}
	
	public static int[] getMaxAndMin(int[] arr) {
		int min =0;
		int max =0;
		int [] result = {arr[0],arr[0]};
		
		for(int num : arr) {
			if (num< result[0]) {
				result[0] = num;
			}
			if (num>result[1]) {
				result[1] = num;
			}
		}
		return result;
	}
	
	public static int[] getMaxAndMin2(int[] arr) {
		
		Arrays.sort(arr);
		
		return new int[]{arr[0],arr[arr.length-1]};
	}

}
