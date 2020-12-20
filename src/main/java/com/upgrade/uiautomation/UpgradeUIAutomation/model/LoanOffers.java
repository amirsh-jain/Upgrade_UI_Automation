package com.upgrade.uiautomation.UpgradeUIAutomation.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoanOffers {

	private WebDriver driver;

	private By monthlyPayment = By.cssSelector("[data-auto='defaultMonthlyPayment']");
	private By loanAmount = By.cssSelector("[data-auto='userLoanAmount']");
	private By loanTerm = By.cssSelector("[data-auto='defaultLoanTerm']");
	private By loanInterestRate = By.cssSelector("[data-auto='defaultLoanInterestRate']");
	private By apr = By.xpath(
			"//*[@id=\"root\"]/div/main/div/div[2]/div[1]/div/div[1]/div[1]/div[2]/div/div/div/div[2]/div/div/div[3]/div/div[1]");
	private By getDefaultLoan = By.cssSelector("[data-auto='getDefaultLoan']");

	private String monthlyPaymentValue = "";
	private String loanTermValue = "";
	private String loanInterestRateValue = "";
	private String aprValue = "";
	private String loanAmountValue = "";

	public LoanOffers(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement defaultLoan() {
		WebElement element = driver.findElement(getDefaultLoan);
		return element;
	}

	public WebElement loanAmount() {
		WebElement element = driver.findElement(loanAmount);
		return element;
	}

	public WebElement loanTerm() {
		WebElement element = driver.findElement(loanTerm);
		return element;
	}

	public WebElement loanInterestRate() {
		WebElement element = driver.findElement(loanInterestRate);
		return element;
	}

	public WebElement monthlyPayment() {
		WebElement element = driver.findElement(monthlyPayment);
		return element;
	}

	public WebElement apr() {
		WebElement element = driver.findElement(apr);
		return element;
	}

	public String getMonthlyPaymentValue() {
		return monthlyPaymentValue;
	}

	public void setMonthlyPaymentValue(String monthlyPaymentValue) {
		this.monthlyPaymentValue = monthlyPaymentValue;
	}

	public String getLoanTermValue() {
		return loanTermValue;
	}

	public void setLoanTermValue(String loanTermValue) {
		this.loanTermValue = loanTermValue;
	}

	public String getLoanInterestRateValue() {
		return loanInterestRateValue;
	}

	public void setLoanInterestRateValue(String loanInterestRateValue) {
		this.loanInterestRateValue = loanInterestRateValue;
	}

	public String getAprValue() {
		return aprValue;
	}

	public void setAprValue(String aprValue) {
		this.aprValue = aprValue;
	}

	public String getLoanAmountValue() {
		return loanAmountValue;
	}

	public void setLoanAmountValue(String loanAmountValue) {
		this.loanAmountValue = loanAmountValue;
	}

}
