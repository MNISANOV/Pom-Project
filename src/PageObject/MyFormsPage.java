package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFormsPage extends BasePage{

	@FindBy(css = "#ePlyHeader_SearchLink")
	WebElement searchAllBtn;
	@FindBy(css = "#ePlyHeader_FirstName")
	WebElement welcomeMsg;
	
	public MyFormsPage(WebDriver driver) {
		super(driver);
	}

	public void openSearchAll () {
		click(searchAllBtn);
	}

	public String welcome() {
		return welcomeMsg.getText();
	}
}
