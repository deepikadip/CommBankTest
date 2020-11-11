package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.Constants;

public class Travel {
	
	WebDriver myDriver;
	
	public Travel(WebDriver driver)
	{
		myDriver = driver;
	}
	
	public WebElement lnkTellMeMore()
	{
		return myDriver.findElement(By.linkText(Constants.lnktxtTellMeMore));
	}

	public WebElement lnkTravelMoneyCard()
	{
		return myDriver.findElement(By.linkText(Constants.lnktxtexpectedTravelCard));
	}
	
	public WebElement lnkForeignCash()
	{
		return myDriver.findElement(By.linkText("Foreign Cash"));
	}
	
	public WebElement lnkLogOn()
	{
		return myDriver.findElement(By.className(Constants.classLogOn));
	}
	
	public WebElement lnkNetBankLogOn()
	{
		return myDriver.findElement(By.xpath(Constants.xpathNetbankLogon));
	}
	
	public WebElement txtUserId()
	{
		return myDriver.findElement(By.id(Constants.txtExpectedUserId));
	}
	
	public WebElement txtPassword()
	{
		return myDriver.findElement(By.id(Constants.txtExpectedPassword));
	}
}
