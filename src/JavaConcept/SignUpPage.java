package JavaConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://dev.bitbatua.com/"); // enter URL
		Thread.sleep(2000);
		
//		To Click On Sign Up Button
		driver.findElement(By.xpath("//a[normalize-space()='Create Account']")).click();
		Thread.sleep(2000);
		
////		To Enter The Email Address
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("prakash@lapits.com");	
//		
////		To Enter The Password
//		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-layout[1]/app-login[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]")).sendKeys("Prakash@12345");	
//		
////		To Click On Remember Me Check Box
//		driver.findElement(By.xpath("//input[@name='remember']")).click();
//		
//		Thread.sleep(2000);
//		
////		To Click On Sign Up Buttons
//		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		
		
	}

}
