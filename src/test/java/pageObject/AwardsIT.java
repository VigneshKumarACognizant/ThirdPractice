package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AwardsIT 
{
	@FindBy(xpath = "//div[@id='spPageCanvasContent']//div[@data-automation-id='Canvas']/div/div[1]/div/div/div[2]//p")
	WebElement AwardContent;
	
	
}
