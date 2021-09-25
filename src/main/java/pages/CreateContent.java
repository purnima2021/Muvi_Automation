package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import utility.TestBase;

public class CreateContent extends TestBase{

	@FindBy(xpath="//div[@class='mCSB_container']/ul/li[2]") WebElement ManageContent;
	@FindBy(xpath="//div[@class='mCSB_container']/ul/li[2]/ul/li[1]/a") WebElement contentlibraray;
	@FindBy(xpath="//button[text()='Add Content']") WebElement addcontent;
	@FindBy(id="mname") WebElement contentname;
	@FindBy(id="save-btn") WebElement save;
	@FindBy(xpath="//table[@id='movie_list_tbl']/tbody/tr[1]/td[1]/a/div[2]") WebElement createdcontent;

	public CreateContent() {
		PageFactory.initElements( driver, this);
	}
	
	public void ClickOnContentLibrary() {
		Actions action = new Actions(driver);
		action.moveToElement(ManageContent).build().perform();
		contentlibraray.click();
	}
	
	public void ClickOnAddContent() {
		addcontent.click();
	}
	
	public void SetContentDetails(String contentnm, String category) {
		contentname.sendKeys(contentnm);
		Select sel = new Select(driver.findElement(By.xpath("//select[@id='content_category_value']")));
		sel.selectByVisibleText(category);
	}
	
	public void ClickOnSaveAndContinue() {
		save.click();
	}
	
	public void VerifyContent(String createdcontentvalue) {
		ClickOnContentLibrary();
		Assert.assertEquals(createdcontentvalue, createdcontent.getText(), "Content Not Matched");
	}
}
