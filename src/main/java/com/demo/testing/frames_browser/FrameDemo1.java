package com.demo.testing.frames_browser;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frm1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frm1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");
		
		//inner frame
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame
		
		driver.switchTo().defaultContent();
		
		
		//frame2
	
				
				WebElement frm2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frm2);
		driver.findElement(By.cssSelector("input[name='mytext2']")).sendKeys("11111");
		driver.switchTo().defaultContent();
		
		//frame 4
		
		WebElement frm4=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frm4);
		driver.findElement(By.cssSelector("input[name='mytext4']")).sendKeys("11111");
		driver.switchTo().defaultContent();
		
		//frame 5
		WebElement frm5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frm5);
		driver.findElement(By.cssSelector("input[name='mytext5']")).sendKeys("11111");
		driver.switchTo().defaultContent();

	}

}
