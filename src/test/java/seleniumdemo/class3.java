//package seleniumdemo;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class class3 {
//public static String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
//     
//	public void test() throws InterruptedException {
//    	  WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C://Users//Rutuja//Desktop//Moolya class//chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get(url);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		
//		String beforelogin=driver.getTitle();
//		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[10]/a")).click();
//		driver.findElement(By.xpath("//*[@class=oxd-input oxd-input--active]")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@type='submit']")).click();
//		
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab-item']")).click();
////		driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active orangehrm-firstname']")).click();
//
//		after login
//		String afterlogin=driver.getTitle();
//		if(beforelogin.equals(afterlogin)) {
//			driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
//		 Thread.sleep(3000);
//			driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
//			
//			System.out.println("The title of the page is same");
//		
//	
//	}
//		else
//		{
//			System.out.println("The title of the page is not same");
//		}
//	}
//}
