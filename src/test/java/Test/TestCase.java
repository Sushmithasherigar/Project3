package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class TestCase {

	WebDriver driver;
	
	public TestCase(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Test Cases")WebElement testcase;
	
	public void testcase()
	{
		testcase.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void testcaseconfirm()
	{
		WebElement testCaseConfirmText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(testCaseConfirmText.getText(), "TEST CASES", "TestCase Page not Displayed");
		System.out.println("TestCase Page is Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
