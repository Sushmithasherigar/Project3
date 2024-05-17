package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtherLogin {

	WebDriver driver;
	
	public OtherLogin(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@data-qa='login-email']")WebElement email;
	@FindBy(xpath = "//input[@data-qa='login-password']")WebElement password;
	@FindBy(xpath = "//button[@data-qa='login-button']")WebElement login;
	
	public void email()
	{
		email.sendKeys("GaneshPai@gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void password()
	{
		password.sendKeys("GaneshPai1234");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void login()
	{
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
