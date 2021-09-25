package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.CreateContent;
import pages.FreeTrialPage;
import pages.HomePage;
import pages.QuickTraining;
import pages.SelectPlatform;
import utility.TestBase;
import utility.TestUtil;

public class TakeFreeTrial extends TestBase{
	
	@BeforeMethod
	public void SetUp() {
		initialization();
	}
	
	@DataProvider
	public Object[][] getMuviTestData(){
		Object data[][] = TestUtil.getTestData("freetrial");
		return data;
	}
	
	@Test (dataProvider = "getMuviTestData")
	public void FreeTrialTest(String Name, String Password, String ContentName, String Category) {
		
		HomePage obj = new HomePage();
		obj.ClickOnFreeTrial();
		
		FreeTrialPage obj1 = new FreeTrialPage();
		obj1.SetName(Name);
		obj1.SetEmail();
		obj1.SetPassword(Password);
		obj1.ClickOnPrivacyCheckbox();
		obj1.ClickOnNext();
		
		SelectPlatform obj2 = new SelectPlatform();
		obj2.ClickOnNext();
		
		QuickTraining obj3 = new QuickTraining();
		obj3.ClickOnQuickTraining();
		
		CreateContent obj4 = new CreateContent();
		obj4.ClickOnContentLibrary();
		
		CreateContent obj5 = new CreateContent();
		obj5.ClickOnAddContent();
		obj5.SetContentDetails(ContentName, Category);
		obj5.ClickOnSaveAndContinue();
		obj5.VerifyContent(ContentName);
	}
	
	@AfterMethod
	public void CloseDriver() {
		driver.close();
	}

}
