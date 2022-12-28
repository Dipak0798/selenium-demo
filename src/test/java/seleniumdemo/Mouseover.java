package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.sun.tools.javac.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouseover {
public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@Test
	public void Dipak ()throws InterruptedException
	{


    	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C://Users//Rutuja//Desktop//Moolya class//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		//Admin click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		//mouse
		Actions mouse = new Actions (driver);
		mouse.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")));
		Thread.sleep(3000);
		//mouse hover user role
		mouse.moveToElement(driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")));
		Thread.sleep(3000);
       //Select user role
		WebElement user = driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		mouse.click(user).build().perform();
		Thread.sleep(3000);
	    mouse.sendKeys(user,Keys.ARROW_DOWN).click().build().perform();
	    Thread.sleep(3000);
		mouse.sendKeys(user,Keys.ENTER).click().build().perform();
		//click emloyee name
		driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).click();
		//status
		WebElement user1 = driver.findElements(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")).get(1);
		mouse.click(user1).build().perform();
		Thread.sleep(3000);
		  mouse.sendKeys(user1,Keys.ARROW_DOWN).click().build().perform();
		  mouse.sendKeys(user1,Keys.ENTER).click().build().perform();
		 //mouse.sendkey
		  driver.findElement(By.xpath("//*[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).click();
		// click on search
		  driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		  
		  
		 
	}


}
			
	