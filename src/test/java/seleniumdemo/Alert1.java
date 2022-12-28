package seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert1 {
public static  String url =	"https://demoqa.com/alerts/";
	
	
	@Test
	public void alert1() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		  driver.get(url);
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
		  Thread.sleep(3000);
	      System.out.println(driver.switchTo().alert().getText());
		  Alert alert= driver.switchTo().alert();
		  alert.accept();
		  Thread.sleep(3000);
		  System.out.println("Clicked on time alert");
		  
		
		 driver.findElement(By.xpath("//*[@id='timerAlertButton']")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.switchTo().alert().getText());
		 Alert alert2= driver.switchTo().alert();
			alert2.accept();
			Thread.sleep(3000);
			System.out.println("Clicked on timeliness5");
			
			
			driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
			 Thread.sleep(5000);
			 System.out.println(driver.switchTo().alert().getText());
			 Alert alert3= driver.switchTo().alert();
				alert3.accept();
				Thread.sleep(3000);
				System.out.println("confirm box will appear");
				
				
				driver.findElement(By.xpath("//*[@id='promtButton']")).click();
				 Thread.sleep(5000);	 
				 System.out.println(driver.switchTo().alert().getText());
				 Alert alert4= driver.switchTo().alert();
				 Thread.sleep(3000);
				 alert4.sendKeys("Dipak");
					alert4.accept();
					Thread.sleep(3000);
					System.out.println("Dipak");	
	}
}



