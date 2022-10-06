package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.driver;

import java.util.List;

public class AutomationExercisePage {
    public AutomationExercisePage() {
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy(xpath = "//html")
    public WebElement automationExerciseAnaSayfa;
    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement kayitOlGirisYap;
    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement kayitOlName;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement kayitOlEmail;
    @FindBy(xpath = "//*[@id='id_gender1']")
    public WebElement cinsiyetMr;
    @FindBy(xpath = "//*[@id='id_gender2']")
    public WebElement cinsiyetMrs;
    @FindBy(xpath = "//*[text()='Account Created!']")
    public WebElement hesapOlusturuldu;

    @FindBy(xpath = "//*[@data-qa='continue-button']")
    public WebElement continueButton;
    @FindBy(xpath = "//*[@class='fa fa-user']")
    public WebElement oturumAcıldı;
    @FindBy(xpath = "   (//*[@class='fa fa-shopping-cart'])[6]")
    public WebElement elbisEkle;

    @FindBy(xpath = "//*[text()='Register / Login']")
    public WebElement registerLogin;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement sepetiGoruntule;

    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement sepetSayfasi;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement odemeyeDevamEt;
    @FindBy(xpath = "//*[@id='address_delivery']")
    public WebElement teslimatAdresi;
    @FindBy(xpath = "//*[@id='address_invoice']")
    public WebElement faturaAdresi;
    @FindBy(xpath = "//*[@class='fa fa-trash-o']")
    public WebElement hesapSil;


    @FindBy(xpath = "//*[text()='recommended items']")
    public WebElement onerilenUrunler;

    @FindBy(xpath = "(//*[@data-product-id='2'])[3]")
    public WebElement onerilenUrunlerdeSepeteEkle;

    @FindBy(xpath = "//*[@class='cart_description']")
    public WebElement sepettekiUrun;
    @FindBy(xpath = "(//*[@href='/view_cart'])[1]")
    public WebElement sepetButonu;
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement yorumMetniAlani;
    @FindBy(xpath = "//*[@data-qa='pay-button']")
    public WebElement odeVeSiparisiOnayla;
    @FindBy(xpath = "//*[@data-qa='name-on-card']")
    public WebElement kartUzerindekiIsim;
    @FindBy(xpath = "(//*[@class='alert-success alert'])[1]")
    public WebElement siparisVerildi;
    //*[text()='Congratulations! Your order has been confirmed!']
    @FindBy(xpath = "//*[text()='Congratulations! Your order has been confirmed!']")
    public WebElement siparisMEsajio;
    @FindBy(xpath = "//*[@class='btn btn-default check_out']")
    public WebElement faturaIndir;


    @FindBy(xpath = "//*[@href='/products']")
    public WebElement urunlerButonu;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement tumUrunlerYazisi;
    @FindBy(xpath = "//*[@id='search_product']")
    public WebElement aramaKutusu;
    @FindBy(xpath = "//*[@id='submit_search']")
    public WebElement buyutec;
    @FindBy(xpath = "//*[@class='title text-center']")
    public WebElement arananUrunler;
    @FindBy(linkText = "View Product")
    public WebElement viewProduct;
    @FindBy(xpath = "(//h2)[3]")
    public WebElement urunIsmi;
    @FindBy(xpath = "//*[@class='product-image-wrapper']")
    public List<WebElement> urunlerList;
}

