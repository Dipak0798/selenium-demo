package seleniumdemo;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class linkprint {
	public static  String url =	"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	
		@Test
		public  void testcase1() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		driver.get(url);
	    String beforelogin =driver.getTitle();
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		String afterlogin =driver.getTitle();
		
		Thread.sleep(3000);
		
		driver.manage().window().fullscreen();
//		driver.manage().window().maximise();
		
		// total link print
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.print(links.size());
	for(int i=0;i<links.size();i++)
	{
	
   System.out.println(links.get(i).getText());
   System.out.println(links.get(i).getAttribute("href"));
	}

	
	}
	
	}







