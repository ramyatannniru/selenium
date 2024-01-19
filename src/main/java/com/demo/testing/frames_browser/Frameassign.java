package com.demo.testing.frames_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frameassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		
	
		driver.switchTo().frame("mce_0_ifr");
		driver.findElement(By.cssSelector("#tinymce")).clear();
		
		driver.findElement(By.cssSelector("#tinymce")).sendKeys("hi ramya");
		
driver.findElement(By.id("tinymce")).sendKeys(Keys.CONTROL+"A"); //select text
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//button[@title='Bold']")).click();//bold text
		
		
		

	}

}
