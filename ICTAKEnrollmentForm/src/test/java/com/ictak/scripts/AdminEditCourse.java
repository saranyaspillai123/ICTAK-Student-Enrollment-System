package com.ictak.scripts;
import java.io.IOException;
import org.testng.annotations.Test;
import com.ictak.pages.AdminEditingandUpdatingCourse;
import com.ictak.testbase.TestBase;
import com.ictak.utilities.ExcelUtility;

public class AdminEditCourse extends TestBase{ 
	AdminEditingandUpdatingCourse objLogin;

	@Test(priority=17)    
	public void verifyAdmincourseEdit() throws IOException, InterruptedException  {    
		
		objLogin = new AdminEditingandUpdatingCourse(driver);
		String price= ExcelUtility.getCellData(14, 4);
		objLogin.clickCourse();		
		objLogin.clickScroll();
		Thread.sleep(2000);
		objLogin.clickEdit();
		objLogin.clearPrice();
		objLogin.setPrice(price);
		objLogin.clickUpdate();
		Thread.sleep(2000);
		

}
	@Test(priority=18)    
	public void verifyAdmincourseReset() throws IOException, InterruptedException  {    
		 
		objLogin = new AdminEditingandUpdatingCourse(driver);
		objLogin.clickReset();
		driver.navigate().back();
		
		
		
	

}
	@Test(priority=19)    
	public void verifyAdmincourseDelete() throws IOException, InterruptedException  {    
		
		objLogin = new AdminEditingandUpdatingCourse(driver);
		objLogin.clickScroll();
		Thread.sleep(2000);
		objLogin.clickDelete();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		objLogin.clickLogout();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		}



}
