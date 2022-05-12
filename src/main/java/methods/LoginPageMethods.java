package methods;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageMethods extends LoginPage {
    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }
    public void login(String email,String password){
        clickSignInButton();
        writeLoginEmail(email);
        writeLoginPassword(password);
        clickLoginButton();
    }
    public void navigateToRegistration(String email){
        clickSignInButton();
        writeRegistrationEmail(email);
        clickCreateAnAccountButton();
    }
}
