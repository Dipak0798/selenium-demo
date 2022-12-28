package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class3Test {


   
    public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    WebDriver driver;
    
    @BeforeTest
    
    public void BT() throws InterruptedException {
    	 WebDriverManager.chromedriver().setup();
 		System.setProperty("webdriver.chrome.driver", "C://Users//Rutuja//Desktop//Moolya class//chromedriver.exe");
 		driver = new ChromeDriver();
 		driver.get(url);
 		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 		Thread.sleep(5000);
    	
    }
    @Test
	public void test1() throws InterruptedException {
    	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();

    @Test
		public void test3() throws InterruptedException {
			
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-admin-access-button']")).click();
		}
    @Test
		public void test4() throws InterruptedException {
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[]/a")).click();
			}
    
		@AfterTest
		public void AT() {
		driver.close();
		}
	
		}
    

  

