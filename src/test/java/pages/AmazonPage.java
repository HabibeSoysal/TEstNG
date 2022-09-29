package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

public class AmazonPage {
    public AmazonPage(){//constructor olusturup public yapmamız gerekir
        PageFactory.initElements(driver.getDriver(),this);

    }
    @FindBy(id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath="//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucWE;


}
