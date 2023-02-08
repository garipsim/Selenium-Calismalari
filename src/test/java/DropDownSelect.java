import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
public class DropDownSelect{
    public static void main(String[] args) {
      //  System.setProperty("webdriver.chrome.driver",       "C:\Users\ghs6kor\Desktop\Java\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String url = "https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm";
        driver.get(url);
        driver.manage().window().maximize();
        // identify element
        WebElement m=driver
                .findElement(By.xpath("//*[@name='continents']"));
        //Select class for dropdown
        Select s = new Select(m);
        // select with text visible
        s.selectByVisibleText("Australia");
        // select with index
        s.selectByIndex(2);
        driver.close();
    }
}