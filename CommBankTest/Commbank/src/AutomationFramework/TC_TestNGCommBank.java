package AutomationFramework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.Travel;
import Utilities.Constants;

public class TC_TestNGCommBank {
	
	WebDriver driver;
	HomePage objHomePage;
	Travel objTravel;
	WebDriverWait wait = null;
	
	@BeforeMethod
	public void LaunchAUT()
	{
		System.setProperty(Constants.DriverName, Constants.DriverPath);
		driver = new ChromeDriver();
		driver.get(Constants.URLofAUT);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void CloseAUT()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@Test
	public void TC_TravelMoneyOverseas()
	{
		objHomePage = new HomePage(driver);
		System.out.println(driver.getTitle());
		objHomePage.iconSearch().click();
		objHomePage.inpSearch().sendKeys(Constants.strDataToSearch);
		objHomePage.lnkTravelMoneyOverseas().click();
		
		objTravel = new Travel(driver);
		System.out.println(driver.getTitle());
		objTravel.lnkTellMeMore().click();
		Assert.assertEquals(Constants.actualTravelCard, objTravel.lnkTravelMoneyCard().getText());
		Reporter.log("Verifying if link to Travel money card is present.");
		
		Assert.assertEquals(Constants.actualForeignCash, objTravel.lnkForeignCash().getText());
		Reporter.log("Verifying if link to Foreign Cash is present.");
		
		objTravel.lnkLogOn().click();
		objTravel.lnkNetBankLogOn().click();
		
	//	Assert.assertEquals(Constants.ActualUserId, objTravel.txtUserId());
	//	Assert.assertEquals(Constants.ActualPassword, objTravel.txtPassword());
	}
}
