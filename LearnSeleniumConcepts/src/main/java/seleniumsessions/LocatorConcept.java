package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		driver.findElement(By.id("input-email")).sendKeys("sehfi@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("shdiaisdj");
		By emailId = By.id("input-email");
		By pswd = By.name("password");
//		getElement(emailId).sendKeys("sdhfsh@gmail.com");
//		getElement(pswd).sendKeys("dadds");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "ssdjs@gmail.com");
		eleUtil.doSendKeys(pswd, "sfedfe");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
        String errMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).getText();
	    System.out.println(errMsg);
	    if(errMsg == "Warning: No match for E-Mail Address and/or Password.")
	    {
	    	System.out.println("Pass");
	    }

	}

}
