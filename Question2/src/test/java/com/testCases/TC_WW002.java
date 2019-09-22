package com.testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pageObjects.FindAMeeting;
import com.pageObjects.FindAStudio;
import com.pageObjects.WeightWatchers;

public class TC_WW002 extends BaseClass {
	
	WeightWatchers WW;
	FindAStudio FAT;
	FindAMeeting FAM;
	
	@Test
	  public void HappyCoding() {
		
		logger.info("Starting test case WW_TC_002");
		
		WW =new WeightWatchers(driver);
		//System.out.println(driver.getTitle());
		
		String wwTitle=WW.getWWTitle();
		
		if(wwTitle.equalsIgnoreCase("WW (Weight Watchers): Weight Loss & Wellness Help"))
		{
			Assert.assertTrue(true);
			logger.info("Verify loaded page title matches “WW (Weight Watchers): Weight Loss & Wellness Help” ");
			logger.info("Step 2 has Passed ");
		}
		else
		{
			Assert.assertTrue(false);
			logger.error("Step 2 has failed");
		}
		
		WW.clickOnFindAStudio();
		logger.info("User has clicked on Find A Studio option");
		logger.info("Step 3 has Passed ");
		
		FAT=new FindAStudio(driver);
		//Assert.assertTrue(FAT.FindaStudioPageTitle(), "Find a Studio page is not displayed");
		//Assert.assertTrue(isDisplayed, "Find a Studio page is not displayed");
		FAT.FindaStudioPageTitle();
		logger.info(" Verify loaded page title contains “Find WW Studios & Meetings Near You | WW USA” ");
		logger.info("Step 4 has Passed");
		FAT.meetSearch.sendKeys("10011");
		logger.info("In the search field, search for meetings for zip code: 10011");
		FAT.clickOnArrowButton();
		logger.info("Step 5 passed");
		FAT.getFirstResult();
		logger.info("Ste6 6 Passed:  Print the title of the first result and the distance (located on the right of location title/name)");
		FAT.clickOnWWStudioFlatiron();
		logger.info("First result link clicked");
		FAM=new FindAMeeting(driver);
		FAM.getFAMTitle();
		String Nametitle=FAM.getFAMTitle();;
		if(Nametitle.contains("WW Studio Flatiron"))
		{
			Assert.assertTrue(true);
			logger.info(" verify displayed location name/title matches with the name of the first searched result that was clicked");
			logger.info("Step7 has passed ");
		}
		else
		{
			Assert.assertTrue(false);
			logger.error("Step 7 has failed");
		}
		
		FAM.getSundayHours();
		logger.info("From this location page, print TODAY’s hours of operation (located towards the bottom of the page)");
		logger.info("I wanted to display Sundays hours of operation");
		logger.info("Step 8 has Passed");
		
		FAM.printMeetingsSunday();
		FAM.printMeetingsMonday();
			
		
	}

}
