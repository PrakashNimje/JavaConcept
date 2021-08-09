package LoginPage;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openNewtab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // launch chrome

	    driver.manage().window().maximize();
	            
	    String baseUrl = "http://www.google.co.uk/";
	    driver.get(baseUrl);
	    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");

	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1)); //switches to new tab
	    driver.get("https://www.facebook.com");
	    
	    driver.switchTo().window(tabs.get(0)); // switch back to main screen        
	    driver.get("https://www.news.google.com");	
		
		
		
	}

}
