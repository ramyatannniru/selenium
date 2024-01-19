package test.brokenscrennshots.browserhandles;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import java.net.HttpURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int count=0;
WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> link= driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		for(WebElement liks:link)
		{
			System.out.println(liks.getText());
			
			String href=liks.getAttribute("href");
			
			System.out.println(href);
			
			
			if(href==null || href.isEmpty() )
			{
				System.out.println("it is empty");
				continue;
			}
			else
			{
				URL url=new URL(href);
				
				HttpURLConnection connet= (HttpURLConnection) url.openConnection();
				  connet.connect();
				  
				  if(connet.getResponseCode()>=400)
				  {
					  System.out.println(liks.getText()+"broken");
					  count++;
				  }
				  
				  else
				  {
					  System.out.println(liks.getText()+"not a broken");
				  }
					  
						
			}
			
		}
		
		System.out.println(count);
		
		
		

	}

}
