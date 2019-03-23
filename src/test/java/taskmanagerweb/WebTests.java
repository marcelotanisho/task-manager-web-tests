package taskmanagerweb;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.TaskManagerPage;

public class WebTests {
	
	WebDriver driver;
	TaskManagerPage page;
	
	@Before
	public void setupSel() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:3000/");
		page = new TaskManagerPage(driver);
	}
	
	@Test
	public void firstAchievement() {
		page.lnkClose().click();
		Assert.assertEquals("Congratulations! You worked a lot!", page.lblAchievement().getText());
	}
	
	@Test
	public void secondAchievement() {
		page.lnkClose().click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		page.lnkClose().click();
		page.lnkClose().click();
		
		Assert.assertTrue(page.lblAchievement().isDisplayed());
	}
	
	@After
	public void killBrowser() {
		driver.quit();
	}
	
}
