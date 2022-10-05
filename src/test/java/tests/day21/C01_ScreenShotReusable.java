package tests.day21;

import org.testng.annotations.Test;
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
}
