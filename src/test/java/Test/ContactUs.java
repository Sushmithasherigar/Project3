package Test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ContactUs {

	WebDriver driver;
	
	public ContactUs(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Contact us")WebElement contactus;
	@FindBy(name = "name")WebElement name;
	@FindBy(name = "email")WebElement email;
	@FindBy(name = "subject")WebElement subject;
	@FindBy(name = "message")WebElement message;
	@FindBy(name = "submit")WebElement submit;
	@FindBy(xpath ="//i[@class='fa fa-angle-double-left']")WebElement home;
	
	public void contactus()
	{
		contactus.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmgetintext()
	{
		WebElement confirmGetInTouch = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
		Assert.assertEquals(confirmGetInTouch.getText(), "GET IN TOUCH", "Get in Touch page is not displayed");
		System.out.println("GET IN TOUCH Page Is Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
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
	public void subject()
	{
		subject.sendKeys("Test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void message()
	{
		message.sendKeys("My Message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void uploadfile()
	{
		WebElement fileInput = driver.findElement(By.xpath("//input[@name='upload_file']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
		fileInput.sendKeys("C:\\SUSHMITHA\\Selenium\\Project 3\\contactus.jpg");
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
	}
	public void submit()
	{		
	     submit.click();
	     Alert alert = driver.switchTo().alert();
	     alert.accept();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void submitsuccess()
	{
		WebElement submitSuccessText = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
		Assert.assertEquals(submitSuccessText.getText(), "Success! Your details have been submitted successfully.", "Submit Not Success");
		System.out.println("Submit Success");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void home()
	{
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
