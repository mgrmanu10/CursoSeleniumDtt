package tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import entregable_2_1.*;


import java.lang.Thread;


public class tests_2_1 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/jguerreroquiros/Desktop/Curso_Selenium/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl="https://www.uca.es/";
        driver.get(BaseUrl);  // Accedemos a la URL de la UCA
        driver.manage().window().maximize(); //maximizado de pantalla

        Ventana ventana = new Ventana(driver);
        Thread.sleep(2000);

        ventana.clickCookies1();
        ventana.clickEstudiantes();
        Thread.sleep(1000);
        ventana.clickGrados();

        //Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3750)", "");
        Thread.sleep(1000);

        ventana.clickIngenieriaInformatica();
        ventana.newPage();
        ventana.clickCookies2();
        ventana.clickAcceso();
        ventana.clickGradosbis();


    }
}
