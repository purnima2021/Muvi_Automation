package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class SelectPlatform extends TestBase{

	@FindBy(id="nextbtn") WebElement next;
	
	public SelectPlatform() {
		PageFactory.initElements( driver, this);
	}
	
	public void ClickOnNext() {
		next.click();
	}
}
