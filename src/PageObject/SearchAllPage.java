package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchAllPage extends BasePage{

	@FindBy(css = "#RadFromDatePicker_dateInput")
	WebElement fromDate;
	@FindBy(css = "#RadToDatePicker_dateInput")
	WebElement toDate;
	@FindBy(css = "#Email")
	WebElement email;
	@FindBy(css = "#SearchButton>span")
	WebElement searchButton;
	@FindBy(css = "#MessageLabel")
	WebElement searchMsg;

	public SearchAllPage(WebDriver driver) {
		super(driver);
	}

	public void search (String fr_date, String to_date, String write_mail) throws InterruptedException {
		fillText(fromDate, fr_date);
		fillText(toDate, to_date);
		fillText(email, write_mail);
		Thread.sleep(2000);
		click(searchButton);
	}

	public String isSearchSucceed() {
		return searchMsg.getText();
	}

	public boolean isMsgDisplayed() {
		return searchMsg.isDisplayed();
	}
}
