package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {
	
	@Autowired
	private Outfit dress;

	@Override
	public String giveAdvice() {
		return "Yolo";
	}

	@Override
	public String changeDress() {
		return dress.changeDress();
	}
	
	

}
