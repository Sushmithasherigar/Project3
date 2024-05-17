package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DeleteAccount {

	WebDriver driver;
	
	public DeleteAccount(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Delete Account")WebElement deleteacc;
	@FindBy(xpath = "//a[@class='btn btn-primary']")WebElement continueclick;
	
	public void deleteacc()
	{
		deleteacc.click();
		System.out.println("Executed till here");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmdeletemessage()
	{
		WebElement deleteMessageText = driver.findElement(By.xpath("//b[text()='Account Deleted!']"));
		Assert.assertEquals(deleteMessageText.getText(), "ACCOUNT DELETED!", "Account Is Not Deleted");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Account is Deleted");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void continueclick()
	{
		continueclick.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
