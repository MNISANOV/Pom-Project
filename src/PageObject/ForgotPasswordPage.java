package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{

	//Initialize + Identify webElements

	@FindBy(css = "#body_Username")
	WebElement userName;
	@FindBy(css = "#body_SubmitButton")
	WebElement submit;
	@FindBy(css = "#body_Message")
	WebElement msg;

	public ForgotPasswordPage(WebDriver driver) {
		super(driver);	
	}

	//Actions

	public void forgotPassDetails(String user) {
		fillText(userName, user);
		click(submit);
	}

	public String getMsg() {
		return msg.getText();
	}

	public boolean isMsgAppeared() {
		return msg.isDisplayed();
	}
}
