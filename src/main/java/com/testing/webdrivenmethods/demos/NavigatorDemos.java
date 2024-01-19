package com.testing.webdrivenmethods.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatorDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
	
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl()); // amzon
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl()); // flipkart
		
		driver.navigate().refresh();  // refresh the page
		

	}

}
