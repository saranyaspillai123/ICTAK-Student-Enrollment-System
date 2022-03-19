package com.ictak.scripts;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.Adminloginhomepage;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class Adminhome extends TestBase {
	

	
		Adminloginhomepage objLogin;

		@Test(priority=10)    
		public void verifyAdminhomepage() throws IOException, InterruptedException  {    
			
			objLogin = new Adminloginhomepage(driver);
			
			String email = ExcelUtility.getCellData(6, 0);  
			String password = ExcelUtility.getCellData(6, 1);
			String role= ExcelUtility.getCellData(6, 2);
			objLogin.clickLogin();
			objLogin.setEmail(email);
			objLogin.setPassword(password);
			objLogin.setRole(role);
			objLogin.clickSignIn();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			objLogin.clickHome();
			String actual=driver.getCurrentUrl();
			String expected=Automationconstants.HOME;
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
			
		

	}
		@Test(priority=11)    
		public void verifyAdminhomepageshowmore() throws IOException, InterruptedException  {    
			 
			objLogin = new Adminloginhomepage(driver);
			objLogin.clickShow();
				

	}
		@Test(priority=12)    
		public void verifyAdminhomepagecourse() throws IOException, InterruptedException  {    
		
			objLogin = new Adminloginhomepage(driver);
			objLogin.clickScroll();
			objLogin.clicknowMore();
			String actual=driver.getCurrentUrl();
			String expected=Automationconstants.Know_More;
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);

            
				

	}

}
