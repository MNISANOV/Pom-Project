package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{

	@FindBy(css = "#ePlyHeader_accountLink")
	WebElement accountBtn;
	@FindBy(css = "#Website")
	WebElement website;
	@FindBy(css = "#Address")
	WebElement address;
	@FindBy(css = "#Province")
	WebElement province;
	@FindBy(css = "#Country")
	WebElement country;
	@FindBy(css = "#Button1")
	WebElement saveBtn;
	@FindBy(css = "#UpdateClientError")
	WebElement updAcnt;

	public AccountPage(WebDriver driver) {
		super(driver);
	}

	public void clickAccount() {
		click(accountBtn);
	}

	public void fillParam (String text, String text2, String prov, String count) throws InterruptedException {
		fillText(website, text);
		fillText(address, text2);
		click(province);
		selectText(province, prov);
		click(country);
		selectText(country, count);
		Thread.sleep(500);
		click(saveBtn);
	}

	public boolean isUpdateExist() {
		return updAcnt.isDisplayed();
	}
}
