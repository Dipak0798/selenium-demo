package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ifcondition {
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
		
		
				WebElement user=driver.findElement(By.name("username"));
				if(user.isEnabled())
				{
					user.sendKeys("Admin");
					Thread.sleep(3000);
				}
				
				WebElement pass=driver.findElement(By.name("password"));
				if(pass.isDisplayed())
				{
				pass.sendKeys("admin123");
			    WebElement submit=driver.findElement(By.xpath("//*[@type='submit']"));
				
				submit.click();
				Thread.sleep(3000);
				}
				
				    
			//click Admin
		    
		    driver.findElement(By.xpath("//*[text()='Admin']")).click();
		    Thread.sleep(3000);
		    List<WebElement>click=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		    System.out.println("listsize " + click.size());
		    Thread.sleep(3000);
		    driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(7).click();
		     Thread.sleep(3000);
		     System.out.println(driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(7).getText());
		     Thread.sleep(3000);
		     driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(7).click();
		   	 Thread.sleep(3000);
		   	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
				Thread.sleep(3000);
			
				
		
	
	
		    //Action
		WebElement ele = driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		Actions act = new Actions(driver);
		act.click(ele).build().perform();	act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
	    act.sendKeys(ele,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(ele,Keys.ENTER).click().build().perform();
		Thread.sleep(3000);
		
		
		 {
			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
			
	}	
}
}		

