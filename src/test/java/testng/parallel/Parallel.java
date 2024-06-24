package testng.parallel;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	void setup(String br,String appurl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		//WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			//WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(appurl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testLogo()
	{
		try
		{
		String status=driver.findElement(By.xpath("//h1[normalize-space()='Get started on Heroku today']")).getText();
		String status1="Get started on Heroku today";
		Assert.assertEquals(status,status1);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testHomePageTitle()
	{
		Assert.assertEquals(driver.getTitle(),"Heroku | Sign up","Titles are bot matched..");
		
	}
	
	@AfterClass
	void closeApp()
	{
		driver.quit();
	}
}

