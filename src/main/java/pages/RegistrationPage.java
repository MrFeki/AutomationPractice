package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By genderRadioButtonBy = By.id("id_gender1");
    By firstNameInputFieldBy = By.id("customer_firstname");
    By lastNameInputFieldBy = By.id("customer_lastname");
    By passwordInputFieldBy = By.id("passwd");
    By addressInputFieldBy = By.id("address1");
    By cityInputFieldBy = By.id("city");
    By stateDropdownBy = By.id("id_state");
    By postalCodeInputFieldBy = By.id("postcode");
    By mobilePhoneInputFieldBy = By.id("phone_mobile");
    By registrationButtonBy = By.id("submitAccount");



    public void clickGenderRadioButton(){
        click(genderRadioButtonBy);
    }
    public void writeFirstName(String fName){
        writeText(firstNameInputFieldBy,fName);
    }
    public void writeLastName(String lName){
        writeText(lastNameInputFieldBy,lName);
    }
    public void writePassword(String password){
        writeText(passwordInputFieldBy,password);
    }
    public void writeAddress(String address){
        writeText(addressInputFieldBy,address);
    }
    public void writeCity(String city){
        writeText(cityInputFieldBy,city);
    }
    public void selectRandomOptionFromStateDropdown(){
        selectRandomFromDropdown(stateDropdownBy,1);
    }
    public void writePostalCode(String postalCode){
        writeText(postalCodeInputFieldBy,postalCode);
    }
    public void writePhoneNumber(String phone){
        writeText(mobilePhoneInputFieldBy,phone);
    }
    public void clickRegister(){
        click(registrationButtonBy);
    }
}
