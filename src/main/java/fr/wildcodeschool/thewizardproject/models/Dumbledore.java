package fr.wildcodeschool.thewizardproject.models;

public class Dumbledore implements WizardInterface {
	
	Outfit dress;
	public Dumbledore(Outfit dress) {
		this.dress = dress;
	}

	@Override
	public String giveAdvice() {
		return "Yolo";
	}

	@Override
	public String changeDress() {
		return dress.changeDress();
	}
	
	

}
