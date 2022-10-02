package tests.day18;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.driver;

public class C02_calısması {
    @Test
    public void test01() {
        // https://www.hotelmycamp.com/ adresine git
       driver.getDriver().get(ConfigReader.getProperty("hmcUrl"));










    }

}
