package entregable3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.text.SimpleDateFormat;
import java.text.ParseException;


import java.util.Set;


public class Intranet {

    private WebDriver driver;

    WebElement dialogo = driver.findElement(By.xpath("//span[@id='dlgTitleBtns']/a[@title='Close dialog']//img[@alt='Close dialog']"));
    WebElement barraBusqueda = driver.findElement(By.xpath("//*[@id='txtSearchContent']"));
    WebElement botonBuscar = driver.findElement(By.xpath("//*[@id='imgSearchContent']"));
    WebElement registroHorario = driver.findElement(By.xpath("//div[@id='Groups']/div[@name='Group']/div[@class='ms-srch-group-content']/div[1]//a[@title='Registro horario']/strong[2]"));
    WebElement cookies = driver.findElement(By.xpath("/html//button[@id='onetrust-accept-btn-handler']"));
    String fecha_texto = driver.findElement(By.xpath("/html/body[@class='ng-scope']/locker-section[@class='ng-isolate-scope']//div[@class='ng-scope']//div[@class='container-fluid ng-scope']//ng-form[@name='formWorkSchedule']//div[.='20 mayo 2022']")).getText();


    public Intranet(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void cerrarDialogo(){ dialogo.click(); }  // Cerrar dialogo emergente

    public void buscarRegistroHorario(){
        barraBusqueda.click();  // Click en barra de busqueda
        barraBusqueda.sendKeys("Registro horario");  // Escribir "Registro Horario"
        botonBuscar.click();  // Buscar
    }
    public void clickRegistroHorario(){ registroHorario.click(); }  // Click en el link de "Registro Horario"

    public void aceptarCookies(){ cookies.click(); }  // Aceptamos y cerramos las cookies

    public void obtener_fecha(){
        Date fecha = fecha_texto.
    };




}
