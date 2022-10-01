package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.driver;

public class C02_ConfigurationProperties {

    @Test
    public void test01() {
        //Amazon sayfasına ve facebook sayfasına gidiniz
        String urlamzn = ConfigReader.getProperty("amznUrl");
        String urlFace = ConfigReader.getProperty("faceUrl");
        driver.getDriver().get(urlamzn);
        driver.getDriver().get(urlFace);

        driver.closeDriver();


    }
}
