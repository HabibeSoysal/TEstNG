package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import utilities.driver;

import java.io.IOException;

public class C01_ScreenShotReusable {
    @Test
    public void test01() throws IOException {
        //Hepsiburada sayfasına gidiniz
        driver.getDriver().get("https://www.hepsiburada.com");
        //ve sayfanın resmini alınız
        ReusableMethods.getScreenshot("hepsiburada");
        //sayfayı kapatınız
        driver.closeDriver();

    }

    @Test
    public void test02() throws IOException {
        //Amazon sayfasına gidiniz
        driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amznPage = new AmazonPage();
        //Nutella aratınız
        amznPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //Arama sonuc yazısı Webelementinin resmini alınız
        ReusableMethods.getScreenshotWebElement("AramaSonucWE", amznPage.aramaSonucWE);

    }
}