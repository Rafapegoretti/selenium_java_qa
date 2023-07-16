import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimeiraClasse {
    @Test
    public void testeAberturaBrowser(){

        WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}