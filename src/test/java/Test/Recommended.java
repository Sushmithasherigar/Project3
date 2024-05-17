package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Recommended {

	WebDriver driver;
	
	public Recommended(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@data-product-id='6']")WebElement addtocart;
	
	public void recomendedconfirm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,7500)");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement recomendedText = driver.findElement(By.xpath("//h2[text()='recommended items']"));
		Assert.assertEquals(recomendedText.getText(), "RECOMMENDED ITEMS", "Recommended Items Not Visible");
		System.out.println("Recommended Items Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void addtocart()
	{
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmproduct()
	{
		WebElement recomendedText = driver.findElement(By.xpath("//a[text()='Summer White Top']"));
		Assert.assertEquals(recomendedText.getText(), "Summer White Top", "Items Not Visible");
		System.out.println("Items Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
