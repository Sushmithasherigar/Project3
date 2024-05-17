package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegisteredAccount {

	WebDriver driver;
	
	public RegisteredAccount(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void alreadyExistText()
	{
		WebElement existText = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
		Assert.assertEquals(existText.getText(), "Email Address already exist!", "Not Registered");
		System.out.println("Already Exist!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
