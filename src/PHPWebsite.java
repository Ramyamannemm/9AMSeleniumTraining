import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PHPWebsite {

	
	//login to php travels and validate that login is successful
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Run time polymorphysim
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.xpath("//a[contains(@class,'sign-in btn')]")).click();
		
	}
	
	//this test case verifies the title of php travels home page
	@Test
	public void verifyTitle()
	{
		String ExpectedTitle="PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Run time polymorphysim
		driver.get("https://phptravels.com/demo/");
		String actualtitle=driver.getTitle();
		Assert.assertEquals(ExpectedTitle, actualtitle);
		
	}
}
