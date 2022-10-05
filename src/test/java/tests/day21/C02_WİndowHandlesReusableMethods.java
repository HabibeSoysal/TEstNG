package tests.day21;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ReusableMethods;
import utilities.driver;

import java.util.ArrayList;

public class C02_WİndowHandlesReusableMethods {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ArrayList<String> pencereler = new ArrayList<>(driver.getDriver().getWindowHandles());
        driver.getDriver().switchTo().window(pencereler.get(1));
        String expectedTitle = "New Window";
        String actualTitle = driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.closeDriver();

    }

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        ReusableMethods.waitFor(3);
        driver.getDriver().findElement(By.xpath("//*[text()='Click Here']")).click();
        // acilan yeni tab'in title'inin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle = "New Window";
        String actualTitle = driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        driver.quitDriver();
}}
