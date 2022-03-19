package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.StudentPasswordvalidation;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class Studentpassword extends TestBase {
StudentPasswordvalidation objLogin;
	
	
	@Test(priority=25)    
	public void verifyStudentRegistrationPasswordPositive() throws IOException, InterruptedException  {    
		   
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 0);
		objLogin.setPassword(password);
			
	}
	@Test(priority=26)    
	public void verifyStudentRegistrationPasswordNegative1() throws IOException, InterruptedException  {    
		
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 1);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
      
		
		
	}
	@Test(priority=27)    
	public void verifyStudentRegistrationPasswordNegative2() throws IOException, InterruptedException  {    
		  
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 2);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
      
		
		
	}
	@Test(priority=28)    
	public void verifyStudentRegistrationPasswordNegative3() throws IOException, InterruptedException  {    
		  
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 3);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		
		
       
		
		
	}
	@Test(priority=29)    
	public void verifyStudentRegistrationPasswordNegative4() throws IOException, InterruptedException  {    
		 
		objLogin = new  StudentPasswordvalidation(driver);
		String password = ExcelUtility.getCellData(7, 4);
		objLogin.clearPassword();
		objLogin.setPassword(password);
		String expectedMessage =Automationconstants.PASSWORD_ERROR_MESSAGE;   
		String actualMessage =objLogin.getErrorMessage();
		Assert.assertEquals(expectedMessage,actualMessage);	
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		
	}

}
