package com.upgrade.uiautomation.UpgradeUIAutomation.model;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Menu {
	private WebDriver driver;

	private By hamburger = By.xpath("//*[@id=\"root\"]/div/main/div/header/div/label");
	private By signOut = By.xpath("//*[@id=\"root\"]/div/main/div/header/div/nav/ul/li[2]");
	
	public Menu(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement hamburger() {
		WebElement element = driver.findElement(hamburger);
		assertTrue(element.isEnabled());
		return element;
	}
	public WebElement signOut() {
		WebElement element = driver.findElement(signOut);
		assertTrue(element.isEnabled());
		return element;
	}
}
