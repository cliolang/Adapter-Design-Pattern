public class WizardAdapter implements Warrior {//adapter pattern
    Wizard wizard;//wizard field stored locally
    public WizardAdapter(Wizard w) {//parameterized constructor w wizard w
        this.wizard = w;
    }
    public void attack() { //calls perform spell instead of attack
        wizard.performSpell();
    }

    public void defend() {//calls heal instead of defend
        wizard.heal();
    }
}
