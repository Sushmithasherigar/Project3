package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Quantity {

	WebDriver driver;
	
	public Quantity(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/product_details/3']")WebElement selectprod;
	@FindBy(name = "quantity")WebElement quantity; 
	@FindBy(xpath = "//button[@class='btn btn-default cart']")WebElement addcart;
	@FindBy(linkText = "View Cart")WebElement viewcart;
	
	public void selectprod()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		
		selectprod.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void prodconfirm()
	{
		WebElement prodConfirmText = driver.findElement(By.xpath("//h2[text()='Sleeveless Dress']"));
		Assert.assertEquals(prodConfirmText.getText(), "Sleeveless Dress", "Product is Not Open");
		System.out.println("Sleeveless Dress is opened in New Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void quantity()
	{
		quantity.clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		quantity.sendKeys("4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void addcart()
	{
		addcart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void viewcart()
	{
		viewcart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmproductincart()
	{		
		WebElement confirmQuantityInCartText = driver.findElement(By.xpath("//td[@class='cart_quantity']"));
		Assert.assertEquals(confirmQuantityInCartText.getText(), "4", "Product is Not in Cart");
		System.out.println("Product is Displayed in Cart with 4 Quantity in Cart");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
}
