package first_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Script_to_create_client_account {

	public static void main(String[] args) throws InterruptedException {
         // create artist 
             WebDriverManager.chromedriver().setup();
             ChromeDriver driver1 = new ChromeDriver();
       
           driver1.get("https://fmstage.indiefolio.com/");
             driver1.manage().window().maximize();
             
           //Set the username
 			String username = "cliffex";
 			
 			//Set the password
 			String password = "Cliffex@98765";
 			
 			
 			String URL = "https://" +username +":" +password +"@"+ "fmstage.indiefolio.com/";
 			driver1.get(URL);
 		
 			Thread.sleep(500);
             driver1.findElement(By.linkText("Login")).click();
             Thread.sleep(500);
             driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("a3@gmail.com");
             Thread.sleep(500);
             driver1.findElement(By.className("mob-font-14")).click();
             Thread.sleep(1000);
             driver1.findElement(By.name("firstName")).sendKeys("name");
             Thread.sleep(1000);
             driver1.findElement(By.name("lastName")).sendKeys("Artis");
            Thread.sleep(1000);
             driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[3]/div/input")).sendKeys("74447733366");
             Thread.sleep(500);
             driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[5]/div[2]")).click();
             Thread.sleep(1000);
             driver1.findElement(By.name("password")).sendKeys("Test@123");
             Thread.sleep(500);
             driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[8]")).click();
             Thread.sleep(500);
             driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[9]/button")).click();
             //admin
             
             Thread.sleep(5000);
             driver1.get("https://fmstage-admin.indiefolio.com/");
             driver1.manage().window().maximize();
             Thread.sleep(500);
             driver1.findElement(By.name("loginEmail")).sendKeys("jyoti@yopmail.com");
             Thread.sleep(500);
             driver1.findElement(By.name("loginPass")).sendKeys("123456");
             Thread.sleep(500);
            driver1.findElement(By.className("btn-block")).click();
             Thread.sleep(5000);
             driver1.findElement(By.xpath("//a[@class= 'nav-link' and text()='Artist']")).click();
        driver1.get("https://fmstage-admin.indiefolio.com/artist");
        driver1.navigate().refresh();
        Thread.sleep(5000);
        driver1.findElement(By.xpath("//a[@class= 'nav-link' and text()='Artist']")).click();
        Thread.sleep(3000);
        driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div/a/i")).click();
        // give accese board
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div/div/a[1]")).click();
        // enter password
        Thread.sleep(500);
        // yes button 
           driver1.findElement(By.xpath("/html/body/div[5]/div/div/div/button[1]")).click();

            // action toggle button 
            Thread.sleep(5000);
            driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div")).click();
        //Edit button
            Thread.sleep(5000);
            driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div/div/a[2]/button/i")).click();
            // edit for vrification
            Thread.sleep(5000);
            driver1.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/section/div[4]/button")).click();
          // Phone
            Thread.sleep(2000);
            driver1.findElement(By.name("phoneStatus")).click();
            // email
           Thread.sleep(2000);
           driver1.findElement(By.name("emailStatus")).click();

            Thread.sleep(2000);
           driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/section/div[4]/button")).click();

             //exit user
          Thread.sleep(1000);
           driver1.get("https://fmstage.indiefolio.com/");
           driver1.manage().window().maximize();
           driver1.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //   Thread.sleep(10000);
//           driver1.findElement(By.linkText("Login")).click();
//           Thread.sleep(500);
//           driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("suj9o52oi@gmail.com");
//           Thread.sleep(500);
//           driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[2]/button")).click();
//           Thread.sleep(500);
//           driver1.findElement(By.name("password")).sendKeys("Test@123");
//           Thread.sleep(500);
//           driver1.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
//          Thread.sleep(500);
//           driver1.get("https://fmstage.indiefolio.com/dashboard");
//           driver1.navigate().refresh();
//          Thread.sleep(3000);  
          // complete action
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[4]/div/div/div/div/div[2]/div[2]/div/button")).click();
           
           Thread.sleep(5000);
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[1]/div[2]/button"))
          .sendKeys("C:\\Users\\Cliffex-Lead\\Downloads\\JPG\\2_w1200 (2)jpg");
        // driver1.findElement(By.xpath("//*[@id=\"root\"]/section[2]/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/button")).sendKeys("C:\\Users\\Cliffex-Lead\\Downloads\\JPG\\2_w1200 (2)jpg");  ///from here
           Thread.sleep(5000);
            driver1.findElement(By.name("onBoardlocation")).click();
            Thread.sleep(5000);
            driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[3]/ul/li[3]")).click();
           Thread.sleep(5000);
             
   

           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/div/button")).click();
           Thread.sleep(5000);
           driver1.findElement(By.xpath("//span[text()='June 1992']")).click();
           Thread.sleep(5000);
           Actions act = new Actions(driver1);

         //Double click on element for calender
         WebElement ele = driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/span/div/div/div[1]/button[3]")); 
         act.doubleClick(ele).perform();Thread.sleep(3000);driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/span/div/div/div[2]/div/div/button[1]")).click();
           Thread.sleep(3000);
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/span/div/div/div[2]/div/div/button[1]")).click();

           Thread.sleep(3000);
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/span/div/div/div[2]/div/div/button[1]/abbr")).click();
           Thread.sleep(3000);
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[4]/div/div/span/div/div/div[2]/div/div/div/div[2]/button[2]/abbr")).click();
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div[2]/form/div/div[5]/div/div/div[1]")).click();
           Thread.sleep(3000);
          

        // Select the option by index
        //   dropdown male female
           driver1.findElement(By.xpath("//*[@id=\"react-select-2-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
           
           

          Thread.sleep(3000);
           driver1.findElement(By.name("onboardBio")).sendKeys("ewfregtrgtryhhyjuyjuyjuykyukuyuyuyuyiku");
        // save and contiue 
           Thread.sleep(3000);
           //Choose your primary specialization
           driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/form/div/div[1]/div/div[1]")).click();
        Thread.sleep(3000);
          driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/form/div/div[1]/div/div[1]/div[1]/div[2]/div/input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
           Thread.sleep(3000);
           //Choose your secondary specializations
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/form/div/div[2]/div/div[1]/div[1]")).click();
         Thread.sleep(1000);
          driver1.findElement(By.id("react-select-3-input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
          Thread.sleep(1000);
        //  Select software/tools you work with
          driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/form/div/div[3]/div/div[1]/div[1]/div[1]")).click();
          Thread.sleep(1000);
          driver1.findElement(By.id("react-select-4-input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
          Thread.sleep(1000);
          //save and contiue 
          driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")).click();
          Thread.sleep(1000);
         
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/form/div/div[1]/div/div[1]/input")).sendKeys("500");
        Thread.sleep(3000);
          driver1.findElement(By.xpath("//[@id=\"dropdownMenuButton\"]")).click();
          Thread.sleep(3000); 
          driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/form/div/div[1]/div/div[2]/div/div/span[3]")).click();
          Thread.sleep(3000); 
          //Collaterals Offered
           driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[1]/input")).click();
           Thread.sleep(500) ;
         Actions act1 = new Actions(driver1);
          Thread.sleep(4000) ;
          WebElement ele1 = driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[1]/ul"));
        act1.click(ele1).perform();
        Thread.sleep(500); 
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[2]/section/div/div/div/div/div/div/div/div/ul/li[1]/div")).click();
        Thread.sleep(500); 
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[2]/section/div/div/div/div/div/div/div/div/ul/li[2]/div")).click();
        Thread.sleep(500); 
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[2]/section/div/div/div/div/div/div/div/div/ul/li[7]/div")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[2]/section/div/div/div/div/div/div/div/div/ul/li[10]/div")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[3]/div[1]/div/div[1]/div[2]/span")).click();

        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[3]/div[1]/div/div[2]/div[2]/span")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[3]/div[2]/div/div[1]/div[2]/span")).click();
        Thread.sleep(500);
        driver1.findElement(By.name("workChargeStart")).sendKeys("5000");
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[4]/div/div[2]/input")).sendKeys("50000");
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[2]/button")).click();
        Thread.sleep(500);
        driver1.findElement(By.name("perCharge")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("dropdownMenuButton")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"dropdownMenuButton\"]")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")).click();
        Thread.sleep(500);
        driver1.switchTo().alert().accept();
         // Full-Time Freelancer
        Thread.sleep(500);
        driver1.findElement(By.className("m-0 font-weight-500 mob-font-11 mob-font-weight-700 text-secondary")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/a")).click();
        Thread.sleep(500);
        driver1.findElement(By.name("experience_Comapany")).sendKeys("Journal of Clinical and Diagnostic Research");
        Thread.sleep(500);
        driver1.findElement(By.name("company_Designation")).sendKeys("QA");
        Thread.sleep(500);
        //Actions act = new Actions(driver);
        Thread.sleep(4000);
         WebElement ele2 =  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[3]"));
         act.click().perform();
//        Month ane year
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[4]/div/div[1]/div/div")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"react-select-2-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[4]/div/div[2]/div/div/div[2]/div")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[4]/div/div[2]/div/div/div[1]/input")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[5]/div/div[1]/div")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"react-select-4-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[5]/div/div[2]/div/div/div[1]")).click();
        Thread.sleep(500);
        driver1.findElement(By.xpath("//[@id=\"react-select-5-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(500);
        driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[6]/div")).click();
        Thread.sleep(500);
        
        driver1.findElement(By.xpath("//[@id=\"react-select-6-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[7]/div/div")).click() ;
           Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"react-select-7-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
           Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[1]/div[8]/div/div/div/div/div[1]")).click();
           Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"react-select-8-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
           Thread.sleep(500);
           driver1.findElement(By.name("company_web")).sendKeys("https://www.sotrender.com/resources/knowledge-base/how-do-i-change-my-youtube-username/");
           Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[3]/form/div[2]/button")).click();
           Thread.sleep(500);
           driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[1]/input")).sendKeys("National Institute of Design (NID), Ahmedabad");
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[2]/input")).sendKeys("BCA");
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[3]/div/div[1]/div/div/div[1]")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"react-select-2-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[3]/div/div[2]/div/div/div[1]")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"react-select-3-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[4]/div/div[1]/div/div/div[1]")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"react-select-4-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[1]/div[4]/div/div[2]/div/div/div[1]")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"react-select-5-input\"]")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
                  //save sutton
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/div/form/div[2]/button")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")).click();
                  Thread.sleep(4000);
                 driver1.findElement(By.name("indiefoli_url")).sendKeys("https://www.lambdatest.com/blog/using-link-text-and-partial-link-text-in-selenium/");
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("//[@id=\"root\"]/section[2]/div/div/div[2]/div[2]/div/div/div[1]/div/div/form/div/div[11]/div/label")).click();
                  Thread.sleep(4000);
                  driver1.findElement(By.xpath("/html/body/div[1]/section[2]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div[3]/button")).click();
                  Thread.sleep(4000);
  


                driver1.get("https://fmstage-admin.indiefolio.com/");
                driver1.manage().window().maximize();
                Thread.sleep(500);
                driver1.findElement(By.name("loginEmail")).sendKeys("roopa.yadav@team.cliffex.com");
                Thread.sleep(500);
                driver1.findElement(By.name("loginPass")).sendKeys("12345678");
                Thread.sleep(500);
               driver1.findElement(By.className("btn-block")).click();
                Thread.sleep(5000);
                driver1.findElement(By.xpath("//[@id=\"sidebarCollapse\"]/ul/li[3]/a")).click();
                Thread.sleep(5000); 
                driver1.findElement(By.xpath("//[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();

              Thread.sleep(5000);
             driver1.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div/a/i")).click();

             Thread.sleep(500);
             driver1.findElement(By.xpath("//[@id=\"root\"]/div/div/div[2]/div/div/section/div/div[2]/table/tbody/tr[1]/td[1]/div/div/div/span[1]/a[1]")).click();

             Thread.sleep(500);
             driver1.findElement(By.xpath("/html/body/div[5]/div/div/div/button[1]")).click();

             Thread.sleep(500);
             driver1.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div/div[2]/div/ul/li[3]/a")).click();
		
	}

	private static void upload(String string) {
		// TODO Auto-generated method stub
		
	}


}
