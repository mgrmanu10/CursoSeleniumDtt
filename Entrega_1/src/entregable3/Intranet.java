package entregable3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;


public class Intranet {

    private WebDriver driver;

    WebElement searchBar = driver.findElement(By.xpath("//*[@id='txtSearchContent']"));
    WebElement PopUp = driver.findElement(By.xpath("//*[@id='DlgClose582b6cb2-64fe-484c-b68f-44a2b4bbae49']"));
    WebElement searchButton = driver.findElement(By.xpath("//*[@id='imgSearchContent']"));


    public Intranet(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void closePopUp(){ PopUp.click(); }
    public void clickSearchBar(){ searchBar.click(); }
    public void search(String busqueda){
        searchBar.sendKeys(busqueda);
        searchButton.click();
    }


}
