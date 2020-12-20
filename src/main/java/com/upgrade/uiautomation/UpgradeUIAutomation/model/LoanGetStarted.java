package com.upgrade.uiautomation.UpgradeUIAutomation.model;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoanGetStarted {

	private WebDriver driver;

	private By loanAmount = By.name("desiredAmount");;
	private By loanPurpose = By.cssSelector("[data-auto='dropLoanPurpose']");
	private By checkYourRate = By.cssSelector("[data-auto='CheckYourRate']");

	public LoanGetStarted(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement amount() {
		WebElement element = driver.findElement(loanAmount);
		assertTrue(element.isEnabled());
		return element;
	}

	public WebElement purpose() {
		WebElement element = driver.findElement(loanPurpose);
		assertTrue(element.isEnabled());
		return element;
	}
	public WebElement checkRate() {
		WebElement element = driver.findElement(checkYourRate);
		assertTrue(element.isEnabled());
		return element;
	}

}
