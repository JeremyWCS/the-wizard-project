package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledoreId")
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
