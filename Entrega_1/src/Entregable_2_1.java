
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.*;


import java.lang.Thread;


public class Entregable_2_1 {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/mgarciaromero/Desktop/Manuel García Romero/SeleniumCurso/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl="https://www.uca.es/";
        driver.get(BaseUrl);  // Accedemos a la URL de la UCA




        //MEDIANTE FULL XPATH

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/button[1]")).click(); //Aceptamos Cookies

        driver.findElement(By.xpath("//*[@id=\"menu-item-43771\"]/a")).click(); //Hacemos Click en Estudiantes

        Thread.sleep(2000);  // Esperamos 2 segundos
        driver.findElement(By.xpath("/html/body/header/div/div[1]/div[2]/div/nav/div/ul/li[3]/ul/li[3]/ul/li[1]/a")).click(); //Hacemos Click en Grados

        Thread.sleep(2000);  // Esperamos 2 segundos


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3750)", "");

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[3]/div/div/article/div[3]/div[3]/div/table/tbody/tr[35]/td[4]/a")).click(); //Click en Ingeniería Informática

        Thread.sleep(2000);
        //Cambio de Foco a la otra ventana
        Set<String> handles = driver.getWindowHandles();
        String[] ventanas_id = new String[2];
        handles.toArray(ventanas_id);
        driver.switchTo().window(ventanas_id[1]);

        Thread.sleep(1000);  // Esperamos 1 segundos

        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/button[1]")).click(); //Aceptamos Cookies
        Thread.sleep(1000);  // Esperamos 1 segundos

        driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div[2]/div/div/nav/ul/li[3]/a")).click(); //Click Accesos
        Thread.sleep(2000);  // Esperamos 2 segundos

        driver.findElement(By.xpath("/html/body/header/div[3]/div[2]/div[2]/div/div/nav/ul/li[3]/ul/li[1]/a")).click(); //Click Grados




    }
}
