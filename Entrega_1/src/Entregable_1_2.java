import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



import java.util.List;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;


public class Entregable_1_2 {
    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/jguerreroquiros/Desktop/Curso_Selenium/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl="https://www.selenium.dev/";
        driver.get(BaseUrl);  // Accedemos a la URL

        driver.manage().window().maximize();  // Maximizamos la ventana

        Thread.sleep(5000);  // Esperamos 5 segundos

        driver.findElement(By.xpath("//a[@href='/downloads']")).click();  // Hacemos click en "Downloads"

        // Recuperar el número de versión estable para Java y C#, guardándolo en una variable e imprimiéndola por consola.

        //Version estable para Java
        String  vjava =  driver.findElement(By.xpath("//p[text()='Java']/parent::div//a")).getText();  // Obtenemos el texto del enlace con la versión estable para Java

        //Version estable para C#
        String  vchar = driver.findElement(By.xpath("//p[text()='C#']/parent::div//a")).getText();  // Obtenemos el texto del enlace con la versión estable para C#

        // Hacemos el print de las version
        System.out.println("La versión de Java es: " + vjava);
        System.out.println("La versión de C# es: " + vchar);

        driver.quit();


    }
}
