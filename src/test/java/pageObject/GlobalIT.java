package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalIT 
{

	@FindBy(xpath = "//*[@data-automation-id='HeroTitle']")
	List<WebElement> GlobalITApp;
	
	@FindBy(xpath = "//div[@data-automation-id='CanvasLayout']/div[2]//span[@role='heading']")
	WebElement ITNews;
	
	@FindBy(id ="it-awards")
	WebElement ITAwards;
	
	@FindBy(xpath = "//div[@data-theme-emphasis='1']//div[@data-automation-id='BaseCollection-FreshData']//a[@data-automation-id='newsItemTitle']")
	List<WebElement> NewsContainer;
	
	@FindBy(xpath = "//div[contains(@class, 'itemArea')]")
	List<WebElement> AwardsContainer;
	
	
	
	
	
	
}
