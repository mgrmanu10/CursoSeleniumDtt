package entregable3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Date;
import java.util.Set;

public class Intranet {

    private WebDriver driver;

    WebElement dialogo = driver.findElement(By.xpath("//span[@id='dlgTitleBtns']/a[@title='Close dialog']//img[@alt='Close dialog']"));
    WebElement barra_busqueda = driver.findElement(By.xpath("/html//input[@id='txtSearchContent']"));
    WebElement link_Registro_Horario = driver.findElement(By.cssSelector("a[title='Registro horario'] > strong:nth-of-type(1)"));
    WebElement cookies = driver.findElement((By.xpath("//button[contains(text(),'Aceptar')]")));
    String titulo = driver.findElement(By.xpath("/html/body/locker-section/div[2]/div/home/div/div/div/ng-form/div[1]/div[2]/div[1]")).getText();


    public Intranet(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void cerrarDialogo(){ dialogo.click(); }
    public void buscarRegistroHorario(){
        barra_busqueda.click();
        barra_busqueda.sendKeys("Registro horario");

    }
    public void clickRegistroHorario(){ link_Registro_Horario.click();}
    public void mostrarFecha(){
    }
    public void aceptarCookies(){ cookies.click(); }



}
