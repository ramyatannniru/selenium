package com.demo.testing.frames_browser;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserassign {

	public static void main(String[] args) {

		 ChromeDriver driver =new ChromeDriver();
	        WebDriver driver1=new ChromeDriver();
	        //open browser
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        driver.get("https://testautomationpractice.blogspot.com/");
	        System.out.println("title"+""+driver.getCurrentUrl());
	        
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	        
	        driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("java");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
	     List<WebElement> links= driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a[@target='_blank']"));
	      
	 	System.out.println(links);
	 	
			
	        //List<WebElement> links=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
			
			System.out.println("Number of Links:"+ links.size());
			
 
			
			for(WebElement link:links)
			{
			
				link.click();
				
			}
			
			System.out.println("printing & clicking links................");
			Set<String> windowIds=driver.getWindowHandles();
			
		
			
			for(String winid:windowIds)
			{
				driver.switchTo().window(winid);
				
				
			}
			
			driver.quit();
		}
	        
	        

	}


