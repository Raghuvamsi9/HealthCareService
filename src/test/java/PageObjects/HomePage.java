package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	
	}
  @FindBy(xpath = "//h2[normalize-space()='Appointment Confirmation']")WebElement confirmation;
  @FindBy(xpath = "//a[@class='btn btn-default']")WebElement gotohomepage;
  public boolean confirmation()
  {
	  try {
		  return(confirmation.isDisplayed());//true
	} catch (Exception e) {
		return false;
	}
	
  }
  public void gotohomepage()
  {
	  gotohomepage.click();
  }
		 
}
