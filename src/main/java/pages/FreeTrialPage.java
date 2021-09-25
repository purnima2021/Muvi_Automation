package pages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.TestBase;

public class FreeTrialPage extends TestBase{

	@FindBy(id="name") WebElement name;
	@FindBy(id="inputPassword") WebElement password;
	@FindBy(id="email") WebElement email;
	@FindBy(xpath="//div[@id='terms_check']/input") WebElement privacycheckbox;
	@FindBy(xpath="//button[@id='nextbtn']") WebElement next;
	
	public FreeTrialPage() {
		PageFactory.initElements( driver, this);
	}
	
	public void SetName(String nm) {
		name.sendKeys(nm);
	}
	
	public void SetPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void SetEmail() {
		Random randomGenerator = new Random();  
		int randomInt = randomGenerator.nextInt(1000);  
		email.sendKeys("username"+ randomInt +"@yopmail.com");
	}
	
	public void ClickOnPrivacyCheckbox() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", privacycheckbox);
	}
	
	public void ClickOnNext() {
driver.findElement(By.xpath("//body")).click();
		next.click();
	}
}
