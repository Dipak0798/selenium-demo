package seleniumdemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class windowhandle {
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	public static  String url1 = "https://youtube.com";
	
	
		@Test
		public  void testcase1() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
	    String beforelogin =driver.getTitle();
		Thread.sleep(5000);
//		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		String afterlogin =driver.getTitle();
		Thread.sleep(3000);
		// window Handle
		driver.getWindowHandle();	
		// open a new tab and switches to new tab
			driver.switchTo().newWindow(WindowType.TAB);
			//navigates to new tab and opens the new link
			driver.navigate().to(url1);
			//close tab
			driver.close();
			Thread.sleep(3000);
			//close window
			driver.quit();
		}
	}

