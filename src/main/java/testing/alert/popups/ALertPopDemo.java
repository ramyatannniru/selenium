package testing.alert.popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ALertPopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();
		
		if(text.contains("Congratulations"))
		{
			System.out.println("successful login");
		}
		else
		{
			System.out.println("login failed");
		}

	}

}
