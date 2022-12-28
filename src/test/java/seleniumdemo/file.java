package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class file {
public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@Test
	public void Dipak ()throws InterruptedException
	{


    	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C://Users//Rutuja//Desktop//Moolya class//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);	
		String beforelogin=driver.getTitle();
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		
			
	
		
		//delete method
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		Thread.sleep(5000);
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(7).click();
		Thread.sleep(5000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(7).click();
		Thread.sleep(5000);
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(7).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
	

		//after login
		String afterlogin=driver.getTitle();
		if(beforelogin.equals(afterlogin)) {
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			
			System.out.println("The title of the page is not same");
		
	
	}
	
	}
}


