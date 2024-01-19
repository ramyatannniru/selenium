package tests.locators.demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//WebDriverManager.chromedriver().setup();
		 WebDriver driver1=new ChromeDriver();
		 
		 driver1.get("https://demo.nopcommerce.com/");
		 
			Thread.sleep(1000);
					 
					List<WebElement> data=driver1.findElements(By.className("header"));
					
					System.out.println(data.size());
					
					
List<WebElement> data1=driver1.findElements(By.tagName("div"));
					
					System.out.println(data1.size());
					
List<WebElement> data2=driver1.findElements(By.tagName("a"));
					
					System.out.println(data2.size());
					
					
					
		 
	}
		 


}
