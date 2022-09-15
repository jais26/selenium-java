package first_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_Conditions {

	public static void main(String[] args) 
	
	{
		
		String browser = "Firefox";
		
		if(browser.equals("Chromee"))
		
		{ // else part runs because i have written wrong chrome spelling
			
			WebDriverManager.chromedriver().setup();
			 WebDriver driver = new ChromeDriver();
			 driver.get("https://amazon.in");
		}
		
		else if(browser.equals("Firefoxx")) 
		
		{ // else part runs because i have written wrong firefox spelling
			
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://cliffex.com");
		}		
		else 
		{
			System.out.println("None execute successfully");
		}

	}

}
