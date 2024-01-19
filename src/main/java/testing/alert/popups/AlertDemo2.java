package testing.alert.popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("welcome");
		
		System.out.println(alert.getText());
		alert.accept();
		
		String act_text=driver.findElement(By.xpath("//p[@id='result']")).getText();
		
		System.out.println(act_text);
		
		String welcome="You entered: welcome";
		
		if(act_text.equals(welcome))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}
		
		
		
	}

}
