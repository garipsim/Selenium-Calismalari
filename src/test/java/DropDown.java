import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDown {

    WebDriver driver = new ChromeDriver();
    @Before
    public void setup() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("https://courses.ultimateqa.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @After
    public void teardown() { driver.close();}

    @Test
    public void checkboxTest() throws InterruptedException {
        WebElement signIn = driver.findElement(By.partialLinkText("Sign In"));
        signIn.click();
        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.id("user[remember_me]"));
        checkbox.click();
        Thread.sleep(1000);

        Assert.assertTrue(checkbox.isSelected());

    }


}
