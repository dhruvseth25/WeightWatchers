package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FindAStudio {
	
	public WebDriver ldriver;
	
	// Constructor
	public FindAStudio(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(id =("meetingSearch"))
	@CacheLookup
	public WebElement meetSearch;
	
	
	@FindBy(xpath="//button[@class='btn spice-translated']")
	@CacheLookup
	WebElement ArrowButton;
	
	@FindBy(className="meeting-location__top")
	@CacheLookup
	WebElement ResultTop;
	
	@FindBy(xpath="//span[contains(text(),'WW Studio Flatiron')]")
	@CacheLookup
	WebElement WWStudioFlatiron;
	
	//========================================================================//	
	
	
		
		public void FindaStudioPageTitle() {
		
			System.out.println(ldriver.getTitle());
			String Verify=ldriver.findElement(By.xpath("//title[contains(text(),'Find WW Studios & Meetings Near You | WW USA')]")).getText();
			System.out.println(Verify);
			}
		
		public void clickOnArrowButton() {
			ArrowButton.click();
		}
		
		public void getFirstResult() {
			WebDriverWait wait = new WebDriverWait(ldriver, 10);
			wait.until(ExpectedConditions.visibilityOf(ResultTop));
			String FirstResult=ResultTop.getText();
			System.out.println(FirstResult);
		}
		
		public void clickOnWWStudioFlatiron() {
			WWStudioFlatiron.click();
		}
		
		
}
