package com.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindAMeeting {

	
public WebDriver ldriver;
	
	// Constructor
	public FindAMeeting(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath =("//span[contains(text(),'WW Studio Flatiron')]"))
	@CacheLookup
	public WebElement locationName;
	
	@FindBy(className =("schedule-detailed-day"))
	@CacheLookup
	public WebElement SunHours;
	
	@FindBy(xpath=("{'schedule-detailed-day__empty': !day.meetings.length}"))
	@CacheLookup
	public WebElement SundayMeetings;
	
	
	
	
	
	
	//========================================================================//	
			public String getFAMTitle() {
				String FAMtitle=locationName.getText();
				System.out.println(FAMtitle);
				return FAMtitle;
			}
	
			public String getSundayHours() {
				String SundayHours=SunHours.getText();
				System.out.println(SundayHours);
				return SundayHours;
			}
			
			/*9. Create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week
			e.g. printMeetings("Sun")
			Output should be:
			Person A  3
			Person B  1*/
				
				public void printMeetingsSunday() {
					WebElement table1 = ldriver.findElement(By.className("schedule-detailed-day-meetings"));
					List<WebElement> LeaderName = table1.findElements(By.className("schedule-detailed-day-meetings-item-leader"));
					List<WebElement> Time = table1.findElements(By.className("schedule-detailed-day-meetings-item-time"));
				    System.out.println("Number of meetings: " +LeaderName.size());
				    System.out.println("Time of Meeting: "+Time.size());
				    

				    for (int i=0; i<LeaderName.size() && i<Time.size();i++){
				      System.out.println("Leader is:" + LeaderName.get(i).getText() +" Time is: " +Time.get(i).getText());
				    	}
				}
				
				    public void printMeetingsMonday() {
						WebElement table2 = ldriver.findElement(By.xpath("//body[@class='html not-front not-logged-in no-sidebars page-find-a-meeting geo-awareness-banner-enabled i18n-en page-has-ads sticky-nav js-geoAwareness-once-processed ngmf-route--location']/div[@id='main-wrapper']/div[@id='main']/div[@id='content']/div[@class='region region-content']/div[@class='meeting-finder']/ui-view/ui-view/div[@class='meeting-detail']/div[@class='meeting-detail-bottom-container container-fluid']/div[@class='row no-gutters']/div[@class='meeting-detail-bottom']/div[@class='meeting-detail-bottom-top']/div[@class='meeting-schedule meeting-detail-bottom-section']/div[@class='meeting-schedule__schedule']/schedule-detailed/div[@class='schedule-detailed']/div[2]"));
						List<WebElement> LeaderName = table2.findElements(By.className("schedule-detailed-day-meetings-item-leader"));
						List<WebElement> Time = table2.findElements(By.className("schedule-detailed-day-meetings-item-time"));
					    System.out.println("Number of meetings: " +LeaderName.size());
					    System.out.println("Time of Meeting: "+Time.size());
					    

					    for (int i=0; i<LeaderName.size() && i<Time.size();i++){
					      System.out.println("Leader is:" + LeaderName.get(i).getText() +" Time is: " +Time.get(i).getText());
					    	}
				    }
				}
				
				
				
			
			
