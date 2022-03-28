
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



import java.util.List;
import java.lang.Thread;
import java.util.concurrent.TimeUnit;


public class Entregable_1_1 {
    public static void main (String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","C:/Users/mgarciaromero/Desktop/Manuel García Romero/SeleniumCurso/Entrega_1/DRIVERs/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String BaseUrl="https://intranet.es.deloitte.com/Pages/default.aspx";
        driver.get(BaseUrl);

        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[text()='Quiénes somos']")).click();
        driver.findElement(By.xpath("//span[text()='Oficinas']")).click();


        Thread.sleep(5000);



        driver.quit();
    }
}
