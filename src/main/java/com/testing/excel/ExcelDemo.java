package com.testing.excel;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDemo {

	private static final String WebElemnts = null;

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		WebElement deposit= driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		WebElement month= driver.findElement(By.xpath("//input[@id='mat-input-1']"));
		WebElement ir= driver.findElement(By.xpath("//input[@id='mat-input-2']"));
		String file=System.getProperty("user.dir")+"\\testdata\\caldata2.xlsx";
		
		int rows=ExcelUtilsdemo.getRowCount(file, "Sheet1");
		
		System.out.println(rows);
		for(int i=1;i<=rows;i++)
		{
		  String depositamount= ExcelUtilsdemo.getCellData(file,"Sheet1",i,0);
				
			String lmonths=ExcelUtilsdemo.getCellData(file,"Sheet1",i,1);
			String irs=ExcelUtilsdemo.getCellData(file,"Sheet1",i,2);
			String compounding=ExcelUtilsdemo.getCellData(file,"Sheet1",i,3);
			String expected=ExcelUtilsdemo.getCellData(file,"Sheet1",i,4);
			
			
		deposit.clear();
		deposit.sendKeys(depositamount);
		month.clear();
		month.sendKeys(lmonths);
		ir.clear();
		ir.sendKeys(irs);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement clik= driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c109-4']"));

		js.executeScript("arguments[0].click();",clik);  
		List<WebElement> cpoundsdata= driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//mat-option"));
		System.out.println(cpoundsdata.size());
		for(WebElement cp:cpoundsdata)
		{
			System.out.println(cp.getText());
			System.out.println(compounding);
			if(cp.getText().equals(compounding))
			{
				js.executeScript("arguments[0].click();",cp);  	
				}
			
		}
			WebElement  button= driver.findElement(By.xpath("//button[@id='CIT-chart-submit']//div[@class='mdc-button__ripple']"));
		
			
			
			js.executeScript("arguments[0].click();",button);  // clicking on calculate button
		WebElement  actual= driver.findElement(By.xpath("//span[@id='displayTotalValue']"));
		String dataact= actual.getText();
		System.out.println("act total is: " + dataact);
		System.out.println("exp total is: " + expected);
		if(dataact.equals(expected)) {
			
			System.out.println("Test Passsed");
			ExcelUtilsdemo.setCellData(file, "Sheet1",i,6,"Passed");
			ExcelUtilsdemo.fillGreenColor(file, "Sheet1",i,6);
			
		}
		
		else
		{
			System.out.println("Test Failed");
			ExcelUtils.setCellData(file, "Sheet1",i,6,"Failed");
			ExcelUtils.fillRedColor(file, "Sheet1",i,6);
		}
		Thread.sleep(3000);
		}

	}

}
