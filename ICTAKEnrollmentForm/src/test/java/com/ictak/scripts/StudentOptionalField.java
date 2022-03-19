package com.ictak.scripts;

import java.io.IOException;


import org.testng.annotations.Test;


import com.ictak.pages.StudentOptionalFields;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class StudentOptionalField extends TestBase {
	StudentOptionalFields objLogin;
	
	
	@Test(priority=33)    
	public void verifyStudentOptional() throws IOException, InterruptedException  {    
		   
		objLogin = new StudentOptionalFields(driver);
		
		
		String qualification= ExcelUtility.getCellData(15, 11);
		String employmentstatus= ExcelUtility.getCellData(15, 12);
		String course= ExcelUtility.getCellData(15, 13);
		
		objLogin.clickCourses();
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		objLogin.clickEnroll();
	    objLogin.setQualification(qualification);
	    Thread.sleep(2000);
	    objLogin.setEmploymentstatus(employmentstatus);
	    Thread.sleep(2000);
	    objLogin.setCourse(course);
	
	
       }
	

}
