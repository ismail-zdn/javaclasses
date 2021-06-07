package assignments.assignment_3;

public class deneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int indrink = 600;
		double dailylimit = 10_000;
		double k =  dailylimit/indrink;
		
		System.out.println("Number of mg in driks " + indrink );
		System.out.println("It would take about " + Math.ceil(k) + " drinks for a lethal overdose");

	}

}
