package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//button[text()='Free Trial']") WebElement freetrial;
	
	public HomePage() {
		PageFactory.initElements( driver, this);
	}
	
	public void ClickOnFreeTrial() {
		freetrial.click();
	}
}
