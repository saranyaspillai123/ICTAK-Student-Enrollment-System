package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictak.constants.Automationconstants;
import com.ictak.pages.AdminAddCourse;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class Adminaddcourse1 extends TestBase {
	AdminAddCourse objLogin;

	@Test(priority=15)    
	public void verifyAdminaddcoursebutton() throws IOException, InterruptedException  {    
		  
		objLogin = new AdminAddCourse (driver);
		objLogin.clickCourse();
		objLogin.clickAddCourse();;
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.add_course;
		Assert.assertEquals(actual, expected);
		
		
	

}
	@Test(priority=16)    
	public void verifyaddAdmincourseepage() throws IOException, InterruptedException  {    
		
		objLogin = new AdminAddCourse (driver);
		String nameofcourse = ExcelUtility.getCellData(13, 0);  
		String certification = ExcelUtility.getCellData(13, 1);
		String code= ExcelUtility.getCellData(13, 2);
		String details = ExcelUtility.getCellData(13, 3);  
		String price = ExcelUtility.getCellData(13, 4);
		String eligibility= ExcelUtility.getCellData(13, 5);
		String image= ExcelUtility.getCellData(13, 6);
		objLogin.setNameofcourse(nameofcourse);
		objLogin.setCertification(certification);
		objLogin.setCode(code);
		objLogin.setDetails(details);
		objLogin.setPrice(price);
		objLogin.setEligibility(eligibility);
		objLogin.setImage(image);
		objLogin.clickSubmit();
		Thread.sleep(3000);
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.COURSE;
		Assert.assertEquals(actual, expected);
		
	}
	

}
