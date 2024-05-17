package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Brands {

	WebDriver driver;
	
	public Brands(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/brand_products/H&M']")WebElement handm;
	@FindBy(xpath = "//a[@href='/brand_products/Allen Solly Junior']")WebElement allensolly;
	
	public void brandsconfirm()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement brandsText = driver.findElement(By.xpath("//h2[text()='Brands']"));
		Assert.assertEquals(brandsText.getText(), "BRANDS", "Brand is not Visible");
		System.out.println("BRANDS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handm()
	{
		handm.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void handmconfirm()
	{		
		WebElement handmText = driver.findElement(By.xpath("//h2[text()='Brand - H&M Products']"));
		Assert.assertEquals(handmText.getText(), "BRAND - H&M PRODUCTS", "H&M PRODUCTS is not Visible");
		System.out.println("H&M PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void allensolly()
	{
		allensolly.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void allensollyconfirm()
	{
		WebElement handmText = driver.findElement(By.xpath("//h2[text()='Brand - Allen Solly Junior Products']"));
		Assert.assertEquals(handmText.getText(), "BRAND - ALLEN SOLLY JUNIOR PRODUCTS", "Allen Solly PRODUCTS is not Visible");
		System.out.println("Allen Solly PRODUCTS are Visible");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
