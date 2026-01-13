package com.e2eTest.automation.step_definitions;


import com.e2eTest.automation.page_objects.NewsletterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsLetterSteps {
	
	NewsletterPage newsletterPage = new NewsletterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	
	
	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		//NewsletterPage.getEmailField().sendKeys(configFileReader.getProperty("home.email"));
		
		actionsUtils.writeText(NewsletterPage.getEmailField(), configFileReader.getProperty("home.email"));
	}
	
	@When("Je clique sur le bouton subscribe")
	public void jeCliqueSurLeBoutonSubscribe() {
		actionsUtils.click(NewsletterPage.getSubscribeButton());
	}
	@Then("il s affiche le message  {string}")
	public void ilSAfficheLeMessage(String string) {
//		String message = NewsletterPage.getConfirmationMessage().getText();
//		Assertions.assertEquals(message, string);
		
	    validations.assertEquals(NewsletterPage.getConfirmationMessage(), string);
	}



}
