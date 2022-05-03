package com.tcs.scripts;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.tcs.constants.AutomationConstants;
import com.tcs.pages.Admin;
import com.tcs.pages.Agent;
import com.tcs.pages.Supplier;
import com.tcs.utilities.ExcelUtility;

public class TCSupplier  extends TestBase{
	
	
	Supplier objSupplier;
	
	@Test(priority=1)
    public void verifySbLink() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
    objSupplier.clickSbLink();
    Thread.sleep(2000);
    for(String winHandle :driver.getWindowHandles())
    {
    	driver.switchTo().window(winHandle);
    }
    Thread.sleep(2000); 
    String expectedURL =AutomationConstants.SBURL1;
    String actualURL =driver.getCurrentUrl();
    System.out.println(actualURL);
    Assert.assertEquals(expectedURL,actualURL);
    System.out.println("Supplier Back end Login Page Opened,Sb-Test1 Passed");
      Thread.sleep(2000);   
	}
	

	@Test(priority=2) //Invalid login with both fields blank
    public void verifySbInvalidLogin1() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
objSupplier= new Supplier(driver);	

objSupplier.clearsbEmail();
objSupplier.clearsbPassword();
Thread.sleep(2000);   
objSupplier.clicksbLogin();
Thread.sleep(4000);
objSupplier.BlankAlert2Displayed();

Thread.sleep(2000);

	}
	
	@Test(priority=3) //Verify invalid login with valid email and invalid password
    public void verifySbInvalidLogin2() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
    objSupplier= new Supplier(driver);
	
  String sbemail = ExcelUtility.getCellData(1,3);
    String sbpassword = ExcelUtility.getCellData(4,3);
       objSupplier.setsbEmail(sbemail);
       objSupplier.setSbPassword(sbpassword);
       objSupplier.clicksbLogin();
       Thread.sleep(2000);
       
       objSupplier.BlankAlert3Displayed();

       Thread.sleep(2000);    
	}	
	
	@Test(priority=4)//Verify invalid login with valid email and null password
	public void verifyASbInvalidLogin3() throws IOException, Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		    //Create Login Page object
		    objSupplier= new Supplier(driver);
			objSupplier.clearsbEmail();
		  String sbemail = ExcelUtility.getCellData(1,3);
		  objSupplier.setsbEmail(sbemail);
		  objSupplier.clearsbPassword();
		       objSupplier.clicksbLogin();
		       Thread.sleep(3000);
	
		       objSupplier.BlankAlert4Displayed();       
		       
		       Thread.sleep(2000);
		   	 
		       
		       
	}
	
	@Test(priority=5)//	Verify invalid login with invalid email and valid password
	
	 public void verifySbInvalidLogin4() throws IOException, Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		    //Create Login Page object
		    objSupplier= new Supplier(driver);
		    //login to application
		  
		    objSupplier.clearsbEmail();
		    String sbemail = ExcelUtility.getCellData(3,3);
		    objSupplier.clearsbPassword();
		   String sbpassword = ExcelUtility.getCellData(2,3);
		    objSupplier.setsbEmail(sbemail);
		  objSupplier.setSbPassword(sbpassword);
		  
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		  objSupplier.clicksbLogin();
		  Thread.sleep(2000);
		  objSupplier.BlankAlert5Displayed();       
	       
	       Thread.sleep(2000);
	
	
	
	}


	@Test(priority=6)//Verify invalid login with blank email and valid password
	
	 public void verifysbInvalidLogin5() throws IOException, Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		    //Create Login Page object
		    objSupplier= new Supplier(driver);
		    
		    objSupplier.clearsbEmail();
		    objSupplier.clearsbPassword();
		    String sbpassword = ExcelUtility.getCellData(2,3);
		    objSupplier.setSbPassword(sbpassword);
		    objSupplier.clicksbLogin();
		    Thread.sleep(2000);
		    objSupplier.BlankAlert6Displayed();       
		       
		       Thread.sleep(2000);
	
	}
	@Test(priority=7)//Verify invalid login with invalid email and invalid password
	public void verifysbInvalidLogin6() throws IOException, Exception {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		 objSupplier= new Supplier(driver);
		    //login to application
		  
		 objSupplier.clearsbEmail();
		    String sbemail = ExcelUtility.getCellData(3,2);
		    objSupplier.clearsbPassword();
		   String sbpassword = ExcelUtility.getCellData(4,2);
		   objSupplier.setsbEmail(sbemail);
		   objSupplier.setSbPassword(sbpassword);
		  
		  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

		   objSupplier.clicksbLogin();
		  Thread.sleep(2000);
		  objSupplier.BlankAlert7Displayed();       
	       
	       Thread.sleep(2000);
	}	
	
	
	@Test(priority=8)
    public void verifysbValidLogin() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
        //login to application
    objSupplier.clearsbEmail();
    String sbemail = ExcelUtility.getCellData(1,3);
    objSupplier.clearsbPassword();
   String sbpassword = ExcelUtility.getCellData(2,3);
   objSupplier.setsbEmail(sbemail);
   objSupplier.setSbPassword(sbpassword);
  
  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	

   objSupplier.clicksbLogin();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  Thread.sleep(5000);
  String actualTitle = driver.getTitle();
  String expectedTitle = AutomationConstants.SBTXT1;
  assertEquals(expectedTitle,actualTitle);
  System.out.println("LOGIN Success;Supplier Back- End Dashboard Opened,Admin-Test8 Passed");
    Thread.sleep(2000);
	
}
	@Test(priority=9)
    public void verifysbText() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
    Thread.sleep(2000);
    
    objSupplier.verifyText();
    Thread.sleep(2000);	
	}
	
	
	@Test(priority=10)
    public void verifysbRevenueBrkdown() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
    Thread.sleep(2000);
    
    objSupplier.RevenueBrkdownDisplayed();
    Thread.sleep(2000);
	}
	
	
	@Test(priority=11)
    public void verifysbBookingsLink() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
    Thread.sleep(2000);
    objSupplier.BookingsDisplayed();
    objSupplier.clicksbbookings();
    Thread.sleep(2000);
    String actualURL = driver.getCurrentUrl();
    String expectedURL = AutomationConstants.SBURL6;
    assertEquals(expectedURL,actualURL);
    System.out.println("Test-11 Passed;Supplier Back- End Bookings page Opened");
      Thread.sleep(2000);
    
	}
	
	@Test(priority=12)
    public void verifysbBookingsContents() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    //Create Login Page object
   
    objSupplier= new Supplier(driver);
    Thread.sleep(2000);
    
    //objSupplier.CheckBookingsPageContents();
    Thread.sleep(2000);
    objSupplier.ErrorDisplayed();
    driver.navigate().back();
    
    Thread.sleep(2000);
	}
	
	
	@Test(priority=13)
    public void verifySBToursDisplayed() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
   
    objSupplier= new Supplier(driver);
    objSupplier.TourDisplayed();
    Thread.sleep(500);
	}
	
	
    @Test(priority=14)
    public void verifySBToursClickable() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
   
    objSupplier= new Supplier(driver);
    
    objSupplier.clicksbTours1();
    Thread.sleep(500);
    objSupplier.clicksbTours2();
    Thread.sleep(500);
    objSupplier.clicksbManageTours();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);
    
    String expectedURL =AutomationConstants.SBURL3;
    String actualURL =driver.getCurrentUrl();
    Assert.assertEquals(expectedURL,actualURL);
    System.out.println("Supplier Back End Tours Page Opened,SB-Test 13 Passed");
      Thread.sleep(2000);
	
	Thread.sleep(2000);
	}
	
	@Test(priority=15)
    public void verifySBVisaDisplayed() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    objSupplier= new Supplier(driver);
    objSupplier.VisaDisplayed();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);
   	}
	
	
	@Test(priority=16)
    public void verifySBFlightsDisplayed() throws IOException, Exception {
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
    objSupplier= new Supplier(driver);
    objSupplier.flghtDisplayed();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Thread.sleep(2000);
   
	}
	
	
	
}