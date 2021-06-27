package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.PropertiesReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginSteps {

    private static WebDriver driver = Hooks.driver;
    private WebDriverWait wait;
    HomePage home;
    LoginPage login;
    PropertiesReader property;

    public LoginSteps() throws Exception {
        home = new HomePage(driver, wait);
        login = new LoginPage(driver, wait);
        property = new PropertiesReader();
        this.wait = new WebDriverWait(driver, property.getTimeout());
    }

    public static WebDriver getDriver(){
        return driver;
    }

    @Given("User logs into the application")
    public void userLogsIntoTheApplication() throws Exception {
        login.logIn();
        Thread.sleep(2000);
        login.fillEmailData(property.getValue("email"));
        login.fillPasswordData(property.getValue("password"));
        Thread.sleep(2000);
        login.signIn();
    }

    @When("User lands up in home page")
    public void userLandInHomePage() {
        home.homePageIsDisplayed();
    }

    @When("User searches for job for \"(.*)\" city")
    public void userSearchesJob(String city) {
        home.clickJobsButton();
        home.enterJobCity(city);
        home.clickSearchButton();
    }

}