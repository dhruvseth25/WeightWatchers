package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WeightWatchers {
		public WebDriver ldriver;
		
		// Constructor
		public WeightWatchers(WebDriver rdriver)
		{
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		
		
		// Selecting Find A Studio Button
				@FindBy(xpath="//a[@id='ela-menu-visitor-desktop-supplementa_find-a-studio']//span[@class='menu-link__inner-wrapper'][contains(text(),'Find a Studio')]")
				@CacheLookup // is used to improve the performance
				WebElement FindAStudio;
		
		
		//========================================================================//	
		public String getWWTitle() {
			String wwtitle=ldriver.getTitle();
			System.out.println(wwtitle);
			return wwtitle;
			
		}
		
		public void clickOnFindAStudio() {
			FindAStudio.click();
			
		}
		
		
}
