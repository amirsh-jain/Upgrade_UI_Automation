

## Upgrade UI Automation
UI automation to test the loan offer functionality of Upgrade website and portal.

The tests executes as a borrower - record loan offers, upon filling the required form fields with valid inputs on https://credapi.credify.tech/api/brportorch/v2/login, once done later navigate to https://www.credify.tech/portal/login for the same user.
On /offer-page re-validate and compare Loan Amount, APR, Loan Term and Monthly Payment matches with the info stored previously.

## Follow Along
git clone https://github.com/amirsh-jain/Upgrade_UI_Automation.git

## How to execute test
Process #1 
* Go to `/UpgradeUIAutomation/src/test/java/com/upgrade/uiautomation/UpgradeUIAutomation/LoanOfferTest.java`, that holds testcases
* Right click on file name in Package Explorer and `run as` TestNG Test

Process #2
 * Right click on  `testNG.xml`, that holds test class(es) name to be executed

Process #3
 * execute mvn command from command line
 `mvn clean test -DsuiteXMLFile=testNG.xml`


## Framework
This is a Maven project and framework consist of following JARs:
  * Selenium
  * TestNG
  * extentreport

### Structure
This project is your standard Maven Java project with `src` folders, `testNG.xml` and `POM.xml`.

### Models
`src/main/java/model` represents UI screen properties equivalent to respective page objects. 
Each model consist of UI elements with respect to their unique locators, with an impertaive assertion of element to be enabled or displayed in order to make sure of accessibility during test run. 
Models contains representation of entities like Borrowers, Loan Offer etc.

### Properties
`src/main/resources/configs/runConfig.properties` is a simple properties file to store various common configurations that are required by any/all tests to be executed.
`src/main/resources/drivers` consist of drivers for each browser. Currently it contains only `Chrome` driver, but `firefox`, `IE`, `Safari`, or `Netgear` drivers can be included here. 
`src/main/testdata/credentials.properties` consist of credentials (username and password) for user under test. 

### Tests
`src/main/java/BasicSetup.java` is the tests superclass for configuration and common code
`src/test/java/com/upgrade/uiautomation/UpgradeUIAutomation/LoanOfferTest.java` holds test classes (TestNG)

### Reports
extentreports get generated as soon as the test are run. Test results are saved insidee `test-output` directory under root. 
HTML file is generated for each run with prefix `testReport-` followed by date and time of the run. 


 
