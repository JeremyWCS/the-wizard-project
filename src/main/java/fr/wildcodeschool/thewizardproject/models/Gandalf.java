package fr.wildcodeschool.thewizardproject.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {
	
	
	@Autowired
	private Outfit dress;

	@Override
	public String giveAdvice() {
		return "This dress is cloak";
	}

	@Override
	public String changeDress() {
		return dress.changeDress();
	}

}
