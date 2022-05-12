package pages;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.PropertyManager;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    By signInButtonBy = By.className("login");
    By emailTextFieldBy = By.id("email");
    By passwordTextFieldBy = By.id("passwd");
    By loginButtonBy = By.id("SubmitLogin");
    By registrationEmailFieldBy = By.id("email_create");
    By createAnAccountButtonBy = By.id("SubmitCreate");

    public LoginPage basePage(){
        driver.get(PropertyManager.getInstance().getUrl());
        return this;
    }

    public void clickSignInButton(){
        click(signInButtonBy);
    }
    public void writeLoginEmail(String email){
        writeText(emailTextFieldBy,email);
    }
    public void writeLoginPassword(String password){
        writeText(passwordTextFieldBy,password);
    }
    public void clickLoginButton(){
        click(loginButtonBy);
    }
    public void writeRegistrationEmail(String reg_email){
        writeText(registrationEmailFieldBy, reg_email);
    }
    public void clickCreateAnAccountButton(){
        click(createAnAccountButtonBy);
    }
}
