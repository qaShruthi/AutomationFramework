package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private static WebDriver driver;
	
	public ElementUtil(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
//	private SearchContext getShadowRoot()
//	{
//		final WebElement shadowHost = driver.findElement(By.id("shadow_host"));
//		return shadowHost.getShadowRoot();
//	}

}
