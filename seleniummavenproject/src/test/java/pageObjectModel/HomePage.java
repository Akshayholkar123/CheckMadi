package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	@FindBy(xpath="//a[text()='Logout']") private WebElement logoutlink;
public void logoutMethod()
{
	logoutlink.click();
}
}
