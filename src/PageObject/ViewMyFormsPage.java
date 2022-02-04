package PageObject;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewMyFormsPage extends BasePage{

	//timeline selection (3 months, 6 months, etc....)
	@FindBy(css = "#DateFilter")
	WebElement dateFilter;
	@FindBy(css = ".fa.fa-pie-chart")
	List<WebElement> forms;

	public ViewMyFormsPage(WebDriver driver) {
		super(driver);
	}

	public void dropdown (int range_num) {
		selectIndex(dateFilter, range_num);
	}

	public int numForms() throws InterruptedException {
		Thread.sleep(1000);
		return forms.size();
	}

	public void dropDownSelection(String textToSelect) {
		selectText(dateFilter, textToSelect);
	}
}
