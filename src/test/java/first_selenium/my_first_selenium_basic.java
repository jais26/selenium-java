package first_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class my_first_selenium_basic {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https://amazon.in");
        driver.manage().window().maximize();
        System.out.println("this title of the page is:" + driver.getTitle());
        
        driver.quit();
		
	}

}
