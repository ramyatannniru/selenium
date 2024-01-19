package tesst.checkboxand_dropdown;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoDemodropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='sb_form_q']")).sendKeys("java");
		
		List<WebElement> java= driver.findElements(By.xpath("//ul[@id='sa_ul']/li[contains(@class,'sa_sg')]"));
		
System.out.println("Number of suggestions:"+java.size());
		
		
		//select an option from list
		for(int i=0;i<java.size();i++)
		{
			String text=java.get(i).getText();
			
			if(text.equals("java compiler"))
			{
				java.get(i).click();
				break;
		
			}
	}

}
}
