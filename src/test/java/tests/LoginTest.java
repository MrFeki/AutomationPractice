package tests;

import methods.LoginPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.login(PropertyManager.getInstance().getLogin_email(),
                PropertyManager.getInstance().getLogin_password());


        try {
            verificationPage.verifyLogin("Sign out");
            System.out.print("User is logged in!");
        }catch (Exception e){
            Assert.fail("User is not logged in");
        }
    }
}

