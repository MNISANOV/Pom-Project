package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	//Initialize webElements
	@FindBy(css="#body_ForgotPasswordButton")
	WebElement forgotPassLink;
	@FindBy(css="#body_Username")
	WebElement username;
	@FindBy(css="#body_Password")
	WebElement password;
	@FindBy(css="#body_SubmitButton")
	WebElement logBtn;
	@FindBy(css="#body_ErrorMessage")
	WebElement errorMsg;
	@FindBy(css="#ePlyHeader_FirstName")
	WebElement nameValidation;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//Actions
	public void forgotPasswordBtn() {
		click(forgotPassLink);
	}

	public void login(String text_user, String text_pass ) {
		fillText(username, text_user);
		fillText(password, text_pass);
		click(logBtn);
	}

	public String getErrorMsg() {
		return errorMsg.getText();
	}
	
	public String loginValidation() {
		return nameValidation.getText();
	}
}
