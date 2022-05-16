package entregable_2_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;


public class Ventana {

    private WebDriver driver;


    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Aceptar')]")
    WebElement cookies1;

    @FindBy(how = How.XPATH,using = "//ul[@id='menu-principal']//a[@title='Estudiantes']")
    WebElement estudiantes;

    @FindBy(how = How.XPATH,using = "(//a[@href='https://www.uca.es/grados/'])[1]")
    WebElement grados;

    @FindBy(how = How.XPATH,using = "/html/body/div[@class='container']//article/div[@class='single_content']/div[3]/div[@class='table-responsive']/table/tbody/tr[35]/td[4]/a[@href='https://esingenieria.uca.es/']")
    WebElement ingenieriaInformatica;

    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Aceptar')]")
    //@FindBy(how = How.XPATH,using = "/html//div[@id='uca_popup_background']/div[@class='uca_ck_alert uca_ck_flex']//button[@class='btn btn-primary uca_ck_bt_accept']")
    WebElement cookies2;


    @FindBy(how = How.XPATH,using = "//a[@title='Acceso']")
    WebElement acceso;

    @FindBy(how = How.XPATH,using = "//a[@href='https://esingenieria.uca.es/acceso/grados/']")
    WebElement gradosbis;



    public Ventana(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickCookies1() {
        cookies1.click();
    }
    public void clickEstudiantes() {
        estudiantes.click();
    }
    public void clickGrados() {
        grados.click();
    }
    public void clickIngenieriaInformatica() {
        ingenieriaInformatica.click();
    }
    public void clickCookies2() {
        cookies2.click();
    }
    public void newPage() throws InterruptedException {
        String parentWindow = driver.getWindowHandle();
        Set<String> handles =  driver.getWindowHandles();
        for(String windowHandle  : handles){
            if(!windowHandle.equals(parentWindow)){
                driver.switchTo().window(windowHandle);

            }
        }
    }
    public void clickAcceso() {
        acceso.click();
    }
    public void clickGrados2() {
        gradosbis.click();
    }

}
