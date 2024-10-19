package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {

	public LogoutPage(WebDriver driver) {
		super(driver);
	
	}
   @FindBy(xpath = "//i[@class='fa fa-bars']")WebElement bars;
   @FindBy(xpath = "//a[normalize-space()='History']")WebElement history;
   @FindBy(xpath = "//a[normalize-space()='Profile']")WebElement profile;
   @FindBy(xpath = "//a[@href='authenticate.php?logout']")WebElement logout;
   @FindBy(xpath = "//h1[normalize-space()='CURA Healthcare Service']")WebElement healthcareservice;
   public void bars()
   {
	   bars.click();
   }
   public void history()
   {
	   history.click();
   }
   public void profile()
   {
	   profile.click();
   }
   public void logout()
   {
	   logout.click();
   }
   public boolean healthcareservice()
   {
	   try {
		return(healthcareservice.isDisplayed());
	} catch (Exception e) {
		return false;
	}
   }
}
