package testing.alert.popups;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ALerdemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FluentWait mywait=new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
	    mywait.pollingEvery(Duration.ofSeconds(5));
	    mywait.ignoring(ElementClickInterceptedException.class);
	    mywait.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		//List<WebElement> checkboxes=driver.findElements(By.xpath("//input[ @type='checkbox']/parent::span"));

		List<WebElement> checkboxes=(List<WebElement>) mywait.until(
				ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[ @type='checkbox']/parent::span")));				System.out.println("Total number of checkboxes:"+checkboxes.size());
				for(WebElement chkbox:checkboxes)
				{
					chkbox.click();
					Thread.sleep(100);
					if(driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).isDisplayed())
					{
						driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']")).click();
					}
					
				}
				
				//Select all the checkboxes
				//for(int i=0;i<checkboxes.size();i++)
				//{
					//System.out.println(checkboxes.get(i).getText());
				//}
		
		
		
	}

	

}
