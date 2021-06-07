package lecture_classes.day24_arrays_part1;
import java.util.Scanner;
public class Task86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a month number:");
		int month = input.nextInt()-1;
		
		String[] months = new String[12];
		months[0]="jan";
		months[1]="feb";
		months[2]="march";
		months[3]="apr";
		months[4]="may";
		months[5]="june";
		months[6]="july";
		months[7]="august";
		months[8]="sept";
		months[9]="october";
		months[10]="november";
		months[11]="december";
		
		System.out.println(months[month]);

	}

}
