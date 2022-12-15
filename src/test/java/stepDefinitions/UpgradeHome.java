package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import enums.Context;
import managers.FileReaderManager;
import pageObjects.UpgradeHomePage;

public class UpgradeHome {
	TestContext testContext;
	UpgradeHomePage upgradeHomePage;
	
	public UpgradeHome(TestContext context) {
		testContext = context;
		upgradeHomePage = testContext.getPageObjectManager().getupgradeHomePage();
	}

	
//    Given user launch the Upgrade Web application
//    When navigate to upgrade home page
//    And cliks on signIn link from top navigation menu
//    And lands on login page
//    Then user displayed with username and passowrd input box
    
	@Given("^user launch the Upgrade Web application$")
	public void user_launch_the_Upgrade_Web_application() {
	
		upgradeHomePage.navigateTo_UpgradeHomePage();
	}

}
