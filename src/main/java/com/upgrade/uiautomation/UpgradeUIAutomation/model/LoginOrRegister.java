package com.upgrade.uiautomation.UpgradeUIAutomation.model;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginOrRegister {
	private WebDriver driver;

	private By username = By.name("username");
	private By password = By.name("password");
	private By continueButton = By.cssSelector("[data-auto='continuePersonalInfo']");
	private By iAgree= By.xpath("//*[@id=\"root\"]/div/main/div/div[1]/div[2]/div[1]/div/div/form/div[2]/div/label/div[1]");
	private By submitPersonalInfo = By.cssSelector("[data-auto='submitPersonalInfo']");
	private By login = By.cssSelector("[data-auto='login']");
	
	
	public LoginOrRegister(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement username() {
		WebElement element = driver.findElement(username);
		assertTrue(element.isEnabled());
		return element;
	}
	
	public WebElement password() {
		WebElement element = driver.findElement(password);
		assertTrue(element.isEnabled());
		return element;
	}

	public WebElement continueButton() {
		WebElement element = driver.findElement(continueButton);
		assertTrue(element.isEnabled());
		return element;
	}
	public WebElement agreement() {
		WebElement element = driver.findElement(iAgree);
		assertTrue(element.isEnabled());
		return element;
	}
	public WebElement submitPersonalInfo() {
		WebElement element = driver.findElement(submitPersonalInfo);
		assertTrue(element.isEnabled());
		return element;
	}
	public WebElement login() {
		WebElement element = driver.findElement(login);
		assertTrue(element.isEnabled());
		return element;
	}
}
