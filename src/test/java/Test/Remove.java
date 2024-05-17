package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Remove {

	WebDriver driver;
	
	public Remove(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/product_details/11']")WebElement openproduct;
	@FindBy(xpath = "//button[@class='btn btn-default cart']")WebElement cart;
	@FindBy(xpath = "//a[@class='cart_quantity_delete']")WebElement delete;
	
	public void openproduct()
	{
		openproduct.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void cart()
	{
		cart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void delete()
	{
		delete.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void emptyconfirm()
	{
		WebElement emptyText = driver.findElement(By.xpath("//a[@href=\"/products\"]/child::u"));
		Assert.assertEquals(emptyText.getText(), "here", "Cart is Not Empty");
		System.out.println("Cart is empty!");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
