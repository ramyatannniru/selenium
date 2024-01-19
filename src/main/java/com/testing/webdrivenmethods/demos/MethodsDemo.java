package com.testing.webdrivenmethods.demos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ChromeDriver driver =new ChromeDriver();
	        WebDriver driver1=new ChromeDriver();
	        //open browser
	        
	        driver.get("https://opensource-demo.orangehrmlive.com");
	        System.out.println("title"+""+driver.getCurrentUrl());
	        
	        System.out.println("title"+""+driver.getTitle());
	        
	        System.out.println("title"+driver.getPageSource());
	        
	        System.out.println("************************************************");
	        System.out.println("t*(***********************itle"+""+driver.getWindowHandle());
	        
	      
	}

}
