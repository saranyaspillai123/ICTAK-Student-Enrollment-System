package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.StudentPhonenumbervalidation;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class Studentphonenumber extends TestBase {
	StudentPhonenumbervalidation objLogin;
	
	
	@Test(priority=30)    
	public void verifyStudentRegistrationPhonePositive() throws IOException, InterruptedException  {    
		  
		objLogin = new  StudentPhonenumbervalidation(driver);
		String phone = ExcelUtility.getCellData(8, 0);
		objLogin.clickCourses();
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		objLogin.clickEnroll();
		objLogin.setPhone(phone);
	}
	@Test(priority=31)    
	public void verifyStudentRegistrationPhoneNegative1() throws IOException, InterruptedException  {    
		 
		objLogin = new  StudentPhonenumbervalidation(driver);
		String phone = ExcelUtility.getCellData(8, 1);
		objLogin.clearPhone();
		objLogin.setPhone(phone);
		String expectedMessage =Automationconstants.PHONE_ERROR_MESSAGE;  
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
	}
	@Test(priority=32)    
	public void verifyStudentRegistrationPhoneNegative2() throws IOException, InterruptedException  {    
		
		objLogin = new  StudentPhonenumbervalidation(driver);
		String phone = ExcelUtility.getCellData(8, 2);
		objLogin.clearPhone();
		objLogin.setPhone(phone);
		String expectedMessage =Automationconstants.PHONE_ERROR_MESSAGE;  
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		objLogin.clearPhone();
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
	}

}
