package TestCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sun.tools.sjavac.Log;

import PageObjects.LoginPage;
import PageObjects.LogoutPage;
import TestBase.BaseClass;
import Utilities.DataProviders;


public class TC_003LoginDDT extends BaseClass {
	@Test(dataProvider ="LoginData1",dataProviderClass = DataProviders.class,groups = "DataDriven")
	public void verify_LoginDDT(String email,String pwd,String expResult)
	{
		 Log.info("***** starting TC_003LoginDDT*****");
		 try 
		 {
		 LoginPage llp= new LoginPage(driver);
         Log.info("click on makeappointment button");
		 llp.makeAppointment();
		 Log.info("enter username");
		 llp.userNAME(po.getProperty("USERNAME"));
		 Log.info("enter password");
		 llp.passWORD(po.getProperty("PASSWORD"));
		 Log.info("click on login button");
		 llp.LOGIN1();
		 Log.info("accept alert popup");
		 llp.acceptAlert();
		 Log.info("login homepage is displayed");
		 boolean loginhomepage=llp.makeAppointment1();
		 Assert.assertTrue(loginhomepage);
		 if (expResult.equalsIgnoreCase("valid")) 
		 {  
			 if (loginhomepage==true) 
			 {
			 LogoutPage lpp= new LogoutPage(driver);
			 lpp.bars();
			 lpp.logout();
			 Assert.assertTrue(true);
			 }
			 else
			 {
			 Log.info("login is failed");
			 Log.debug("login is failed...");
	         Assert.assertTrue(false);
			 }
		 } 
		 else 
		 {
			 if (loginhomepage==true) 
			 {
			 Log.info("login is failed");
			 Log.debug("debug login logs...");
			 LogoutPage lpp= new LogoutPage(driver);
			 lpp.bars();
			 lpp.logout();
			 Assert.assertTrue(false);
			 }
			 else
			 {
	         Assert.assertTrue(true);
			 }
		  }
		 } 
		 catch (Exception e) 
		 {
			 Log.info("Test is failed");
			 Log.debug("debug Test logs...");
		     Assert.fail();
		 }
		 Log.info("***** ending TC_003LoginDDT*****");
	}
	}

