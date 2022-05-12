package dataCreation;

import com.github.javafaker.Faker;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class DataCreation {

    private static Faker faker = new Faker(new Locale("en-GB"));

    public static String fakeEmail(){
        return faker.internet().emailAddress();
    }
    public static String[] registrationData(){
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String regPassword = faker.internet().password(8,12);
        String regAddress = faker.address().streetAddress();
        String regCity = faker.address().cityName();
        String postalCode = faker.number().digits(5);
        String mobilePhone = faker.phoneNumber().cellPhone();

        return new String []{firstName, lastName, regPassword, regAddress, regCity, postalCode, mobilePhone};

    }


         public String regPass = registrationData()[2];

}
