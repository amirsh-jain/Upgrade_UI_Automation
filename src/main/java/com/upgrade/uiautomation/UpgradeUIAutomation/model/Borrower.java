package com.upgrade.uiautomation.UpgradeUIAutomation.model;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Borrower {
	private WebDriver driver;

	private By annualIncome = By.name("borrowerIncome");
	private By additionalIncome = By.name("borrowerAdditionalIncome");

	private By firstName = By.name("borrowerFirstName");
	private By lastName = By.name("borrowerLastName");
	private By street = By.name("borrowerStreet");
	private By city = By.name("borrowerCity");
	private By state = By.name("borrowerState");
	private By zip = By.name("borrowerZipCode");
	private By dob = By.name("borrowerDateOfBirth");
	private By continueButton = By.cssSelector("[data-auto='continuePersonalInfo']");
	
	
	
	public Borrower(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement firstName() {
		WebElement element = driver.findElement(firstName);
		assertTrue(element.isEnabled());
		return element;
		
	}

	public WebElement lastName() {
		WebElement element = driver.findElement(lastName);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement street() {
		WebElement element = driver.findElement(street);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement city() {
		WebElement element = driver.findElement(city);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement state() {
		WebElement element = driver.findElement(state);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement zip() {
		WebElement element = driver.findElement(zip);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement dob() {
		WebElement element = driver.findElement(dob);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement continueButton() {
		WebElement element = driver.findElement(continueButton);
		assertTrue(element.isEnabled());
		return element;
	}

	public WebElement annualIncome() {
		WebElement element = driver.findElement(annualIncome);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement additionalIncome() {
		WebElement element = driver.findElement(additionalIncome);
		assertTrue(element.isEnabled());
		return element;
	}
}
