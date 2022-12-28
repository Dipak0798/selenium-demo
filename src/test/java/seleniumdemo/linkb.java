package seleniumdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkb {
	public static  String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
@BeforeTest	
public void BT() throws InterruptedException{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	String beforelogin =driver.getTitle();
	

}
@Test
public void test ()
//total link print
{
	List<WebElement> link=driver.findElements(By.tagName("a"));
	System.out.println("Total Number of Links:  " + link.size());
	
	for(int i=0; i<link.size(); i++)
	{
		//Search
		String CLink = link.get(i).getAttribute("href");
		String Blink = "https://demo.guru99.com/test/newtours/support.php";
		
		if(CLink.equals(Blink))
		{
			System.out.println("this link is under construction: " + link.get(i).getText());
		}
//		else
//		{
//			System.out.println("Working Link");
//		}
}
}
}
