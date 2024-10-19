package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointment extends BasePage {

	
	
	public MakeAppointment(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath = "//select[@id='combo_facility']")WebElement dropdown;
	@FindBy(xpath = "//input[@id='chk_hospotal_readmission']")WebElement readmission;
	@FindBy(xpath = "//span[@class='glyphicon glyphicon-calendar']")
    WebElement calendarPopup;

   @FindBy(xpath = "//th[@class='datepicker-switch']")
    WebElement monthYearHeader;

   @FindBy(xpath = "//div[@class='datepicker-days']//th[@class='next'][normalize-space()='»']")
    WebElement nextButton;

   @FindBy(xpath = "//div[@class='datepicker-days']//td[@class='day']")
   List<WebElement> allDays;
	@FindBy(xpath="//textarea[@id='txt_comment']")WebElement Comment;
	@FindBy(xpath="//button[@id='btn-book-appointment']")WebElement bookappointment;
	@FindBy(xpath = "//a[@class='btn btn-default']")WebElement gotohomepage;
	public void dropdown(int index)
	{
		 Select s= new Select(dropdown);
		 s.selectByIndex(index);
	}
	public void readmission()
	{
		readmission.click();
		
	}
	public void nextbutton()
	{
		nextButton.click();
	}
	public void comment(String comment)
	{
	Comment.sendKeys(comment);
	}
	public void bookappointment()
	{
		bookappointment.click();
	}
	
	    public void selectDate(String month, String year, String date) {
	        calendarPopup.click();

	        // Loop to navigate through the months
	        while (true) {
	            String monthYear = monthYearHeader.getText();
	            String[] arr = monthYear.split(" ");
	            String displayedMonth = arr[0];
	            String displayedYear = arr[1];

	            // Check if the desired month and year are displayed
	            if (displayedMonth.equalsIgnoreCase(month) && displayedYear.equals(year)) {
	                break;
	            } else {
	                nextButton.click(); // Click to go to the next month
	            }
	        }

	        // Click the specified date
	        for (WebElement day : allDays) {
	            if (day.getText().equals(date)) {
	                day.click();
	                break;
	            }
	        }
	    }
		
	}


