package seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandle1 {
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static  String url1 =	"https://youtube.com";	
	public static  String url2 =	"https://www.google.com";
    
	WebDriver driver;
	
	@BeforeTest
	public void bt(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	@Test
	public void Testcase1()throws InterruptedException{
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	
	Thread.sleep(3000);
}

{
    driver.getWindowHandle();

    driver.switchTo().newWindow(WindowType.TAB);
    driver.navigate().to(url1);
 
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.navigate().to(url2);

     ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
     int s=tabs.size(); System.out.println(s); 
     driver.switchTo().window(tabs.get(2)); driver.close();
    }
}
