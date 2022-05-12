package tests;

import dataCreation.DataCreation;
import methods.LoginPageMethods;
import methods.RegistrationMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.VerificationPage;
import utilities.PropertyManager;







public class RegistrationTest extends BaseTest{





    @Test
    public void registration() {
        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);
        RegistrationMethods registrationMethods = new RegistrationMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);




        String logMail = DataCreation.fakeEmail();
        String [] regisData = DataCreation.registrationData();

        loginPageMethods.navigateToRegistration(logMail);
        registrationMethods.register(regisData);




        try {
            verificationPage.verifyLogin("Sign out");
            PropertyManager.changeProperty("login_email", logMail);
            PropertyManager.changeProperty("login_password", regisData[2]);
            System.out.print("User is registered");
        } catch (Exception e) {
            Assert.fail("User is NOT registered!");
        }
    }
}
