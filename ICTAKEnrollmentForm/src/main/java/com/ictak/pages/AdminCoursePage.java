package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ictak.testbase.TestBase;

public class AdminCoursePage extends TestBase {
	
	WebDriver driver;
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement course;
	@FindBy(xpath="//div[@class='team-hover']")
	private WebElement scroll;
	@FindBy(xpath="//a[contains(text(),'Know More')]")
	private WebElement knowmore;
	
	
public AdminCoursePage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	 public void clickCourse(){
		 course.click();   
		}
	 
	 public void clickScroll(){
		 Actions action=new Actions(driver);
		 action.moveToElement(scroll).perform();
		    
		}  
	 public void clickKnowMore(){
		 knowmore.click();  
		} 
}
