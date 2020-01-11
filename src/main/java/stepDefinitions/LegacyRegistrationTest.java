package stepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Constants;

import java.util.concurrent.TimeUnit;
public class LegacyRegistrationTest {

    WebDriver driver;
    @Given("^Open the Firefox and launch the platform legacy registration$")
    public void open_the_Firefox_and_launch_the_platform_legacy_registration() throws Throwable {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constants.PLATFORM_STAGING_URL+"login");
    }
    @When("^Fill form Inputs and click on login$")
    public void fill_form_Inputs_and_click_on_login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page_objects.email(driver).sendKeys("testemail54@sc.com");
        page_objects.password(driver).sendKeys("password");
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/button[1]")));
        page_objects.login(driver).click();
    }
    @Then("^open available collection$")
    public void open_available_collection() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        page_objects.openCollection(driver).click();

    }
    @Then("^create moodboard$")
    public void create_moodboard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        page_objects.moodBoardName(driver).sendKeys("testMootBoard");
        page_objects.createMoodBoard(driver).click();

    }

}
