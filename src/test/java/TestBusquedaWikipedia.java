import Business.Controlador;
import Business.interfaces.BusinessInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBusquedaWikipedia {
    private WebDriver driver;
    private BusinessInterface controlador;

    @Before
    public void settingTest(){
    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
    //instanciamos el driver de chrome
    this.driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://www.google.com.ar");

    //instanciamos la clase controladora y le pasamos como parametro el driver de chrome
    controlador = new Controlador(driver);
    }

    @After
    public void cleanUp(){ driver.quit(); }

    @Test
    public void ejecutarBusqueda(){
        String busquedaGoogle = "Wikipedia";
        String busquedaWiki = "Argentina";
        controlador.perform(busquedaGoogle,busquedaWiki);
    }
}
