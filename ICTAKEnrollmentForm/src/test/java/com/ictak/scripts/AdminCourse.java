package com.ictak.scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.ictak.constants.Automationconstants;
import com.ictak.pages.AdminCoursePage;
import com.ictak.testbase.TestBase;


public class AdminCourse extends TestBase {
	AdminCoursePage objLogin;

	@Test(priority=13)    
	public void verifyAdmincourseepage() throws IOException, InterruptedException  {    
		
		objLogin = new AdminCoursePage(driver);
		objLogin.clickCourse();
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.COURSE;
		Assert.assertEquals(actual, expected);
		
		
	

}



	@Test(priority=14)    
	public void verifyAdminSpecificcourse() throws IOException, InterruptedException  {    
		
		objLogin = new AdminCoursePage(driver);
		objLogin.clickScroll();
		objLogin.clickKnowMore();
		String actual=driver.getCurrentUrl();
		String expected=Automationconstants.Know_More;
		Assert.assertEquals(actual, expected);
		

}

}
