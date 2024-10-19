package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.LogoutPage;
import PageObjects.MakeAppointment;
import TestBase.BaseClass;

public class TC_002MakeAppoinment extends BaseClass {
	@Test(groups = {"sanity","master","regression"})
	public void makeAppointment()
	{  
		Log.info("***** starting TC_002MakeAppoinment*****");
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
		MakeAppointment mp=new MakeAppointment(driver);
		Log.info("select drop drown");
		mp.dropdown(0);
		Log.info("click on readmission");
		mp.readmission();
		Log.info("select mouth,year and date in calender popup");
		mp.selectDate("December", "2024", "8");
		Log.info("enter comment");
		mp.comment("Due to fever");
		Log.info("click on bookappointment button");
		mp.bookappointment();
		HomePage hpp= new HomePage(driver);
	    Log.info("confirmation text is displayed or not");
		boolean value=hpp.confirmation();
		LogoutPage lpp= new LogoutPage(driver);
		Log.info("click on bars");
		lpp.bars();	
		Log.info("click on logout button");
		lpp.logout();
		Assert.assertTrue(value);
	    } 
	    catch (Exception e) {
	    Log.info("test fails");
	    Log.debug("debug Test logs...");
	    Assert.fail();
		}
		Log.info("***** ending TC_002MakeAppoinment*****");
	
}
}