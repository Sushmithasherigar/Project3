package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Products {

	WebDriver driver;
	
	public Products(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//i[@class='material-icons card_travel']")WebElement products;
	@FindBy(xpath = "//a[@href=\"/product_details/1\"]")WebElement viewproduct;
	@FindBy(xpath = "//a[@href='/product_details/15']")WebElement offshouldertop;
	
	public void products()
	{
		products.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void confirmproducts()
	{
		WebElement productText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(productText.getText(), "ALL PRODUCTS", "Product Page is Not Opened");
		System.out.println("ALL PRODUCTS Page is Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void viewproduct()
	{
		viewproduct.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void productname()
	{
		WebElement productNameText = driver.findElement(By.xpath("//h2[text()='Blue Top']"));
		Assert.assertEquals(productNameText.getText(), "Blue Top", "Blue Top Brand Name is not Visible");
		System.out.println("Brand Name is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void category()
	{
		WebElement categoryNameText = driver.findElement(By.xpath("//p[text()='Category: Women > Tops']"));
		Assert.assertEquals(categoryNameText.getText(), "Category: Women > Tops", "Category is not Visible");
		System.out.println("Category is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void price()
	{
		WebElement priceText = driver.findElement(By.xpath("//span[text()='Rs. 500']"));
		Assert.assertEquals(priceText.getText(), "Rs. 500", "Price is not Visible");
		System.out.println("Price is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void availability()
	{
		WebElement availabilityText = driver.findElement(By.xpath("//b[text()='Availability:']"));
		Assert.assertEquals(availabilityText.getText(), "Availability:", "Availability is not Visible");
		System.out.println("Availability is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void condition()
	{
		WebElement conditionText = driver.findElement(By.xpath("//b[text()='Condition:']"));
		Assert.assertEquals(conditionText.getText(), "Condition:", "Condition is not Visible");
		System.out.println("Condition is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void brand()
	{
		WebElement brandText = driver.findElement(By.xpath("//b[text()='Brand:']"));
		Assert.assertEquals(brandText.getText(), "Brand:", "Brand is not Visible");
		System.out.println("Brand is Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void offshouldertop()
	{
		offshouldertop.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
