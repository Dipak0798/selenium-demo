package seleniumdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
    public class guru99 {
	public static  String url="https://demo.guru99.com/test/newtours/";
	WebDriver driver;
@BeforeTest	
public void BT() throws InterruptedException{
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(url);
	String beforelogin =driver.getTitle();
	Thread.sleep(3000);
	
}
@Test(enabled = true,priority=0)
public void test0() throws InterruptedException{
	driver.manage().window().maximize();
	driver.findElement(By.name("userName")).sendKeys("user");
	driver.findElement(By.name("password")).sendKeys("user");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@href='register.php']")).click();
	driver.navigate().back();
	Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(3000);
driver.navigate().forward();
}

@Test(enabled = true,priority=1)
public void test1() throws InterruptedException{
	Thread.sleep(3000);
	
	driver.findElement(By.name("firstName")).sendKeys("dipak");
	driver.findElement(By.name("lastName")).sendKeys("shinde");
	driver.findElement(By.name("phone")).sendKeys("9773440798");
	driver.findElement(By.name("userName")).sendKeys("dipak91@gmail.com");
}
@Test(enabled = true,priority=2)
public void test2() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.name("address1")).sendKeys("cst/a");
	driver.findElement(By.name("city")).sendKeys("mumbai");
	driver.findElement(By.name("state")).sendKeys("Maharastra");
	driver.findElement(By.name("postalCode")).sendKeys("400033");
}
@Test(enabled = true,priority=3)
public void test3() throws InterruptedException{
	Thread.sleep(3000);
	WebElement dropdown=driver.findElement(By.name("country"));
	Select Selectobject= new Select(dropdown);
	Selectobject.selectByValue("INDIA");
	driver.findElement(By.name("email")).sendKeys("dipak91");
	driver.findElement(By.name("password")).sendKeys("user123");
	driver.findElement(By.name("confirmPassword")).sendKeys("user123");
}
@Test(enabled = true,priority=4)
public void test4() throws InterruptedException{
	Thread.sleep(3000);
	driver.findElement(By.name("submit")).click();
	
	String afterlogin =driver.getTitle();
	
	System.out.println("Wbsite Title:  "+afterlogin);
    
}

	
	@AfterTest
	public void AT()
	{
		System.out.println("base url:  "+url);
		String curl=driver.getCurrentUrl();
		System.out.println("current url:  "+curl);
		driver.close();
	}
	
}











