package tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import PageObject.LoginPage;
import PageObject.SpecificFormPage;
import PageObject.ViewMyFormsPage;

public class SpecificFormPageTest extends BaseTest{

	@Test(description = "This test checks page's title")
	public void currentPage() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("shavit1986@gmail.com", "shavitdemo123");
		Thread.sleep(5000);
		ViewMyFormsPage viewMy = new ViewMyFormsPage(driver);
		viewMy.dropDownSelection("Show all forms");
		Thread.sleep(3000);
		SpecificFormPage formPage = new SpecificFormPage(driver);
		formPage.clickForm(1);
		Thread.sleep(3000);
		String expected = "ePly - General Settings";
		String actual = formPage.pageTitle();
		assertEquals(actual, expected);
	}
}
