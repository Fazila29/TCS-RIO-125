package com.tcs.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	
WebDriver driver;
	
	@FindBy(xpath="//a[contains(.,'admin')]")
	private WebElement adminlink;
	
	 @FindBy(xpath="//input[@name='email'and@type='text']")
	private WebElement ademail;
	 @FindBy(xpath="//input[@name='password'and@type='password']")
	private WebElement adpassword;  
	@FindBy(xpath="//span[contains(.,'Login')and@class='ladda-label']")
	private WebElement adlogin;
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')and@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement adinvalidalert3;
	
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']/child::p")
	private WebElement adinvalidalert4;
	
	
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')]")
	private WebElement adinvalidalert5;
	
	@FindBy(xpath="//p[contains(.,'The Email field is required.')]")
	private WebElement adinvalidalert6;
	@FindBy(xpath="//div[contains(.,'Invalid Login Credentials')and@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement adinvalidalert7;
	
	@FindBy(xpath="//a[contains(.,'Website')and@class='nav-link']")
	private WebElement adwebsite;
	@FindBy(xpath="//a[@href='https://www.phptravels.net/api/admin/bookings'and@class='nav-link loadeffect']")
	private WebElement adbookings;

	@FindBy(xpath="//select[@class='form-select status unpaid']")
	private WebElement adunpaid;

	@FindBy(xpath="//select[@class='form-select status unpaid']/child::option[@class='Paid']")
	private WebElement adpaid;
	@FindBy(xpath="//select[@class='form-select status paid']//parent::td//../following-sibling::td[2]//child::a")
	private WebElement adinvoice;
	@FindBy(xpath="//h3[@class='title'and contains(.,'Booking Invoice ')]")
	private WebElement invoiceassert;
	
	@FindBy(xpath="//select[@class='form-select status cancelled']//parent::td//../following-sibling::td[4]//child::button")
	private WebElement addelete;
	
	
	@FindBy(xpath="//div[@class='alert alert-danger loading wow fadeIn animated animated']")
	private WebElement bothblankalert;
	
	@FindBy(xpath="//div[contains(.,'Confrimed Bookings')]/preceding-sibling::div[@class='display-5']")
	private WebElement confirmednumber;
	
	@FindBy(xpath="//select[@class='form-select status pending']")
	private WebElement pending;
	
	@FindBy(xpath="//select[@class='form-select status pending']/child::option[@class='Confirmed']")
	private WebElement confirmed;
	@FindBy(xpath="//select[@class='form-select status pending']/child::option[@class='Cancelled']")
	private WebElement cancelled;
	
	
	public Admin(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}	
	
	public void clickAdminLink() {
	    adminlink.click();
	    }
	
	public void setadEmail(String strEmail){
    	ademail.sendKeys(strEmail);     
    }

     public void clearadEmail() {
    	ademail.clear();
     }
   
    
  //Set password in password textbox
     public void setadPassword(String strPassword){
       adpassword.sendKeys(strPassword);
    }
    
     public void clearadPassword() {
    	adpassword.clear();
    }
       
  //Click on login button 
     public void clickadLogin(){ 
    	      adlogin.click();   
     }
     
     public void clickadWebsite(){ 
	      adwebsite.click();   
}   
     
    
	
     public void clickadBooking(){ 
	      adbookings.click();   
}
	
     public void ViewadInvoice() throws InterruptedException{ 
    	 
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", adinvoice);
    	 Thread.sleep(500);    
}	
public void ViewadPending() throws InterruptedException{ 
    	 
    	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",pending);
    
    	 Thread.sleep(500);    
}	
public void ViewadUnpaid() throws InterruptedException{ 
	 
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",adunpaid);

	 Thread.sleep(500);    
}	
public void clickadUnpaid(){ 
    adunpaid.click();   
  
}
public void clickadPaid(){ 
    adpaid.click();   
  
}
     public void clickadInvoice(){ 
	      adinvoice.click();   
	    
}
     
     public void AssertInvoice(){ 
    	 if(invoiceassert.isDisplayed()) { 
  	       System.out.println("Admin test-11a passed.Displaying the invoice. Return: " +invoiceassert.isDisplayed()); 
  	    } 
  	   else { 
  	      System.out.println("Admin Test 11a failed. Return: " +invoiceassert.isDisplayed()); 
  	    } 
    	 
     
     }
     public void clickaCancelled(){ 
	      cancelled.click();   
}
     
     public void clickadDelete(){ 
	      addelete.click();   
}
     
     public void acceptAlert(){ 
    	 driver.switchTo().alert().accept();   
}    
     
     public void BlankAlertDisplayed(){ 
    	 if(bothblankalert.isDisplayed()) { 
    	       System.out.println("Login failed,Admin-Test2 Passed. Return: " +bothblankalert.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-2 failed. Return: " +bothblankalert.isDisplayed()); 
    	    } 
}  
     
     public void BlankAlert3Displayed(){ 
    	 if(adinvalidalert3.isDisplayed()) { 
    		 System.out.println(adinvalidalert3.getText());
    	       System.out.println("Login failed,Admin-Test3 Passed. Return: " +adinvalidalert3.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-3 failed. Return: " +adinvalidalert3.isDisplayed()); 
    	    } 
}     
     
     public void BlankAlert4Displayed(){ 
    	 if(adinvalidalert4.isDisplayed()) { 
    		 System.out.println(adinvalidalert4.getText());
    	       System.out.println("Login failed,Admin-Test4 Passed. Return: " +adinvalidalert4.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-4 failed. Return: " +adinvalidalert4.isDisplayed()); 
    	    } 
}        
   
     public void BlankAlert5Displayed(){ 
    	 if(adinvalidalert5.isDisplayed()) { 
    		 System.out.println(adinvalidalert5.getText());
    	       System.out.println("Login failed,Admin-Test5 Passed. Return: " +adinvalidalert5.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-5 failed. Return: " +adinvalidalert5.isDisplayed()); 
    	    } 
}           
     
     public void BlankAlert6Displayed(){ 
    	 if(adinvalidalert6.isDisplayed()) { 
    		 System.out.println(adinvalidalert6.getText());
    	       System.out.println("Login failed,Admin-Test6 Passed. Return: " +adinvalidalert6.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-6 failed. Return: " +adinvalidalert6.isDisplayed()); 
    	    } 
}           
     

     public void BlankAlert7Displayed(){ 
    	 if(adinvalidalert7.isDisplayed()) { 
    		 System.out.println(adinvalidalert7.getText());
    	       System.out.println("Login failed,Admin-Test7 Passed. Return: " +adinvalidalert7.isDisplayed()); 
    	    } 
    	   else { 
    	      System.out.println("Admin Test-7 failed. Return: " +adinvalidalert7.isDisplayed()); 
    	    } 
}         
     public void GetConfNumberInitial(){ 
    	 int icount=Integer.parseInt(confirmednumber.getText());
    int	 i=icount;
    	 System.out.println("The initial number of confirmed booking --- "+icount);
    	  
}    
     public void clickadPending(){ 
	      pending.click();   
} 
     
     public void clickConfirmed(){ 
	      confirmed.click();   
} 	

     public void GetConfNumberFinal(){ 
    	 int fcount=Integer.parseInt(confirmednumber.getText());
    	 int f=fcount;
    	 System.out.println("The Final number of confirmed booking --- "+fcount);
    	  
}  
    
}
