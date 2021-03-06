package com.crm.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.qa.crm.util.TestUtil;

public class ContactsPageTest extends TestBase{

	LoginPage loginpage;
	HomePage homepage;
	ContactsPage contactsPage;
	String sheetname = "Contacts";
	
	ContactsPageTest() {
		super();
	}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginpage = new LoginPage();
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickoncontactslink();
		contactsPage = new ContactsPage();	
	}

	@DataProvider
	public Object[][] getCRMTestData() throws EncryptedDocumentException, InvalidFormatException, IOException {
		Object data[][] = TestUtil.getTestData(sheetname);
		return data;
	}
	
//	@Test(dataProvider="getCRMTestData")
//	public void verifycontactpagetitle(String fname,String lname,String mname) throws InterruptedException {
//	contactsPage.openContatcForm(fname,lname,mname);
	@Test	
	public void verifycontactpagetitle() throws InterruptedException {
		contactsPage.openContatcForm("test","test","test");	
	}
	


	@AfterMethod
	public void teardown() {
		driver.quit();
	}
}
