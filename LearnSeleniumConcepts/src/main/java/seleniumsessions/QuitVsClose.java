package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		//Session Id Difference b/w the two
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		//driver.quit(); // session id will be null
		driver.close();//session id will be there but browser will be closed so can not render the page
		//System.out.println(driver.getTitle());
		
	}

}
