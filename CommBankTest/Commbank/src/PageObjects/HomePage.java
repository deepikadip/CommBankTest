package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Constants;

public class HomePage 
{
	WebDriver myDriver;
	
	public HomePage(WebDriver driver)
	{
		myDriver = driver;
	}
	
	public WebElement iconSearch()
	{
		return myDriver.findElement(By.linkText(Constants.lnkIconSearch));
	}
	
	public WebElement inpSearch()
	{
		return myDriver.findElement(By.id(Constants.inpSearchString));
	}
	
	public WebElement lnkTravelMoneyOverseas()
	{
		return myDriver.findElement(By.linkText(Constants.lnktxtTravelMoneyOverseas));
	}
	
}
