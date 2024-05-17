package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UpArrow {

	WebDriver driver;
	
	public UpArrow(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='scrollUp']")WebElement scrollup;
	
	public void scrolldown() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,8500)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void subs()
	{
		WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		Assert.assertEquals(subscriptionText.getText(), "SUBSCRIPTION", "Subscription is Not Visible");
		System.out.println("Subscription is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void scrollup()
	{
		scrollup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void confirmtext()
	{
		WebElement confirmText = driver.findElement(By.xpath("//h2[text()='Full-Fledged practice website for Automation Engineers']"));
		Assert.assertEquals(confirmText.getText(), "Full-Fledged practice website for Automation Engineers", "Full-Fledged practice website for Automation Engineers is Not Visible");
		System.out.println("Full-Fledged practice website for Automation Engineers is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void upscroll()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
	}
}
