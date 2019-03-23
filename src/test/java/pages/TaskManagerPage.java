package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskManagerPage {

	WebDriver driver;
	
	public TaskManagerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]")
	WebElement lnkClose;
	
	public WebElement lnkClose() {
		return lnkClose;
	}
	
	@FindBy(xpath="//span[@class='detail']")
	WebElement lblAchievement;
	
	public WebElement lblAchievement() {
		return lblAchievement;
	}
	
}
