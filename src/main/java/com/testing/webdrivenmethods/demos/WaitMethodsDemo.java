package com.testing.webdrivenmethods.demos;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMethodsDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WaitMethodsDemo demo=new WaitMethodsDemo();
		
		demo.method3();

	}
	
	public void  method1() throws InterruptedException 
	{
		ChromeDriver driver =new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        
      //implicit method
        //driver1.wait();
        
        driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        driver1.get("https://opensource-demo.orangehrmlive.com");
        
      
        
        System.out.print("waiting");
      //  Thread.sleep(1000);
        
        WebElement data=  driver1.findElement(By.name("username")) ;
        
        
        data.sendKeys("Admin");
        
        }
	public void method2()
	{
		
		ChromeDriver driver =new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        
      //explicit method
        //driver1.wait();
        
        WebDriverWait wait= new WebDriverWait(driver1, Duration.ofSeconds(100));
        driver1.get("https://opensource-demo.orangehrmlive.com");
        
      
        
        System.out.print("waiting");
      //  Thread.sleep(1000);
        
        
        WebElement user=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        
        
        user.sendKeys("Admin");
        
        System.out.println("added user name");
		
	}
	
	public  void method3()
	{
		ChromeDriver driver =new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        
      //fluent method
        //driver1.wait();
        
      
        driver1.get("https://opensource-demo.orangehrmlive.com");
        
        FluentWait mywait=new FluentWait(driver1);
		mywait.withTimeout(Duration.ofSeconds(30));
	    mywait.pollingEvery(Duration.ofSeconds(5));
	    mywait.ignoring(NoSuchElementException.class);
		
			
		//usage
	    WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
	

	}

}
