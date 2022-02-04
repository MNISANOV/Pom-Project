package tests;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import PageObject.ForgotPasswordPage;
import PageObject.LoginPage;
public class ForgotPasswordTest extends BaseTest{

	@Test(description = "Checks if it's posible to restore forgotten details - message shall be appeared")
	public void isRestoreAvailable() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.forgotPasswordBtn();
		ForgotPasswordPage forgotPassword = new ForgotPasswordPage(driver);
		forgotPassword.forgotPassDetails("marina@gmail.com");
		boolean expected = true;
		boolean actual = forgotPassword.isMsgAppeared();
		assertEquals(actual, expected);
	}

	@Test(description = "Checks if it's posible to restore forgotten details - message shall be appeared")
	public void msgText() {
		driver.navigate().back();
		ForgotPasswordPage forgotPassword = new ForgotPasswordPage(driver);
		forgotPassword.forgotPassDetails("marina@gmail.com");
		String expected = "instructions on how to reset your password have "
				+ "been sent to the email address registered with the username provided.";
		String actual = forgotPassword.getMsg();
		assertEquals(actual, expected);
	}
}
