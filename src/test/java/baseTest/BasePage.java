package baseTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.BeCognizantHome;

public class BasePage extends BeCognizantHome
{
	public WebDriver driver = new ChromeDriver();
	
	@Test
	public void homePage() throws InterruptedException 
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://be.cognizant.com");
		//BeCognizantHome beCog = new BeCognizantHome();
		beCog.clickOnCorprorateFunction();
		beCog.hoverToSecurityAndTechnology();
		beCog.clickOnGlobalIT();
		String title = driver.getTitle();
		System.out.println(title);
		String expected = "Global IT";
		if(title.equals(expected)) 
			System.out.println("Pass");
		else
			throw new RuntimeException();
	}
	
	
	
}
