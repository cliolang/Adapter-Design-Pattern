//Adapts Warrior class in an adapter pattern
public class WizardAdapter implements Warrior {
	//Wizard field stored locally
    Wizard wizard;
    
    //Parameterized constructor w wizard w
    public WizardAdapter(Wizard w) {
        this.wizard = w;
    }
    
    /*
     * Calls perform spell instead of attack
     */
    public void attack() { 
        wizard.performSpell();
    }

    /*
     * Calls heal method instead of defend
     */
    public void defend() {
        wizard.heal();
    }
}
