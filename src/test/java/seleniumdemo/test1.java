package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 extends util{
	
	public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static String url1 = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	WebDriver driver;
	
	
	@BeforeTest
	public void BT()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url1);
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
//		WebElement web = driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
//		util.drawBorder(web, driver);
//		util.flash(web, driver);
//		Util.changeColor(url, web, driver);
		
		JavascriptExecutor javas= ((JavascriptExecutor)driver);
		WebElement email = driver.findElement(By.id("email"));
		util.scrollIntoView(email, driver);
		util.passingValuesUsingJS(email, "dipak91@gmail.com", driver);
		
		WebElement pass = driver.findElement(By.id("passwd"));
		util.passingValuesUsingJS(pass, "Dipak91", driver);
		
		WebElement signin = driver.findElement(By.name("SubmitLogin"));
		util.clickElementByJS(signin, driver);
		
		
		
		WebElement tshirt = driver.findElement(By.xpath("//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a"));
		util.clickElementByJS(tshirt, driver);
		Thread.sleep(3000);	
		
		WebElement addcart = driver.findElement(By.xpath("//*[@class='button ajax_add_to_cart_button btn btn-default']"));
		util.scrollIntoView(addcart, driver);
		util.clickElementByJS(addcart, driver);
		Thread.sleep(3000);	
		
		WebElement Continue = driver.findElement(By.xpath("//*[@class='continue btn btn-default button exclusive-medium']"));
		Thread.sleep(3000);
		util.clickElementByJS(Continue, driver);
		Thread.sleep(3000);
		
		WebElement carticon = driver.findElement(By.xpath("//*[@title='View my shopping cart']"));
		util.scrollIntoView(carticon, driver);
		Thread.sleep(3000);
		util.clickElementByJS(carticon, driver);
		Thread.sleep(3000);
		
		WebElement instock = driver.findElement(By.xpath("//*[@class='label label-success']"));
		util.scrollIntoView(instock, driver);
		util.drawBorder(instock, driver);
		Thread.sleep(3000);
		
		WebElement delete = driver.findElement(By.xpath("//*[@class='icon-trash']"));
		util.scrollIntoView(delete, driver);
		util.clickElementByJS(delete, driver);
		Thread.sleep(3000);
		
		WebElement logout = driver.findElement(By.xpath("//*[@class='logout']"));
		util.clickElementByJS(logout, driver);
	}	
	@AfterTest(enabled = true )
	public void AT()
	{
		driver.quit();
	}
}
