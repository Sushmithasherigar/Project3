package Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	
	public Logout(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Logout")WebElement logout;
	
	public void logout()
	{
		logout.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
