package first_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fifth_Title_of_webpage {
	
	public static void main(String[]args)
	{
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        
        driver.get("https:amazon.in");
        // to check the titile of the website
        System.out.println("The title of the website is :"+driver.getTitle());
        // to check url of the website
        System.out.println("This current url of this website is :"+ driver.getCurrentUrl());
        System.out.println();
	}

}
