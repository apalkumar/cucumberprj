package com.crm.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Anil Pal')]")
	WebElement usernamelabel;

	@FindBy(xpath="//nav[@class='site-nav']/ul/li[2]")
	WebElement sCategoriesL;

	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contacts;

	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement deals;

	@FindBy(xpath="//span[contains(text(),'Tasks')]")
	WebElement tasks;

	@FindBy(xpath="//div[text()='Deals']")
	WebElement dealPageLogo;

	@FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']")
	WebElement btnCreate;

	@FindBy(name="first_name")   //-- For Free CRM and Mehar
	WebElement firstname;

	@FindBy(name="last_name")   //-- For Free CRM and Mehar
	WebElement lastname;

	@FindBy(name="middle_name")   //-- For Free CRM and Mehar
	WebElement middlename;

	@FindBy(name="company")   //-- For Free CRM and Mehar
	WebElement companyname;

	@FindBy(xpath="//div[@class='ui active visible fluid multiple search selection dropdown']")
	WebElement tags;

	//	Initialize Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validatehomePageTitle() {
		return driver.getTitle();
	}

	public ContactsPage clickoncontactslink() throws InterruptedException {
		contacts.click(); 
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Contacts']")));
		System.out.println("Contact Link Open");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", btnCreate);
		driver.navigate().refresh();
		return new ContactsPage();
	}

	public DealsPage clickondealslink() {
		deals.click();
		return new DealsPage();
	}

	public TasksPage clickontasksslink() {
		tasks.click();
		return new TasksPage();
	}

	public boolean verifydealpagelogo() {
		boolean flag = dealPageLogo.isDisplayed();
		return flag;
	}

	public void selectCategory() {
		sCategoriesL.click();;
	}

}


