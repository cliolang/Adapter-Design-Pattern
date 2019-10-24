//Class that implements the interface Wizard
public class Sorceror implements Wizard{

	/*
	 * Method that prints out that the sorceror is performing a spell
	 */
	@Override
	public void performSpell() {
		System.out.println("Casting Spell: I put a spell on you, and now you're gone");
	}

	/*
	 * Method that prints out that the sorceror is healing
	 */
	@Override
	public void heal() {
		System.out.println("Healing: You should all feel healthy again");
	}
	
}
