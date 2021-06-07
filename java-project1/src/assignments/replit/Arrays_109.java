package assignments.replit;

import java.util.Scanner;

import lecture_classes.day27_arrays_part4.Length;

public class Arrays_109 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String[] arr = new String[5];
		for (int i=0;i<5;i++)
		{
			arr[i] = input.nextLine();
		}
		//leave above alone! :)   
		//assume you have String array of 5 items 
		//write your code below
		for(int i = 0 ; i <5 ; i++){
		System.out.println(arr[i].substring(0,3));  
		}
		
		
	}

}
