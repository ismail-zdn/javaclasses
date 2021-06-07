package lecture_classes.day35_encapsulation;

public class Printer {
	
	private int tonerLevel;
	private int numberOfPages;
	
	public void fillUp() {
		this.tonerLevel=100;
	}
	
	public void increaseNumberOfPages(int printedPages) {
		this.numberOfPages = numberOfPages+printedPages;
	}
	
	

}
