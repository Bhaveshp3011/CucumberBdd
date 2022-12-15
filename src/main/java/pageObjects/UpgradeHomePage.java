package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;
import selenium.Wait;

public class UpgradeHomePage {
	
		WebDriver driver;
		
		public UpgradeHomePage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how = How.XPATH, using = "//a[@aria-label='Homepage']") 
		private WebElement logo_Homepage;
		
		@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign In')]") 
		private WebElement link_SignInLogin;
		
		@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Welcome Back!')]") 
		private WebElement header_welcomeLoginPage;
		
		@FindBy(how = How.XPATH, using = "//input[@name='username']") 
		private WebElement inputBox_EmailAdd;
		
		
		@FindBy(how = How.XPATH, using = "//input[@name='password']") 
		private WebElement inputBox_Password;
		
		//input[@name='password']
		
		public void clickOn_SignIn() {
			link_SignInLogin.click();
			Wait.untilJqueryIsDone(driver);
		}
		
		public void verifyHomepageLogo() {
			header_welcomeLoginPage.isDisplayed();
			Wait.untilJqueryIsDone(driver);
		}
		
		public void verifyEmailbox() {
			inputBox_EmailAdd.isDisplayed();
			Wait.untilJqueryIsDone(driver);
		}
		
		public void verifyInputBoxpass() {
			inputBox_Password.isDisplayed();
			Wait.untilJqueryIsDone(driver);
		}
		
		public void navigateTo_UpgradeHomePage() {
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		}


	}

