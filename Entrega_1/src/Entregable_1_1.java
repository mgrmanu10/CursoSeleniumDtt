
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



import java.util.List;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;


public class Entregable_1_1 {
    public static void main (String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:/Users/jguerreroquiros/Desktop/Curso_Selenium/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        driver.get("https://intranet.es.deloitte.com/Pages/default.aspx");  // Accedemos al enlace de la intranet

        Thread.sleep(3000);  // Esperamos 3 segundos

        driver.findElement(By.xpath("//span[text()='Quiénes somos']")).click();  // Hacemos click en "Quiénes Somos"
        driver.findElement(By.xpath("//span[text()='Oficinas']")).click();  // Hacemos click en "Oficinas"

        Thread.sleep(5000);  // Esperamos 5 segundos

        driver.quit();  // Cerramos el navegador
    }
}
