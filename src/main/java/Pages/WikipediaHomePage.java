package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WikipediaHomePage {

    private WebDriver driver;

    public WikipediaHomePage(WebDriver driver){
        super();
        this.driver = driver;
    }

    public void buscarEnWikipedia(String busqueda){
        WebElement inputBusqueda = driver.findElement(By.cssSelector("#searchInput"));
        inputBusqueda.clear();
        inputBusqueda.sendKeys(busqueda);
        inputBusqueda.sendKeys(Keys.TAB);
    }

    public void clickBotonWiki(){
        WebElement botonBuscarWiki = driver.findElement(By.xpath("//*[@id=\"searchButton\"]"));
        botonBuscarWiki.click();

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

}
