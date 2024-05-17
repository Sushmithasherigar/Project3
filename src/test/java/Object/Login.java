package Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class=\"fa fa-lock\"]")WebElement login;
	@FindBy(linkText = "Home")WebElement home;
	
	public void home()
	{
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmhome()
	{
		WebElement confirmhomeText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(confirmhomeText.getText(), "FEATURES ITEMS", "We Are Not In Home Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("We Are In Home Page");
	}
	public void login()
	{
		login.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void loginaccountconfirm()
	{
		WebElement loginAccountText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
		Assert.assertEquals(loginAccountText.getText(), "Login to your account", "Login to Your Account is not displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Login To Your Account Is Displayed");	
	}
}
