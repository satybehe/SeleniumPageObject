package PageObjects;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BaseClass {

    public HomePage(WebDriver driver, WebDriverWait wait) {

        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Home')]")
    @CacheLookup
    private WebElement homePage;

    @FindBy(xpath = "//a[@title='Jobs']")
    @CacheLookup
    private WebElement jobsTab;

    @FindBy(xpath = "//input[@id='jobs_search_job_city']")
    @CacheLookup
    private WebElement jobCity;

    @FindBy(xpath = "//input[@value='Search']")
    @CacheLookup
    private WebElement search;


    public boolean homePageIsDisplayed() {

        WaitUntilElementVisible(homePage);
        homePage.isDisplayed();
        return true;
    }

    public void clickJobsButton() {
        WaitUntilElementVisible(jobsTab);
        jobsTab.click();
    }

    public void enterJobCity(String city) {
        WaitUntilElementVisible(jobCity);
        jobCity.sendKeys(city);
    }

    public void clickSearchButton() {
        WaitUntilElementVisible(search);
        search.click();
    }
}