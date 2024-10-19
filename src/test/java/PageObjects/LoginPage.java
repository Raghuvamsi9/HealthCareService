package PageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
    @FindBy(xpath = "//a[text()='Make Appointment']")WebElement makeappointment;
    @FindBy(xpath = "//input[@id='txt-username']")WebElement username;
    @FindBy(xpath = "//input[@id='txt-password']")WebElement password;
    @FindBy(xpath = "//button[text()='Login']")WebElement login1;
    @FindBy(xpath = "//h2[normalize-space()='Make Appointment']")WebElement makeappointment1;
   public void makeAppointment()
   {
	   makeappointment.click();
   }
   public void userNAME(String uname)
   {
	   username.sendKeys(uname);
   }
   public void passWORD(String pwd)
   {
	   password.sendKeys(pwd);
   }
   public void LOGIN1()
   {
	   login1.click();
   }
   public boolean makeAppointment1()
   {   try {
	   return (makeappointment1.isDisplayed());
} catch (Exception e) {
}
	   return false;
   } 
  
public void acceptAlert() {
	try {
        Alert alert = driver.switchTo().alert();
        alert.accept(); 
    } catch (Exception e) {
        System.out.println("No alert to accept: " + e.getMessage());
    }
	
}
}
