package testngsessions;

import org.testng.annotations.Test;

public class AmazonTest extends CommonBaseTest{

	



//	@Test
//	public void searchExistTest() {
//		Boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
//		Assert.assertTrue(flag);
//	}

	@Test
	public void amazonTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");

	}


}
