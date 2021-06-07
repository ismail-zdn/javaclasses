package lecture_classes.day32_arrayList_Part2;

import java.util.ArrayList;
import java.util.Random;

public class CustomMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList);
		
		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(5.50);
		doubleList.add(9.4);
		doubleList.add(7.8);
		doubleList.add(3.99);
		
		double sum = sumList(doubleList);
		
		System.out.println();
		
		System.out.println(sum);
		
		ArrayList<Integer> list = getList(10);
		System.out.println(list.toString());
		
		ArrayList<Integer> rList = getRandomList(5);
		System.out.println(rList.toString());
		
		ArrayList<String> strnums = new ArrayList<>();
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		ArrayList<Integer> converted = convertedToIntList(strnums);
		System.out.println(converted);

		
	}

	private static ArrayList<Integer> convertedToIntList(ArrayList<String> strnums) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (String str : strnums) {
			numList.add(Integer.parseInt(str));
		}
		return numList;
	}

	private static ArrayList<Integer> getRandomList(int i) {
		// TODO Auto-generated method stub
		Random rn = new Random();
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (int j = 0; j < i; j++) {
			newList.add(rn.nextInt(101));
		}
		
		return newList;
	}

	private static ArrayList<Integer> getList(int i) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<>(i);
		for (int j = 1; j <= i; j++) {
			list1.add(j);
		}
		return list1;
	}

	private static double sumList(ArrayList<Double> doubleList) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (Double double1 : doubleList) {	
			sum = sum+double1;
		}
		return sum;
	}

	private static void printList(ArrayList<Integer> numList) {
		// TODO Auto-generated method stub
		
		for (Integer integer : numList) {
			System.out.print(integer + "-");
		}
		
	}

}
