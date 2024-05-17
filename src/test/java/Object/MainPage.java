package Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Test.AddressInfo;
import Test.Brands;
import Test.Cart;
import Test.Category;
import Test.ContactUs;
import Test.DeleteAccount;
import Test.EnterAccInformation;
import Test.IncorrectPassword;
import Test.LoggedInAs;
import Test.OtherLogin;
import Test.Payment;
import Test.ProceedToCheckout;
import Test.Products;
import Test.Quantity;
import Test.Recommended;
import Test.RegisterWhileCheckout;
import Test.RegisteredAccount;
import Test.Remove;
import Test.Review;
import Test.SearchProduct;
import Test.Subscription;
import Test.TestCase;
import Test.UpArrow;

public class MainPage {

	@Test
	public static void mainExecutionMethod() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/products");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Login login = new Login(driver);
		
		NewUserSignup newaccount = new NewUserSignup(driver);
		
		EnterAccInformation enterinfo = new EnterAccInformation(driver);
		
		AddressInfo addinfo = new AddressInfo(driver);
		
		LoggedInAs loggedinas = new LoggedInAs(driver);
		
		DeleteAccount deleteacc = new DeleteAccount(driver);
		
		LoginToAccount loginacc = new LoginToAccount(driver);
		
		IncorrectPassword incorpass = new IncorrectPassword(driver);
		
		Logout logout = new Logout(driver);
		
		RegisteredAccount regacc = new RegisteredAccount(driver);
		
		ContactUs contact = new ContactUs(driver);
		
		TestCase testcase = new TestCase(driver);
		
		Products products = new Products(driver);
		
		SearchProduct searchprod = new SearchProduct(driver);
		
		Subscription subscription = new Subscription(driver);
		
		Cart cart = new Cart(driver);
		
		Quantity quantity = new Quantity(driver);
		
		RegisterWhileCheckout checkout = new RegisterWhileCheckout(driver);
		
		ProceedToCheckout procheckout = new ProceedToCheckout(driver);
		
		Payment pay = new Payment(driver);
		
		OtherLogin otherlogin = new OtherLogin(driver);
		
		Remove remove = new Remove(driver);
		
		Category category = new Category(driver);
		
		Brands brand = new Brands(driver);
		
		Review review = new Review(driver);
		
		Recommended rec = new Recommended(driver);
		
		UpArrow up = new UpArrow(driver);
		
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		enterinfo.confirmationmessage();
		enterinfo.title();
		enterinfo.password();
		enterinfo.dateOfBirth();
		enterinfo.newsletter();
		enterinfo.specialoffer();
		addinfo.fname();
		addinfo.lname();
		addinfo.company();
		addinfo.add1();
		addinfo.add2();
		addinfo.state();
		addinfo.city();
		addinfo.pincode();
		addinfo.mob();
		addinfo.createbutton();
		addinfo.confirmationmessage();
		addinfo.clickcontinue();
		loggedinas.confirmationmessage();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		login.confirmhome();
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		enterinfo.title();
		enterinfo.password();
		enterinfo.dateOfBirth();
		addinfo.fname();
		addinfo.lname();
		addinfo.company();
		addinfo.add1();
		addinfo.add2();
		addinfo.state();
		addinfo.city();
		addinfo.pincode();
		addinfo.mob();
		addinfo.createbutton();
		addinfo.clickcontinue();
		login.login();
		loginacc.email();
		loginacc.password();
		loginacc.login();
		loggedinas.confirmationmessage();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		login.confirmhome();
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		enterinfo.title();
		enterinfo.password();
		enterinfo.dateOfBirth();
		addinfo.fname();
		addinfo.lname();
		addinfo.company();
		addinfo.add1();
		addinfo.add2();
		addinfo.state();
		addinfo.city();
		addinfo.pincode();
		addinfo.mob();
		addinfo.createbutton();
		addinfo.clickcontinue();
		login.login();
		loginacc.email();
		incorpass.incorrectpassword();
		loginacc.login();
		incorpass.alertconfirm();
		
		login.loginaccountconfirm();
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		regacc.alreadyExistText();
		
		login.login();
		login.loginaccountconfirm();
		loginacc.email();
		loginacc.password();
		loginacc.login();
		loggedinas.confirmationmessage();
		logout.logout();
		login.loginaccountconfirm();
		
		login.login();
		login.loginaccountconfirm();
		loginacc.email();
		loginacc.password();
		loginacc.login();
		loggedinas.confirmationmessage();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		login.home();
		login.confirmhome();
		login.login();
		login.loginaccountconfirm();
		contact.contactus();
		contact.confirmgetintext();
		contact.name();
		contact.email();
		contact.subject();
		contact.message();
		contact.uploadfile();
		contact.submit();
		contact.submitsuccess();
		login.home();
		login.confirmhome();
		
		login.home();
		login.confirmhome();
		testcase.testcase();
		testcase.testcaseconfirm();
		
		login.home();
		login.confirmhome();
		products.products();
		products.confirmproducts();
		products.viewproduct();
		products.productname();
		products.category();
		products.price();
		products.availability();
		products.condition();
		products.brand();
		
		login.home();
		login.confirmhome();
		products.products();
		products.confirmproducts();
		searchprod.search();
		searchprod.clicksearch();
		searchprod.searchconfirm();
		searchprod.productconfirm();
		
		login.home();
		login.confirmhome();
		subscription.subscriptionconfirm();
		subscription.subemail();
		subscription.submit();
		subscription.successconfirm();
		
		login.home();
		login.confirmhome();
		cart.cart();
		subscription.subscriptionconfirm();
		subscription.subemail();
		subscription.submit();
		subscription.successconfirm();
		
		login.home();
		login.confirmhome();
		quantity.selectprod();
		quantity.prodconfirm();
		quantity.quantity();
		quantity.addcart();
		quantity.viewcart();
		quantity.confirmproductincart();
		
		login.home();
		login.confirmhome();
		checkout.addtocart();
		checkout.continueshop();
		cart.cart();
		cart.confirmshoppingcart();
		procheckout.proceedtocheckout();
		procheckout.login();
		procheckout.name();
		procheckout.email();
		procheckout.signup();
		procheckout.title();
		procheckout.password();
		procheckout.dateOfBirth();
		procheckout.fname();
		procheckout.lname();
		procheckout.company();
		procheckout.add1();
		procheckout.add2();
		procheckout.state();
		procheckout.city();
		procheckout.pincode();
		procheckout.mob();
		procheckout.createbutton();
		procheckout.confirmationmessage();
		procheckout.clickcontinue();
		procheckout.confirmationmessagelog();
		cart.cart();
		procheckout.proceedtocheckout();
		procheckout.comment();
		procheckout.placeorder();
		pay.nameoncard();
		pay.cardnum();
		pay.cvc();
		pay.expmon();
		pay.expyr();
		pay.payconf();
		pay.orderplacedconfirm();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		login.home();
		login.confirmhome();
		login.login();
		procheckout.name();
		procheckout.email();
		procheckout.signup();
		procheckout.title();
		procheckout.password();
		procheckout.dateOfBirth();
		procheckout.fname();
		procheckout.lname();
		procheckout.company();
		procheckout.add1();
		procheckout.add2();
		procheckout.state();
		procheckout.city();
		procheckout.pincode();
		procheckout.mob();
		procheckout.createbutton();
		procheckout.confirmationmessage();
		procheckout.clickcontinue();
		procheckout.confirmationmessagelog();
		products.products();
		checkout.addtocart();
		checkout.continueshop();
		cart.cart();
		cart.confirmshoppingcart();
		procheckout.proceedtocheckout();
		procheckout.comment();
		procheckout.placeorder();
		pay.nameoncard();
		pay.cardnum();
		pay.cvc();
		pay.expmon();
		pay.expyr();
		pay.payconf();
		pay.orderplacedconfirm();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();

		login.login();
		procheckout.name();
		procheckout.email();
		procheckout.signup();
		procheckout.title();
		procheckout.password();
		procheckout.dateOfBirth();
		procheckout.fname();
		procheckout.lname();
		procheckout.company();
		procheckout.add1();
		procheckout.add2();
		procheckout.state();
		procheckout.city();
		procheckout.pincode();
		procheckout.mob();
		procheckout.createbutton();
		procheckout.confirmationmessage();
		procheckout.clickcontinue();
		login.login();
		otherlogin.email();
		otherlogin.password();
		otherlogin.login();
		procheckout.confirmationmessagelog();
		products.products();
		checkout.addtocart();
		checkout.continueshop();
		cart.cart();
		cart.confirmshoppingcart();
		procheckout.proceedtocheckout();
		procheckout.comment();
		procheckout.placeorder();
		pay.nameoncard();
		pay.cardnum();
		pay.cvc();
		pay.expmon();
		pay.expyr();
		pay.payconf();
		pay.orderplacedconfirm();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		category.women();
		category.tops();
		category.womenstopsconfirm();
		category.men();
		category.jeans();
		category.menjeansconfirm();
		
		brand.brandsconfirm();
		brand.handm();
		brand.handmconfirm();
		brand.allensolly();
		brand.allensollyconfirm();
		
		products.products();
		products.confirmproducts();
		searchprod.searchtshirt();
		searchprod.clicksearch();
		searchprod.searchconfirm();
		searchprod.add1();
		checkout.continueshop();
		searchprod.add2();
		checkout.continueshop();
		searchprod.add3();
		checkout.continueshop();
		searchprod.add4();
		checkout.continueshop();
		cart.cart();
		cart.confirmshoppingcart();
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		enterinfo.confirmationmessage();
		enterinfo.title();
		enterinfo.password();
		enterinfo.dateOfBirth();
		enterinfo.newsletter();
		enterinfo.specialoffer();
		addinfo.fname();
		addinfo.lname();
		addinfo.company();
		addinfo.add1();
		addinfo.add2();
		addinfo.state();
		addinfo.city();
		addinfo.pincode();
		addinfo.mob();
		addinfo.createbutton();
		addinfo.confirmationmessage();
		addinfo.clickcontinue();
		cart.cart();
		
		deleteacc.deleteacc();
		
		products.products();
		products.confirmproducts();
		products.offshouldertop();
		review.name();
		review.email();
		review.review();
		review.submit();
		review.submitconfirm();
		
		login.home();
		rec.recomendedconfirm();
		rec.addtocart();
		quantity.viewcart();
		rec.confirmproduct();
		
		login.home();
		login.confirmhome();
		login.login();
		newaccount.name();
		newaccount.email();
		newaccount.signup();
		enterinfo.confirmationmessage();
		enterinfo.title();
		enterinfo.password();
		enterinfo.dateOfBirth();
		enterinfo.newsletter();
		enterinfo.specialoffer();
		addinfo.fname();
		addinfo.lname();
		addinfo.company();
		addinfo.add1();
		addinfo.add2();
		addinfo.state();
		addinfo.city();
		addinfo.pincode();
		addinfo.mob();
		addinfo.createbutton();
		addinfo.confirmationmessage();
		addinfo.clickcontinue();
		loggedinas.confirmationmessage();
		products.products();
		searchprod.searchtshirt();
		searchprod.clicksearch();
		searchprod.searchconfirm();
		searchprod.add1();
		checkout.continueshop();
		searchprod.add2();
		quantity.viewcart();
		procheckout.proceedtocheckout();
		addinfo.deladdressconfirm();
		addinfo.billaddressconfirm();
		deleteacc.deleteacc();
		deleteacc.confirmdeletemessage();
		deleteacc.continueclick();
		
		login.home();
		login.confirmhome();
		up.scrolldown();
		up.subs();
		up.scrollup();
		up.confirmtext();
		
		login.home();
		login.confirmhome();
		up.scrolldown();
		up.subs();
		up.upscroll();
		up.confirmtext();
	}
	
}
