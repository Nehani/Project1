package Testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.PredefinedActions;
import Pages.LoginPage;

public class LoginTest {

	@Test
	public void tc1() {
		System.out.println("STEP - Launch Chrome Browser & Hit url");
		PredefinedActions.start("http://vcargo.managedservice.in/admin/homepage\r\n" + "");

		System.out.println("STEP - Enter valid login credentials");
		LoginPage loginPage = LoginPage.getObject();
		loginPage.login("logistics.safety@nayaraenergy.com", "Safety@2023");

		System.out.println("VERIFY - home page is displayed");
		String expetedTitle = "THÉA Virtual Cargo";
		String actualTitle = loginPage.getPageTitle();

		Assert.assertEquals(actualTitle, expetedTitle,
				"Expected title was " + expetedTitle + " but actual title was " + actualTitle);

		//String expectedText= "Vehicles | Forward Trips In-Progress";
		//String actualText =  

		//System.out.println("Clean up - Close browser");
		// PredefinedActions.closeBrowser();
	}

}
