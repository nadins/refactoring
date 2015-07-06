import HomePage.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class task1 {
    private WebDriver driver;

    @Before
    public void setUp() {

        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://google.com");

    }

    @After
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test1() {
        HomePage home = new HomePage(driver);
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("Email")).sendKeys("<login>");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("<password>");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[2]/div[4]/div[1]/a")).click();
        assertTrue(home.getElement().contains("<login>"));
    }
}
