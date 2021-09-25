package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class QuickTraining extends TestBase{

	@FindBy(xpath="(//a[contains(text(),'Next')])[1]") WebElement next1;
	@FindBy(xpath="(//a[contains(text(),'Next')])[2]") WebElement next2;
	@FindBy(xpath="(//a[contains(text(),'Next')])[3]") WebElement next3;
	@FindBy(xpath="//a[contains(text(),'Ok, Got It')]") WebElement ok;

	
	public QuickTraining() {
		PageFactory.initElements( driver, this);
	}
	
	public void ClickOnQuickTraining() {
		next1.click();
		next2.click();
		next3.click();
		ok.click();
	}
}
