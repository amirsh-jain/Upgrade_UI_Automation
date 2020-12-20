package com.upgrade.uiautomation.UpgradeUIAutomation.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.upgrade.uiautomation.UpgradeUIAutomation.common.BasicSetup;

public class LoanOfferTest extends BasicSetup {
	
	@Test
	public void testGetLoanOffer() {

	
		getStarted.amount().sendKeys("2000");
		WebElement element = getStarted.purpose();
		Select purposeOfLoan = new Select(element);
		purposeOfLoan.selectByVisibleText("Business");
		getStarted.checkRate().click();

		
		wait.explicitlyFor(borrower.firstName(), 10);
		borrower.firstName().sendKeys("Amrish");
		borrower.lastName().sendKeys("Jain");
		borrower.street().sendKeys("500 Lane Road, Woodland, WA, USA");
		borrower.city().sendKeys("Woodland");
		borrower.state().sendKeys("WA");
		borrower.zip().sendKeys("97229");
		borrower.dob().sendKeys("11/12/2000");
		borrower.continueButton().click();

		
		wait.explicitlyFor(borrower.annualIncome(), 10);
		borrower.annualIncome().sendKeys("120000");
		borrower.additionalIncome().sendKeys("5000");
		borrower.continueButton().click();
		borrower.continueButton().click();
		
		
		loginRegister.username().sendKeys(username);
		loginRegister.password().sendKeys(password);
		loginRegister.agreement().click();
		loginRegister.submitPersonalInfo().click();


		wait.explicitlyFor(offer.defaultLoan(), 10);
		
		offer.setLoanAmountValue(offer.loanAmount().getText());
		offer.setLoanInterestRateValue(offer.loanInterestRate().getText());
		offer.setLoanTermValue(offer.loanTerm().getText());
		offer.setMonthlyPaymentValue(offer.monthlyPayment().getText());
		offer.setAprValue(offer.apr().getText().split(" ")[0]);

		
		
		wait.explicitlyFor(menu.hamburger(), 10);
		menu.hamburger().click();
		menu.signOut().click();
		
		report.testcase = report.extent.createTest("testGetLoanOffer", "PASSED");


	}

	@Test(dependsOnMethods = { "testGetLoanOffer" })
	public void testCompareLoanOffer() {
		driver.get("https://www.credify.tech/portal/login");

		loginRegister.username().sendKeys(username);
		loginRegister.password().sendKeys(password);
		loginRegister.login().click();

		wait.explicitlyFor(offer.defaultLoan(), 10);
		
		String portalLoanAmount = offer.loanAmount().getText();
		String portalMonthlyPayment = offer.monthlyPayment().getText();
		String portalLoanTerm = offer.loanTerm().getText();
		String portalLoanInterestRate = offer.loanInterestRate().getText();
		String portalApr = offer.apr().getText().split(" ")[0];
		
		portalApr = portalApr.split(" ")[0];

		Assert.assertTrue(offer.getLoanAmountValue().equals(portalLoanAmount),
				"Loan Amount does not match with loan amount on https://www.credify.tech/portal/login");
		Assert.assertTrue(offer.getMonthlyPaymentValue().equals(portalMonthlyPayment),
				"Monthly Payment does not match with loan amount on https://www.credify.tech/portal/login");
		Assert.assertTrue(offer.getLoanTermValue().equals(portalLoanTerm),
				"Loan Term does not match with loan amount on https://www.credify.tech/portal/login");
		Assert.assertTrue(offer.getLoanInterestRateValue().equals(portalLoanInterestRate),
				"Loan Interest Rate does not match with loan amount on https://www.credify.tech/portal/login");
		Assert.assertTrue(offer.getAprValue().equals(portalApr),
				"APR does not match with loan amount on https://www.credify.tech/portal/login");
		
		report.testcase = report.extent.createTest("testCompareLoanOffer", "PASSED");

	}

	@AfterClass
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
		report.extent.flush();

	}
	
	@AfterMethod
    public void getResult(ITestResult result) {
		report.getResult(result);
    }

}
