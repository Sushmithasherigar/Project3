package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoggedInAs {

	WebDriver driver;
	
	public LoggedInAs(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void confirmationmessage()
	{
		WebElement loggedInAsText = driver.findElement(By.xpath("//b[text()='Kajol']"));
		Assert.assertEquals(loggedInAsText.getText(), "Kajol", "Logged In as is not Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Logged In As Kajol");
	}
}
