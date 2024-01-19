package com.testing.webdrivenmethods.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver1=new ChromeDriver();
		 
		 driver1.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		 
		/*
		 * WebElement ed= driver1.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		 */
		
		//System.out.println(ed.isDisplayed());
		
		 Thread.sleep(1000);
		WebElement data=driver1.findElement(By.xpath("//input[@id='gender-male']"));
	System.out.println(	data.isSelected());
	driver1.close();
	
	WebDriver driver2=new ChromeDriver();
	 
	 driver2.get("https://demo.nopcommerce.com");
	 
	 Thread.sleep(1000);
	driver2.findElement(By.partialLinkText("Computers")).click();
	 
	
driver2.quit();
	


	

	}

}
