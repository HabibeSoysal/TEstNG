package tests.day17;

import org.testng.annotations.Test;
import utilities.driver;

public class C04_DriverIlkTEst {
    @Test
    public void test01() {
        /*
TestBase class'ına extend ederek kullandığımız driver yerine artık Driver class'ından kullanacağımız
getDriver() static method'unu kullanırız
 */
        driver.getDriver().get("https://www.amazon.com");
        driver.getDriver().get("https://www.bestbuy.com");
        driver.closeDriver();
        driver.getDriver().get("https://www.hepsiburada.com");
        driver.closeDriver();
    }
}
