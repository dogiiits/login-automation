package stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class page_objects {
    private static WebElement element = null;

    public static WebElement email(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='right flex justify-end h-screen items-center md:mr-0 lg:mr-16 xl:mr-32']//div[4]//div[1]//input[1]"));
        return element;
    }
    public static WebElement password(WebDriver driver)
    {
        element = driver.findElement(By.xpath("//div[@class='right flex justify-end h-screen items-center md:mr-0 lg:mr-16 xl:mr-32']//div[5]//div[1]//input[1]"));
        return element;
    }
    public static  WebElement login(WebDriver driver){
        element = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[4]/div[1]/button[1]"));
        return element;
    }
    public static WebElement openCollection(WebDriver driver){
        element = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='sc-iRbamj gXeyGL']/div[@class='stacks']/div[1]"));
        return element;
    }
    public static WebElement moodBoardName(WebDriver driver){
        element = driver.findElement(By.xpath("//div[@class='MuiFormControl-root MuiTextField-root MuiFormControl-marginNormal MuiFormControl-fullWidth']//input[@id='standard-full-width']"));
        return element;
    }
    public static WebElement createMoodBoard(WebDriver driver){
        element = driver.findElement(By.xpath("//button[contains(text(),'Create Moodboard')]"));
        return element;
    }
}
