package lecture_classes.week14Review;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
	
	public String BA,PO,SM;
	
	public ArrayList<Tester> testers;
	public ArrayList<Developer> developers;
	
	public ScrumTeam(String BA, String PO, String SM) {
		this.BA = BA;
		this.PO = PO;
		this.SM = SM;
		this.testers = new ArrayList<>();
        this.developers = new ArrayList<>();
	}
	
	public void hireTester(Tester tester) {
		this.testers.add(tester);
	}
	
	public void hireTester(Tester[] amigolar) {
		//this.testers.addAll(Arrays.asList(testers));
		for(Tester eachTester : amigolar) 
			hireTester(eachTester);
		  
		
	}

	public void hireDeveloper(Developer developer) {
		developers.add(developer);
	}
	
	public void hireDeveloper(Developer[] developers) {
		this.developers.addAll(Arrays.asList(developers));
	/*	
		for (Developer developer : developers) {
			this.developers.add(developer);
		}
	*/
	}

	public void terminateTester(String ID) {
		//testers.removeIf(p -> p.ID.equals(ID)); // p == eachTester
		
		Tester tester = null;
		for (Tester eachTester : testers) {
			if (eachTester.ID.equals(ID)) {
				tester = eachTester;
			}
		}
		
		testers.remove(tester);
		
	}
	
	public void terminateDeveloper(String ID) {
		//developers.removeIf(p -> p.ID.equals(ID));
		
		Developer developer = null;
		
		for (Developer eachDeveloper : developers) {
			if (eachDeveloper.ID.equals(ID)) {
				developer = eachDeveloper;
			}
		}
		
		developers.remove(developer);
	}

	
	@Override
	public String toString() {
		return "ScrumTeam [BA=" + BA + ", PO=" + PO + ", SM=" + SM + ", testers=" + testers.size() +
				", developers="+ developers.size() + "]";
	}

	public void dailyStandUp() {
		System.out.println(SM+" is doing daily stand up meeting.");
	}
}
