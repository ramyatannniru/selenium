package tests.locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//WebDriverManager.chromedriver().setup();
		 WebDriver driver1=new ChromeDriver();
		 
		 driver1.get("https://www.nykaa.com/");
		 
		Thread.sleep(1000);
				 
				driver1.findElement(By.name("search-suggestions-nykaa")).sendKeys("foundation");
				 
				
				 
				 
			
						 
						
						 driver1.findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div/div/button[1]")).submit();
						
							//Thread.sleep(500);
						 
						// driver1.quit();
						 
						 
						/* driver1.get("https://demo.nopcommerce.com/");
						 
							Thread.sleep(1000);
									 
									 driver1.findElement(By.linkText("Build your own computer")).click();
									 Thread.sleep(5000);
									 
									 
									 
									 driver1.findElement(By.partialLinkText("Build your own ")).click();
									 
									 */
									 
								
											 
											 
									
						 
						 

	}

}
