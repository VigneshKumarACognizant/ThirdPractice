package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import baseTest.BasePage;

public class BeCognizantHome 
{
	BasePage bp = new BasePage();
	public void clickOnCorprorateFunction()
	{
		bp.driver.findElement(By.xpath("//div[contains(@class,'ms-OverflowSet-item item')]//button[@name='Corporate Functions']")).click();
	}
	
	public void hoverToSecurityAndTechnology()
	{
		Actions builder = new Actions(bp.driver);
		builder.moveToElement(bp.driver.findElement(By.xpath("//span[contains(@class,'ms-ContextualMenu-itemText') and text()='Security and Technology']"))).perform();
	}
	
	public void clickOnGlobalIT() throws InterruptedException
	{
		Thread.sleep(1000);
		bp.driver.findElement(By.xpath("//span[contains(@class,'ms-ContextualMenu-itemText label') and text()='IT']")).click();
	}
}
