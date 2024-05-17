package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Cart {

	WebDriver driver;
	
	public Cart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/view_cart']")WebElement cart;
	
	public void cart() 
	{
		cart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void addtocartproduct()
	{
		WebElement firstProduct = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[4]/div/div[1]/div[1]/a"));
        Actions actions = new Actions(driver);
        actions.moveToElement(firstProduct).perform();
        
        WebElement addToCartButton = firstProduct.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a"));
        addToCartButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmshoppingcart()
	{
		WebElement shoppingCartText = driver.findElement(By.xpath("//li[text()='Shopping Cart']"));
		Assert.assertEquals(shoppingCartText.getText(), "Shopping Cart", "Not in Shopping Cart Page");
		System.out.println("We Are In Shopping Cart Page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
