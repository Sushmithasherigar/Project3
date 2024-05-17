package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class IncorrectPassword {

	WebDriver driver;
	
	public IncorrectPassword(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@data-qa='login-password']")WebElement incorrectpassword;
	
	public void incorrectpassword()
	{
		incorrectpassword.sendKeys("Kajol1234");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void alertconfirm()
	{
		WebElement alerttext = driver.findElement(By.xpath("//p[text()='Your email or password is incorrect!']"));
		Assert.assertEquals(alerttext.getText(), "Your email or password is incorrect!", "Password is Valid");
		System.out.println("Password is Invalid");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
