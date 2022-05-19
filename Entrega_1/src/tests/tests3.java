package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import entregable3.*;

public class tests3 {

    public static void main (String[] args) throws InterruptedException {

        // Crear ChromeDriver

        System.setProperty("webdriver.chrome.driver", "C:/Users/jguerreroquiros/Desktop/Curso_Selenium/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl = "https://intranet.es.deloitte.com/Pages/Results.aspx?k=registro%20horario";
        driver.get(BaseUrl);
        driver.manage().window().maximize(); // Maximizar pantalla

        Intranet web = new Intranet(driver);


        web.clickRegistroHorario();  // Hacer click en "Registro Horario"
        web.mostrarFecha();
        web.aceptarCookies();

        driver.quit();
    }

}
