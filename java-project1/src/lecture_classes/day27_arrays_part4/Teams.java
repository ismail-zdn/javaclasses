package lecture_classes.day27_arrays_part4;

public class Teams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String[][] teams = new String[2][4];
//		
//		teams [0][0] = "mike";
//		teams [0][1] = "tonny";
//		teams [0][2] = "smith";
//		teams [0][3] = "evan";
//		
//		teams [1][0] = "david";
//		teams [1][1] = "emmy";
//		teams [1][2] = "john";
//		teams [1][3] = "ryan";
//		
		
		String[][] teams = {{"mike","tonny","smith","evan"},
				{"david","emmy","john","ryan"}};
		
		System.out.println("first player of first team: "
				+ teams[0][0]);
		
		System.out.println("Team numbers of first team: "
				+ teams[0].length);
		
		System.out.println("Team number of second team: "
				+ teams[1].length);
		

	}

}
