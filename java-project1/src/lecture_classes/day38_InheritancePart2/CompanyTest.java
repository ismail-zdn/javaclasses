package lecture_classes.day38_InheritancePart2;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contructor ct = new Contructor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40);

	}

}
