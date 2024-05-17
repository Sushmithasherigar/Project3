package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchProduct {

	WebDriver driver;
	
	public SearchProduct(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "search")WebElement search;
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")WebElement clicksearch;
	@FindBy(name = "search")WebElement searchtshirt;
	@FindBy(xpath = "//a[@data-product-id='2']")WebElement add1;
	@FindBy(xpath = "//a[@data-product-id='28']")WebElement add2;
	@FindBy(xpath = "//a[@data-product-id='29']")WebElement add3;
	@FindBy(xpath = "//a[@data-product-id='30']")WebElement add4;

	
	public void search()
	{
		search.sendKeys("Long Maxi Tulle Fancy Dress Up Outfits -Pink");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clicksearch()
	{
		clicksearch.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void searchconfirm()
	{
		WebElement searchedProductText = driver.findElement(By.xpath("//h2[@class='title text-center']"));
		Assert.assertEquals(searchedProductText.getText(), "SEARCHED PRODUCTS", "Searched products are not Displayed");
		System.out.println("Searched Products are Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void productconfirm()
	{
		WebElement productConfirmText = driver.findElement(By.xpath("//p[text()='Long Maxi Tulle Fancy Dress Up Outfits -Pink']"));
		Assert.assertEquals(productConfirmText.getText(), "Long Maxi Tulle Fancy Dress Up Outfits -Pink", "Products are not Displayed");
		System.out.println("Products are Displayed");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void searchtshirt()
	{
		searchtshirt.sendKeys("Tshirt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add1()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		add1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add2()
	{
		add2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add3()
	{
		add3.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void add4()
	{
		add4.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	

}
