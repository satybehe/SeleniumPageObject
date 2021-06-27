package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static StepDefinitions.LoginSteps.getDriver;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='login_field']")
    @CacheLookup
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='password']")
    @CacheLookup
    private WebElement passwordField;

    @FindBy(xpath = "//input[@name='submitButton']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement loginButton;

    @FindBy(xpath = "//input[@type='submit' and @value='Sign in']")
    private WebElement signInButton;



    public void fillEmailData(String email) {
        emailField.isEnabled();
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPasswordData(String password) {
        passwordField.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void signIn() {
        signInButton.click();
    }

    public void logIn() {
        loginButton.click();
    }

}