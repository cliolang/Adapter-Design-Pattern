public class Wizard_Adapter {
	Wizard wizard;
	public WizardAdapter(Wizard w) {
		this.wizard = w;
	}
	public void attack() {
		wizard.performSpell();
	}
	public void defend() {
		wizard.heal();
	}
}
