package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NewsletterPage extends BasePage {

	/*
	 * Retrieve Web element 
	 */
	
	@FindBy(how = How.CSS, using = "#newsletter-email")
	private static WebElement emailField;
	
	@FindBy(how = How.CSS, using = "#newsletter-subscribe-button")
	private static WebElement subscribeButton;
	
	@FindBy(how = How.CSS, using = "#newsletter-result-block")
	private static WebElement confirmationMessage;
	
	
	public NewsletterPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getEmailField() {
		return emailField;
	}

	public static WebElement getSubscribeButton() {
		return subscribeButton;
	}
	
	public static WebElement getConfirmationMessage() {
		return confirmationMessage;
	}

}
