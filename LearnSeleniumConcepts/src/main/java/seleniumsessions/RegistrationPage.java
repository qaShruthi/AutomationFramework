package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class RegistrationPage {

	public static void main(String[] args) throws InterruptedException {
		
		String browserName= "chrome";
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		brUtil.getPageURL();
     
        //by locators: OR
        Thread.sleep(10);
        By firstname  = By.id("input-firstname");
        By lastname  = By.id("input-lastname");
        By email  = By.id("input-email");
        By telephone  = By.id("input-telephone");
        By password  = By.id("input-password");
        By confirmPassword  = By.id("input-confirm");
        
        ElementUtil eleUtil = new ElementUtil(driver);
        eleUtil.doSendKeys(firstname, "Amrita");
        eleUtil.doSendKeys(lastname, "Singh");
        eleUtil.doSendKeys(email, "Amrita@gmail.com");
        eleUtil.doSendKeys(telephone, "9785463789");
        eleUtil.doSendKeys(password, "Amrita");
        eleUtil.doSendKeys(confirmPassword, "Amrita");
        
        		
	}

}
