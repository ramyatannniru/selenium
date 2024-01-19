package com.testing.webdrivenmethods.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ConditionalMethods {

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
		boolean data1=driver1.findElement(By.xpath("//input[@id='gender-female']")).isSelected();
		
		
		System.out.println(data1);
		
		
		
		data.click();
		
		System.out.println(	data.isSelected());
		
		
		

	}

}
