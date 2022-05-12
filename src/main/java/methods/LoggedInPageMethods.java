package methods;

import org.openqa.selenium.WebDriver;
import pages.LoggedInPage;

public class LoggedInPageMethods extends LoggedInPage {
    public LoggedInPageMethods(WebDriver driver) {
        super(driver);
    }
    public void logout(){
        clickSignOut();
    }


}
