package com.upgrade.uiautomation.UpgradeUIAutomation.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.upgrade.uiautomation.UpgradeUIAutomation.model.Borrower;
import com.upgrade.uiautomation.UpgradeUIAutomation.model.LoanGetStarted;
import com.upgrade.uiautomation.UpgradeUIAutomation.model.LoanOffers;
import com.upgrade.uiautomation.UpgradeUIAutomation.model.LoginOrRegister;
import com.upgrade.uiautomation.UpgradeUIAutomation.model.Menu;

public class BasicSetup {
	public WebDriver driver;
	public String username = "";
	public String password = "";
	
	private String browser = "";
	
	public LoanOffers offer;
	public LoanGetStarted getStarted;
	public Borrower borrower;
	public LoginOrRegister loginRegister;
	public Menu menu;
	public Wait wait;
	Utility utility = new Utility();
	public Report report;


	public BasicSetup() {
		
		String url = utility.getProperty(Constants.RUN_CONFIGURATION, "url");
		setup(url);
		
		wait = new Wait(driver);
		wait.implicitlyFor(10);
		
		offer = new LoanOffers(driver);
		getStarted = new LoanGetStarted(driver);
		borrower = new Borrower(driver);
		loginRegister = new LoginOrRegister(driver);
		menu = new Menu(driver);
		
		report = new Report(utility.getProperty(Constants.RUN_CONFIGURATION, "OS"), browser);
		report.startReport();
	}

	public void setup(String url) {

		driverSetup();
		driver.get(url);

		username = utility.getProperty(Constants.CREDENTIALS, "username");
		password = utility.getProperty(Constants.CREDENTIALS, "password");
		
		
		
	}

	private void driverSetup() {
		browser = utility.getProperty(Constants.RUN_CONFIGURATION, "browser");
		
		if(browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver");
			driver = new ChromeDriver();
		} else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.firefox.driver", "src/resources/drivers/firefox");
		} else if(browser.equalsIgnoreCase("Safari")) {
			System.setProperty("webdriver.safari.driver", "src/resources/drivers/safaridriver");
		} else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", "src/resources/drivers/internetexplorerdriver");
		}

		driver.manage().window().maximize();
		
	}
	

	
}
