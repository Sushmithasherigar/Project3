package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Subscription {

	WebDriver driver;
	
	public Subscription(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='susbscribe_email']")WebElement subemail;
	@FindBy(xpath = "//button[@id='subscribe']")WebElement submit;
	
	public void subscriptionconfirm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		WebElement subscriptionText = driver.findElement(By.xpath("//h2[text()='Subscription']"));
		Assert.assertEquals(subscriptionText.getText(), "SUBSCRIPTION", "Subscription is Not Visible");
		System.out.println("Subscription is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void subemail()
	{
		subemail.sendKeys("KajolHebbar@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void submit()
	{
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void successconfirm()
	{
		WebElement subscriptionText = driver.findElement(By.xpath("//div[@class='alert-success alert']"));
		Assert.assertEquals(subscriptionText.getText(), "You have been successfully subscribed!", "Subscription Not Successfull");
		System.out.println("Subscription Successfull");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
