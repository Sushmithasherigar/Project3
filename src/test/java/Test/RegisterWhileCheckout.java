package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterWhileCheckout {

	WebDriver driver;
	
	public RegisterWhileCheckout(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div[1]/div[5]/div/div[1]/div[1]/a/i")WebElement addtocart;
	@FindBy(xpath = "//button[text()='Continue Shopping']")WebElement continueshop;
	
	public void addtocart()
	{
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void continueshop()
	{
		continueshop.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
