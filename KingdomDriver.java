
public class KingdomDriver {

	public static void main(String[] args) {
		Warrior warrior1 = new Knight();
		Wizard sorceror = new Sorceror();
		Warrior warrior2 = new WizardAdapter(sorceror);
		
		System.out.println("***** OFFENSE *****");
		warrior1.attack();
		warrior2.attack();
		
		System.out.println("\n***** Defense *****");
		warrior1.defend();
		warrior2.defend();
	}

}