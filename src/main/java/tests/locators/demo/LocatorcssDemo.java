package tests.locators.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorcssDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver1=new ChromeDriver();
		 
		 driver1.get("https://demo.nopcommerce.com/");
		 
			Thread.sleep(1000);
			driver1.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
			driver1.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();
			
			driver1.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");
			driver1.findElement(By.cssSelector("button.button-1 search-box-button")).sendKeys("Macbook");
			driver1.findElement(By.cssSelector("input.button-1 search-box-button")).sendKeys("Macbook");
			driver1.findElement(By.cssSelector("input.button-1 search-box-button[name='q']")).sendKeys("Macbook");
			driver1.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
			
		
			
			
		
	}

}
