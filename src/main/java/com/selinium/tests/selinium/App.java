package com.selinium.tests.selinium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        ChromeDriver driver =new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        //open browser
        
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(10000);
      WebElement data=  driver.findElement(By.name("username")) ;
      
      
      data.sendKeys("Admin");
      
      driver.findElement(By.name("password")).sendKeys("admin123");
      
      //validate title
      
      driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
      String title=driver.getTitle();
      
      String ourtitle="OrangeHRM";
      
      if(title.equals(ourtitle))
      {
    	  System.out.println("passed");
    	
      }
      Thread.sleep(1000);
    String   title1=driver.findElement( By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
     
      
      String ourtitle1="Dashboard";
      if(title1.equals(ourtitle1))
      {
    	  System.out.println("dashboard passed");
    	
      }
      else{
    	  
    	  System.out.println("dashboard not passed");
      }
      driver.close();
      driver.quit();
        } 
}
