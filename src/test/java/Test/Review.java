package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Review {

	WebDriver driver;
	
	public Review(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "name")WebElement name;
	@FindBy(id = "email")WebElement email;
	@FindBy(name = "review")WebElement review;
	@FindBy(id = "button-review")WebElement submit;
	
	public void name()
	{
		name.sendKeys("Kajol");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void email()
	{
		email.sendKeys("KajolHebbar@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void review()
	{
		review.sendKeys("Good Product! Fits Perfectly");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void submit()
	{
		submit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void submitconfirm()
	{
		WebElement submitText = driver.findElement(By.xpath("//span[text()='Thank you for your review.']"));
		Assert.assertEquals(submitText.getText(), "Thank you for your review.", "Not Submitted Successfully");
		System.out.println("Review Submitted Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
