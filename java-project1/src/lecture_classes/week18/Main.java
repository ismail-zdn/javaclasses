package lecture_classes.week18;

interface Season{
	void start();
}

class Summer implements Season{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("summer is coming..");
	}
	
	
}

class Winter implements Season{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("winter is coming..");
	}
	
}

public class Main {
	
	public static void main(String[] args) {
		
		Season season = new Summer();
		season.start();
		season = new Winter();
		season.start();
		
	}
	

}
