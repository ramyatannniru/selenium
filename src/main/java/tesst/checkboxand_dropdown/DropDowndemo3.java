package tesst.checkboxand_dropdown;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowndemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DropDowndemo3 demo=new DropDowndemo3();
		demo.selector();

	}
	
	
	public void method1()
	{
		

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry=new Select(drpCountryEle);
		System.out.println("enetr the text");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		drpCountry.selectByVisibleText(data);
		System.out.println("country selected");
		
	/*	driver.findElement(By.xpath("//select[@id='state-list']")).click();
		
		//List<WebElement>state=driver.findElements(By.xpath("//select[@id='state-list']//option"));  
		
		List<WebElement> state=driver.findElements(By.xpath("//select[@id='state-list']//option"));
		//ul[contains(@class,multiselect)]//label
		
		System.out.println(state.size());
		
		for(WebElement state1:state )
		{
			System.out.println(state1.getText());
		}
		*/
		
		
		driver.findElement(By.id("state-list")).click(); //click on Select state drop down
		List<WebElement> states=driver.findElements(By.xpath("//select[@id='state-list']//option")); // capture all states
		
		System.out.println(states.size()); // Count number of states
		
		for(WebElement opt:states) // Select country
		{
			if(opt.getText().equals("Alsace"))
			{
				opt.click();
				break;
			}
			}
	}
	public void selector() 
	{
		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		
		WebElement drpCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpCountry=new Select(drpCountryEle);
		System.out.println("enetr the text");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		drpCountry.selectByVisibleText(data);
		System.out.println("country selected");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement state=driver.findElement(By.id("state-list"));
		Select statedrp=new Select(state);
		statedrp.selectByVisibleText("New York");
		
		System.out.println("state selexcted");
		
		
	}
	
	public void selector1()
	{
WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		//setup over
		
		
		
		//Handle drop downs without using 'select' class
		//****************************************************
		
		//select country
		/*driver.findElement(By.id("country-list")).click(); //click on Select country drop down
		List<WebElement> country=driver.findElements(By.xpath("//select[@id='country-list']//option")); // capture all countries
		
		System.out.println(country.size()); // Count number of countries
		
		for(WebElement opt:country) // Select country
		{
			if(opt.getText().equals("France"))
			{
				opt.click();
					break;
			}
		}
		
		Thread.sleep(3000);
		
		//Now select state
		driver.findElement(By.id("state-list")).click(); //click on Select state drop down
		List<WebElement> states=driver.findElements(By.xpath("//select[@id='state-list']//option")); // capture all states
		
		System.out.println(states.size()); // Count number of states
		
		for(WebElement opt:states) // Select country
		{
			if(opt.getText().equals("Alsace"))
			{
				opt.click();
				break;
			}
		}
		*/
			
		//Now , Handle drop downs using 'select' class
		//****************************************************
	 
		
		//Select Country
		WebElement country=driver.findElement(By.id("country-list"));
		Select countrydrp=new Select(country);
			
		List<WebElement> cnt=countrydrp.getOptions();
		System.out.println(cnt.size());
		
		countrydrp.selectByVisibleText("USA");
		
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Select state
		WebElement state=driver.findElement(By.id("state-list"));
		Select statedrp=new Select(state);
		
		statedrp.selectByVisibleText("New York");
				
	}
}