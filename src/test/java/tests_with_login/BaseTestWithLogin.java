package tests_with_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import methods.LoginPageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import utilities.PropertyManager;

public class BaseTestWithLogin {

    protected WebDriver driver;

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();



        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));

        driver.get(PropertyManager.getInstance().getUrl());

        LoginPageMethods loginPageMethods = new LoginPageMethods(driver);

        loginPageMethods.login(PropertyManager.getInstance().getLogin_email(),
                PropertyManager.getInstance().getLogin_password());

    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}

