package seleniumdemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitlyWait {
	public static  String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	WebDriver driver;
@BeforeTest	
public void BT() throws InterruptedException{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	String beforelogin =driver.getTitle();
	

}
@Test
public  void testcase1() throws InterruptedException{
WebDriverManager.chromedriver().setup();

WebDriver driver =new ChromeDriver();
driver.get(url);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
String beforelogin =driver.getTitle();

//driver.manage().window().maximize();
driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@type='submit']")).click();
String afterlogin =driver.getTitle();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);



}
}

