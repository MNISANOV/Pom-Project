package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.LoginPage;

public class LoginTest extends BaseTest{

	@Test(dataProvider="getData" , priority=1, description="Test incorect login information")
	public void loginFailed(String userName, String password) {
		//login failed
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(userName, password);

		//should test getting the right message
		String expected = "Sorry, either your username or password was incorrect.";
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(actual, expected);
	}

	
	@Test(priority=2, description="Test correct login information")
	public void loginSucceed() {
		driver.get("https://www.eply.com/login/index.aspx");
		//login succeed
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("shavit1986@gmail.com", "shavitdemo123");
		String expected = "Hello, Shavit";
		String actual = loginPage.loginValidation();
		Assert.assertEquals(actual, expected);
	}
	
	
	@DataProvider
	public Object[][] getData(){
		Object[][] myDate = {
				{"Marina.p", "123"},
				{"Marina.n", "123"},
				{"Shavit.j", "123"},
		};
		return myDate;
	}
}
