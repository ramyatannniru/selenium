package tests.locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorXpathdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
 WebDriver driver1=new ChromeDriver();
		 
		 driver1.get("https://demo.nopcommerce.com/");
		 
			Thread.sleep(1000);
			
			String a=driver1.findElement(By.xpath("//div[@class='details']/h2[@class='product-title']")).getText();
			
			System.out.println(a);

	}

}
