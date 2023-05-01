package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.PredefinedActions;

public class DisplayPage extends PredefinedActions {
	private static DisplayPage displayPage;

	@FindBy(xpath = "//*[@id=\"root\"]/section/section/main/div/div[2]/div[1]/div[1]/div/div/div/div")
	private WebElement textElement;
	
	@FindBy(xpath="//p[text()='Forward Trips']//parent::div//parent::div")
	private WebElement forwardTripTab;
	
	
	private DisplayPage() {
		
	}
	
	public static DisplayPage getObject() {
		if (displayPage == null)
			displayPage = new DisplayPage();
		PageFactory.initElements(driver, displayPage);
		return displayPage;
	}
	
	public String checkForwardTripSelected() {
		return getAriaSelectedAttribute(forwardTripTab);		
	}
	
	public String getForwardTripText() {
		return getElementText(textElement, true);
	}
}
