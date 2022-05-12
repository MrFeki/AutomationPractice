package tests;

import methods.LoginPageMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{


    @Test
    public void failedLogin(){
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPageMethods.basePage();
        loginPageMethods.login(PropertyManager.getInstance().getEmail(),
                        PropertyManager.getInstance().getBad_login_password());

        try {
            verificationPage.verifyFailedLogin("There is 1 error\nAuthentication failed.");
            System.out.print("User is not logged in");
        }catch (Exception e){
            Assert.fail("User is logged in!");
        }

    }
}
