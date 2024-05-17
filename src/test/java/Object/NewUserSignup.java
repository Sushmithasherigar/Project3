package Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserSignup {

	WebDriver driver;
	
	public NewUserSignup(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "name")WebElement name;
	@FindBy(xpath = "//input[@data-qa='signup-email']")WebElement email;
	@FindBy(xpath = "//button[text()='Signup']")WebElement signup;
	
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
	public void signup()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
