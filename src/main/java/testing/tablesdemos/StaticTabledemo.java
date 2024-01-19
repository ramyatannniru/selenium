package testing.tablesdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class StaticTabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		ChromeDriver driver =new ChromeDriver();
        WebDriver driver1=new ChromeDriver();
        //open browser
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println("title"+""+driver.getCurrentUrl());
        
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.manage().window().maximize();
    	//table rows
    	int data=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
    	
    	System.out.println(data);
    	
    //	List<WebElement> list =driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
    	//list.size();
    	
    	List<WebElement> list =driver.findElements(By.tagName("tr"));//if ther ei s only one table in entire pages
    	
    	//fiint data=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/td")).size();
    	
int data1=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
    	
    	System.out.println(data1);
    	
    	//read specific row and coloumns
    	
    	
String data2=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[3]")).getText();
    	
    	System.out.println(data2);
    	
    System.out.print(	driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[1]")).getText()+"\t");
    	for(int c=2;c<=data;c++)
    	{
    		for(int r=1;r<=data1;r++)
    		{
    			String data3=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+c+"]/td["+r+"]")).getText();
    	    	
    	    	System.out.print(data3+"    ");
    		}
    		
    		System.out.println("     ");
    	}
    	
    

	
	//author is amit
	
	for(int c=2;c<=data;c++)
	{
		
		
			String result=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+c+"]/td[2]")).getText();
	    	
	    	
		String amit="Amit";
		
		if(amit.equals(result))
				{
			String book=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+c+"]/td[1]")).getText();
			
			System.out.println(book);
				}
	}
	
	
	for(int c=2;c<=data;c++)
	{
		
		
			
			String prices=driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+c+"]/td[4]")).getText();
			  
			System.out.println(prices);
			
			int date= Integer.parseInt(prices);
		    sum=sum+date;
		    
		    
				
	}
	
	System.out.println("price"+sum);
	
	
	driver.quit();

}
}
