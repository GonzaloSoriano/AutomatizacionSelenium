package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import java.util.List;
import java.util.ArrayList;

public class GoogleHomePage {
    private WebDriver driver;

    public GoogleHomePage(WebDriver driver){
        super();
        this.driver = driver;
    }
    public void buscarEnGoogle(String busqueda){
        WebElement inputBusqueda = driver.findElement(By.cssSelector("input[name='q']"));
        inputBusqueda.clear();
        inputBusqueda.sendKeys(busqueda);
        inputBusqueda.sendKeys(Keys.TAB);
    }

    public void clickBoton(){
        WebElement botonBuscar = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]"));
        botonBuscar.click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void clickResultado(){
        //Accedemos al primer resultado obteniendo la URL del elemento
       // WebElement resultado = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a"));
       // driver.get(resultado.getAttribute("href"));

        //Clickeamos el primer resultado
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }
}
