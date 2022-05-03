package com.tcs.pages;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Supplier {
	WebDriver driver;
	@FindBy(xpath="//a[contains(.,'phptravels.net/supplier')]")
	private WebElement supplierlink;
	
	 @FindBy(xpath="//input[@name='email'and@type='text']")
	private WebElement sbemail;
	 @FindBy(xpath="//input[@name='password'and@type='password']")
	private WebElement sbpassword;  
	@FindBy(xpath="//span[contains(.,'Login')and@class='ladda-label']")
	private WebElement sblogin;
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement alert2;
	
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')and@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement alert3;
	
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']/child::p")
	private WebElement alert4;
	
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')and@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement alert5;
	
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']/child::p")
	private WebElement alert6;
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')and@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement alert7;
	//DashBoard
	@FindBy(xpath="//div[contains(.,'Sales overview & summary')and@class='text-muted']")
	private WebElement textsales;
	//tours,visa,flights
	@FindBy(xpath="//a[contains(.,'Website')]")
	private WebElement sbwebsite;
	
	@FindBy(xpath="//div[@class='drawer-menu']//div//child::a[@aria-controls='toursmodule']")
	private WebElement sbtours1;
	@FindBy(xpath="//a[contains(.,'Tours')and@data-bs-target='#Tours']")
	private WebElement sbtours2;
	@FindBy(xpath="//a[contains(.,'Manage Tours')]")
	private WebElement sbmanagetours;
	
	@FindBy(xpath="//a[contains(.,'visa')]")
	private WebElement sbvisa;
	@FindBy(xpath="//a[contains(.,'flights')]")
	private WebElement sbflights;
	
	//Bookings
	
	@FindBy(xpath="//a[@class='loadeffect nav-link collapsed mdc-ripple-upgraded']")
	private WebElement sbBookings;
	@FindBy(xpath="//div[@id='container']/child::h1")
	private WebElement sbpageerror;
	
	//Revenue
	@FindBy(xpath="//canvas[@id='dashboardBarChart']")
	private WebElement sbrevenue;
	public Supplier(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}	
	
	public void clickSbLink() {
	    supplierlink.click();
	    }
	
	public void setsbEmail(String strEmail){
    	sbemail.sendKeys(strEmail);     
    }

     public void clearsbEmail() {
    	sbemail.clear();
     }
   
    
  //Set password in password textbox
     public void setSbPassword(String strPassword){
      sbpassword.sendKeys(strPassword);
    }
    
     public void clearsbPassword() {
    	sbpassword.clear();
    }
       
  //Click on login button 
     public void clicksbLogin(){ 
    	      sblogin.click();   
     }

	public void BlankAlert2Displayed() {
		 if(alert2.isDisplayed()) { 
  	       System.out.println("Login failed,Supplier-Test2 Passed. Return: " +alert2.isDisplayed()); 
  	    } 
  	   else { 
  	      System.out.println("Sb Test-2 failed. Return: " +alert2.isDisplayed()); 
  	    }
		
	}


	public void BlankAlert3Displayed() {
		if(alert3.isDisplayed()) { 
	  	       System.out.println("Login failed,Supplier-Test3 Passed. Return: " +alert3.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-3 failed. Return: " +alert3.isDisplayed()); 
	  	    }
			
		
	}

	public void BlankAlert4Displayed() {
		if(alert4.isDisplayed()) { 
	  	       System.out.println("Login failed,Supplier-Test4 Passed. Return: " +alert4.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-4 failed. Return: " +alert4.isDisplayed()); 
	  	    }
			
		
	}
	public void BlankAlert5Displayed() {
		if(alert5.isDisplayed()) { 
	  	       System.out.println("Login failed,Supplier-Test5 Passed. Return: " +alert5.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-5 failed. Return: " +alert5.isDisplayed()); 
	  	    }
				}
	public void BlankAlert6Displayed() {
		if(alert6.isDisplayed()) { 
	  	       System.out.println("Login failed,Supplier-Test6 Passed. Return: " +alert6.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-6 failed. Return: " +alert6.isDisplayed()); 
	  	    }
				}    
	public void BlankAlert7Displayed() {
		if(alert7.isDisplayed()) { 
	  	       System.out.println("Login failed,Supplier-Test7 Passed. Return: " +alert7.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-7 failed. Return: " +alert7.isDisplayed()); 
	  	    }
	}
//Dashboard
		public  void verifyText(){ 	
			 String t = textsales.getText();
			 List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'Sales overview & summary')]"));
		      // verify list size
		      if ( l.size() > 0){
		         System.out.println("Text: " + t + " is present.Sb-Test 9 Passed ");
		      } else {
		         System.out.println("Text: " + t + " is not present. ");
		      }
		   }
	//bookings	
		public void BookingsDisplayed() {
			if(sbBookings.isDisplayed()) { 
		  	       System.out.println("Sb Test 11 passed;Bookings module is displayed. Return: " +sbBookings.isDisplayed()); 
		  	    } 
		  	   else { 
		  	      System.out.println("Sb Test-11 failed;Bookings module is not displayed. Return: " +sbBookings.isDisplayed()); 
		  	    }

		}
		public void clicksbbookings(){ 
		      sbBookings.click();   
	}
		public void ErrorDisplayed() {
			if(sbpageerror.isDisplayed()) { 
		  	       System.out.println("Could not display the contents  of bookings page, Test 12 failed. Return: " +sbpageerror.isDisplayed()); 
		  	    } 
		  	   else { 
		  	      System.out.println("Sb Test-12 passed. Return: " +sbpageerror.isDisplayed()); 
		  	    }	
		}
		public void CheckBookingsPageContents(){ 
		 String l = driver.getPageSource();
	      System.out.println("Page source: "+ l);
	      
	      
		}
//Website
	
	public void clicksbWebsite(){ 
	      sbwebsite.click();   
}
	
	public void TourDisplayed() {
		if(sbtours1.isDisplayed()) { 
	  	       System.out.println("Sb Test 13 passed;Tours module is displayed. Return: " +sbtours1.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-13 failed;Tours module is not displayed. Return: " +sbtours1.isDisplayed()); 
	  	    }

	}	
	
	public void clicksbTours1(){ 
	      sbtours1.click();   
}
	public void clicksbTours2(){ 
	      sbtours2.click();   
}
	public void clicksbManageTours(){ 
	      sbmanagetours.click();   
}
	public void VisaDisplayed() {
		if(sbvisa.isDisplayed()) { 
	  	       System.out.println("Sb Test 15 passed;Visa module is displayed. Return: " +sbvisa.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-15 failed;Visa module is not displayed. Return: " +sbvisa.isDisplayed()); 
	  	    }

	}
	public void clicksbVisa(){ 
	      sbvisa.click();   
}
	public void flghtDisplayed() {
		if(sbflights.isDisplayed()) { 
	  	       System.out.println("Sb Test 16 passed;flights module is displayed. Return: " +sbflights.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-16 failed;flights module is not displayed. Return: " +sbflights.isDisplayed()); 
	  	    }

	}
	public void clicksbFlights(){ 
	      sbflights.click();   
}
	
	public void RevenueBrkdownDisplayed() {
		if(sbrevenue.isDisplayed()) { 
	  	       System.out.println("Sb Test 10 passed;Revenue Breakdown is displayed. Return: " +sbrevenue.isDisplayed()); 
	  	    } 
	  	   else { 
	  	      System.out.println("Sb Test-10 failed. Return: " +sbrevenue.isDisplayed()); 
	  	    }

	}	
	








/*public void testRevenue() {
   // var canvas = driver.findElement(By.id("burger_canvas"));

    //Calculate position canvas button
	Dimension sbrevenue_dimensions = sbrevenue.getSize();
float canvas_center_x = sbrevenue_dimensions.getWidth() / 2;
    float canvas_center_y = sbrevenue_dimensions.getHeight() / 2;
    float button_x = (canvas_center_x / 3) * 2;
    float button_y = (canvas_center_y / 3) * 2;

    //Click button on the canvas
    new Actions(driver).moveToElement(sbrevenue).click().perform();

    //Verify canvas now displays burger
    Eyes eyes = new Eyes();
    eyes.open(driver, "The Kitchen", "burger on canvas");
    eyes.checkElement(sbrevenue);
 */
}
