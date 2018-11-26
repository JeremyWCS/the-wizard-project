package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {
	
	Outfit dress;
	public Gandalf(Outfit dress) {
		this.dress = dress;
	}

	@Override
	public String giveAdvice() {
		return "This dress is cloak";
	}

	@Override
	public String changeDress() {
		return dress.changeDress();
	}

}
