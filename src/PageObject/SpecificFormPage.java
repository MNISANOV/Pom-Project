package PageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SpecificFormPage extends BasePage{

	@FindBy(css = "#EventNameEdit")
	WebElement eventName;
	@FindBy(css = "#PageTitle")
	WebElement pageTitle;
	@FindBy(css = "#EventDateTextBox")
	WebElement eventDate;
	@FindBy(css = "#SaveEventInfoButton2")
	WebElement saveEventInfoButton;
	@FindBy(css = ".fa.fa-cogs")
	List<WebElement> myForms;
	@FindBy(css = "#NameErrorMessage")
	WebElement errorSaveMsg;


	public SpecificFormPage(WebDriver driver) {
		super(driver);
	}

	public String pageTitle () {
		String title = driver.getTitle();
		return title;
	}

	public void fillFormInformation(String ev_name, String pg_title, String ev_date) throws InterruptedException {
		fillText(eventName, ev_name);
		fillText(pageTitle, pg_title);
		fillText(eventDate, ev_date);
		Thread.sleep(2000);
		click(saveEventInfoButton);
	}

	public void clickForm (int index) {
		myForms.get(index).click();
	}

	public String errMsgMethod() {
		String errMsg = errorSaveMsg.getText();
		return errMsg;
	}
	public boolean isExist() {
		boolean isDspl = errorSaveMsg.isDisplayed();
		return isDspl;
	}
}
