import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by X230 on 27.05.2017.
 */
public class FirstTest {
    WebDriver driver;

    @BeforeMethod
    public void before() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\X230\\Desktop\\dr\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://magento.brainacad.com/");
        driver.findElement(By.cssSelector("#search")).sendKeys("PC games");
        Thread.sleep(5000);
    }

    /*@AfterMethod
    public void after() {
        driver.close();
    }*/
}