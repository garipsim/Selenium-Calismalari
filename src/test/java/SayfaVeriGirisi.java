package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SayfaVeriGirisi {

    WebDriver driver = new ChromeDriver();
    @Before
    public void control() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("http://gcreddy.com/project/admin/login.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }
    @After
    public void programclose() { driver.close();}

    @Test
    public void linkTesti() throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys("gcreddy");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("Temp@2020");
        Thread.sleep(1000);
        driver.findElement(By.id("tdb1")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-accordion-adminAppMenu-header-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ui-accordion-adminAppMenu-panel-2")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("tdb1")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("customers_firstname")).clear();
        driver.findElement(By.name("customers_firstname")).sendKeys("Yasar");
        Thread.sleep(1000);
        driver.findElement(By.name("customers_lastname")).sendKeys("Yilmaz");
        Thread.sleep(2000);
        driver.findElement(By.name("customers_dob")).sendKeys("11/12/1975");
        Thread.sleep(2000);
        driver.findElement(By.name("customers_email_address")).sendKeys("yas.yil@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("entry_company")).sendKeys("yas.yil company");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='entry_street_address']")).sendKeys("Sivas");   //name("customers_email_address")).sendKeys("yas.yil@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='customers_telephone']")).sendKeys("90980706050");     //name("customers_email_address")).sendKeys("yas.yil@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("customers_fax")).sendKeys("9080706050");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//select[@name='customers_newsletter']")).click();   //name("customers_email_address")).sendKeys("yas.yil@hotmail.com");
        Thread.sleep(2000);
        driver.findElement(By.name("customers_email_address")).sendKeys("yas.yil@hotmail.com");
        Thread.sleep(2000);






/*
         username.sendKeys("gcreddy");
         password.sendKeys("Temp@2020");
         login.click();


        WebElement password = driver.findElement(By.cssSelector("button#tdb1")); cssSelector("button#tdb1"));
        password.sendKeys("Temp@2020");
        Thread.sleep(1000);




        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Temp@2020");
        Thread.sleep(1000);


        */



    }


}
