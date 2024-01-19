package testing.mouseEventsdemo;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOuseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		
	WebElement desk=	driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
	WebElement mac=	driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
	
	Actions action=new Actions(driver);
	
	action.moveToElement(desk).moveToElement(mac).click().build().perform();
	
	}

}
