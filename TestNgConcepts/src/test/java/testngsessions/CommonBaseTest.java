package testngsessions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CommonBaseTest {
	
	//WebDriver driver;
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	@Parameters({"url","browser"})
	public void setUp(String url, String browser) {
		String browserName = browser.toLowerCase();
		if(browserName == "chrome")
		{
			driver = new ChromeDriver();
		}
		else if(browserName =="firefox")
		{
			driver = new FirefoxDriver();
		}
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
