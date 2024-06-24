




package testing.windowsJSexecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractwithElementsUsingJS {
	

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		//ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement iframe= driver.findElement(By.xpath("//iframe[@id='frame-one796456169']"));
		driver.switchTo().frame(iframe);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//JavascriptExecutor js=driver;
		
		
		//First name - inputbox
		//First name - inputbox
		
		Thread.sleep(1000);
		WebElement inputbox=driver.findElement(By.xpath("//input[@name='RESULT_TextField-1']"));
				js.executeScript("arguments[0].setAttribute('value','john')", inputbox);
				
				//Radio button
				WebElement male_Rd=driver.findElement(By.id("RESULT_RadioButton-7_0"));
				//male_Rd.click();  //ClickInterceptedException
				js.executeScript("arguments[0].click();",male_Rd);
				
				
				//Checkbox
				WebElement chkbox=driver.findElement(By.id("RESULT_CheckBox-8_0"));
				js.executeScript("arguments[0].click();",chkbox);
				
				
				//button
				WebElement button=driver.findElement(By.id("FSsubmit"));
				js.executeScript("arguments[0].click();",button);
	}


}
