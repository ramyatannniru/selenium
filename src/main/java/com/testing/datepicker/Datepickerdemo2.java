package com.testing.datepicker;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickerdemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@id='departon']")).sendKeys("10/15/2022");
		
		String year="2024";
		String month="Oct";
		String date="12";
				
		driver.findElement(By.xpath("//input[@id='departon']")).click();
		
	
		
		
		List<WebElement> year1= driver.findElements(By.xpath("//select[@aria-label='Select year']//option"));
		System.out.println(year1.size());
		 driver.findElement(By.xpath("//select[@aria-label='Select year']")).click();
		 
		 for(WebElement dt:year1)
			{
			 
			 System.out.println(dt.getText());

				if(dt.getText().equals(year))
				{
					dt.click();
					
					System.out.println("gated");
					break;
				}
					
					
					
				
				
			
				
				
			}
		 
		
 
				
	driver.findElement(By.xpath("//select[@aria-label='Select month']")).click();
	List<WebElement> month1= driver.findElements(By.xpath("//select[@aria-label='Select month']//option"));
	 System.out.print(month1.size());
		 
		 for(WebElement dt:month1)
			{
			 
			 System.out.print(dt.getText());

				if(dt.getText().equals(month))
				{
					dt.click();
					
					System.out.println("gated");
					break;
				}
			}
		
		
		
	/*	for(WebElement dt:month1)
		{
			if(dt.getText().equals(month))
			{
				dt.click();
				break;
			}
		
			
			
		}	
			
	*/	
		
		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		
		for(WebElement dt3:allDates)
		{
			if(dt3.getText().equals(date))
			{
				dt3.click();
				break;
			}
		
		
		
		
	}
			
	
		
		
	}

}

