package com.ictak.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ictak.testbase.TestBase;

public class AdminEditingandUpdatingCourse extends TestBase {
	WebDriver driver;
	@FindBy(xpath="//a[@href='/courses']")
	private WebElement course;
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/img")
	private WebElement scroll;
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/div/div/button[2]/a")
	private WebElement edit;
	@FindBy(xpath="//input[@type='number']")
	private WebElement price;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement update;
	@FindBy(xpath="//button[@type='reset']")
	private WebElement reset;
	@FindBy(xpath="//*[@id=\"courses\"]/div/div/div[148]/div[1]/div/div/button[3]")
	private WebElement delete;
	@FindBy(xpath="/html/body/app-root/app-header/section[2]/div/div[2]/ul[1]/li[7]/a")
	private WebElement logout;
	
	public  AdminEditingandUpdatingCourse(WebDriver driver) {
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
	 public void clickEdit(){
		  edit.click();  
		} 
	 
	 public void setPrice(String strPrice){
		    price.sendKeys(strPrice);
		 }
	 public void clearPrice(){
		  price.clear();  
		} 
	 
	 public void clickUpdate(){
		  update.click();   
		}
	 public void clickReset(){
		  reset.click();   
		}
	 public void clickDelete(){
		  delete.click();   
		}
	 public void clickLogout(){
		  logout.click();   
		}
	 

}
