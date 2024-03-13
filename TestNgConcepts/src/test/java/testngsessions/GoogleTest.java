package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest extends CommonBaseTest {

	@Test
	public void searchExistTest() {
		Boolean flag = driver.findElement(By.name("q")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@Test
	public void googleTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");

	}

	
}
