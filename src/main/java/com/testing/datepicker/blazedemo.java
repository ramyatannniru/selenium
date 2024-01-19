package com.testing.datepicker;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class blazedemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select drpCountry=new Select(drpCountryEle);
		
		//1) Selecting an option from teh dropdown
		drpCountry.selectByVisibleText("Boston");

	
		
		WebElement drpCountryEl2=driver.findElement(By.xpath("//select[@name='toPort']"));
		Select drpCountry1=new Select(drpCountryEl2);
		
		//1) Selecting an option from teh dropdown
		drpCountry1.selectByVisibleText("Rome");
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		
		ArrayList<WebElement> price=(ArrayList<WebElement>) driver.findElements(By.xpath("//table[@class='table']//tbody//tr//td[6]"));
		
		
		System.out.println(price.size());
		
		System.out.println(price.get(0).getText());
		
		String str[]=new String[price.size()];
		
		for(int i=1;i<=price.size();i++)
		{
			String pay=driver.findElement(By.xpath("//table[@class='table']//tbody//tr["+i+"]//td[6]")).getText();
			
			str[i-1]=pay;
			System.out.println(str[i-1]);
		}
		
		Arrays.sort(str);
		
		System.out.println("lowest"+str[0]);
		
		Thread.sleep(100);
				
				driver.findElement(By.xpath("//table[@class='table']//tbody//tr[1]/td[1]//input[@class='btn btn-small']")).click();
				
				
				System.out.println("lowestclicked");

				driver.findElement(By.id("inputName")).sendKeys("John");
				driver.findElement(By.id("address")).sendKeys("1403 American Beauty Ln");
				driver.findElement(By.id("city")).sendKeys("Columbus");
				driver.findElement(By.id("state")).sendKeys("OH");
				driver.findElement(By.id("zipCode")).sendKeys("43240");
				driver.findElement(By.id("creditCardNumber")).sendKeys("6789067345231267");
				driver.findElement(By.id("creditCardYear")).clear();
				driver.findElement(By.id("creditCardYear")).sendKeys("2022");
				driver.findElement(By.id("nameOnCard")).sendKeys("John Canedy");
				driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
				
				String msg=driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).getText();
				
				if(msg.contains("Thank you for your purchase"))
				{
					System.out.println("Success !! Passed");
				}
				else
				{
					System.out.println("Failed");	
				}
			
				driver.quit();
				
			
			

	}

}
