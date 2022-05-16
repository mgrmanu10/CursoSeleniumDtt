package tests;

import entregable3.*;
import entregable_2_1.Ventana;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


import java.lang.Thread;

public class tests3 {

    public static void main (String[] args) throws InterruptedException {

        // Crear ChromeDriver

        System.setProperty("webdriver.chrome.driver", "C:/Users/jguerreroquiros/Desktop/Curso_Selenium/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl = "https://intranet.es.deloitte.com/Pages/default.aspx";
        driver.get(BaseUrl);  // Accedemos a la Intranet de Deloitte
        driver.manage().window().maximize(); //maximizado de pantalla

        Intranet web = new Intranet(driver);

        web.closePopUp();
        web.clickSearchBar();
        web.search("Registro horario");

    }



}
