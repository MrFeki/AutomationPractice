package methods;

import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

public class RegistrationMethods extends RegistrationPage {


    public RegistrationMethods(WebDriver driver) {
        super(driver);
    }
    public void register(String[] regData){
        clickGenderRadioButton();
        writeFirstName(regData[0]);
        writeLastName(regData[1]);
        writePassword(regData[2]);
        writeAddress(regData[3]);
        writeCity(regData[4]);
        selectRandomOptionFromStateDropdown();
        writePostalCode(regData[5]);
        writePhoneNumber(regData[6]);
        clickRegister();

    }


}
