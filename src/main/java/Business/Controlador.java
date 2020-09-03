package Business;


//Esta seria la clase intermedia que relaciona las pages con el test

import Business.interfaces.BusinessInterface;
import Pages.GoogleHomePage;
import Pages.WikipediaHomePage;
import org.openqa.selenium.WebDriver;


public class Controlador implements BusinessInterface {
    private GoogleHomePage googleHomePage;
    private WikipediaHomePage wikipediaHomePage;

    public Controlador(WebDriver driver){
        this.googleHomePage = new GoogleHomePage(driver);
        this.wikipediaHomePage = new WikipediaHomePage(driver);
    }

    public void perform(String busquedaGoogle, String busquedaWiki) {
        this.googleHomePage.buscarEnGoogle(busquedaGoogle);
        this.googleHomePage.clickBoton();
        this.googleHomePage.clickResultado();
        this.wikipediaHomePage.buscarEnWikipedia(busquedaWiki);
        this.wikipediaHomePage.clickBotonWiki();
    }


}
