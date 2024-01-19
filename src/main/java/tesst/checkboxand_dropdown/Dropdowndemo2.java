package tesst.checkboxand_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Dropdowndemo2 {
	public static void main(String args[])
			{
	
	WebDriver driver=new ChromeDriver();
	


    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
	driver.manage().window().maximize();
	
	
	//clicking on the dropdown
	driver.findElement(By.xpath("//button[@type='button'  and contains(@class,'multiselect')]")).click();
	
	List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));
	
	//find total number of options
	System.out.println("Total number of options:"+options.size());
		
	//print all the options from dropdown
	
	for(int i=0;i<options.size();i++)
		
	{
		System.out.println(options.get(i).getText());
	}
	
	/*for(int i=0;i<options.size();i++)
	{
	
	String option=options.get(i).getText();
	
	if(option.equals("Java") || option.equals("Python"))
	{
		options.get(i).click();
	}
	
}*/

for(WebElement option:options)
{
	String text=option.getText();
	if(text.equals("Java") || text.equals("Python"))
	{
		option.click();
	}
}

}

}
