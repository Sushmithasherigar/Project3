package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EnterAccInformation {

	WebDriver driver;
	
	public EnterAccInformation(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "password")WebElement password;
	
	public void confirmationmessage()
	{
		WebElement enterAccountInfoText = driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
		Assert.assertEquals(enterAccountInfoText.getText(), "ENTER ACCOUNT INFORMATION", "Acc Info is not displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Enter Account Information Is Displayed");
	}
	public void title()
	{
		WebElement radioButton = driver.findElement(By.xpath("//input[@type='radio' and @value='Mrs']"));
		radioButton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void password()
	{
		password.sendKeys("Kajol@1234");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public void dateOfBirth()
	{
		WebElement dayDropDown = driver.findElement(By.name("days"));
		Select dayselect = new Select(dayDropDown);
		dayselect.selectByVisibleText("15");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement monthDropDown = driver.findElement(By.name("months"));
		Select monthselect = new Select(monthDropDown);
		monthselect.selectByVisibleText("May");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement yearDropDown = driver.findElement(By.name("years"));
		Select yearselect = new Select(yearDropDown);
		yearselect.selectByVisibleText("1994");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		yearDropDown.sendKeys(Keys.TAB);
		
	}
	public void newsletter()
	{
		WebElement newslettercheckbox = driver.findElement(By.id("newsletter"));
		newslettercheckbox.sendKeys(Keys.SPACE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		newslettercheckbox.sendKeys(Keys.TAB);
	}
	public void specialoffer()
	{
		WebElement specialoffercheckbox = driver.findElement(By.id("optin"));
		specialoffercheckbox.sendKeys(Keys.SPACE);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
