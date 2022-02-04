package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.ViewMyFormsPage;

public class ViewMyFormsTest extends BaseTest{


	@Test
	public void dropDownFail() throws InterruptedException {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("shavit1986@gmail.com", "shavitdemo123");
		Thread.sleep(2000);

		ViewMyFormsPage viewMy = new ViewMyFormsPage(driver);
		viewMy.dropDownSelection("Show all forms");
		Thread.sleep(3000);
		String expected = "Forms: 2";
		String actual = "Forms: " + Integer.toString(viewMy.numForms());
		assertEquals(actual, expected);
	}
}
