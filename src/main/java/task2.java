import HomePage.HomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class task2 {

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
    public void test2() {
        HomePage home = new HomePage(driver);
        driver.findElement(By.id("gb_70")).click();
        driver.findElement(By.id("Email")).sendKeys("<email>");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("<pass>");
        driver.findElement(By.id("signIn")).click();
        driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
        driver.findElement(By.xpath(".//*[@id='gb49']/span[1]")).click();
        driver.findElement(By.xpath(".//*[@id='drive_main_page']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div")).click();

		
        driver.findElement(By.cssSelector(".a-D-P")).click();  //press Папка
        driver.findElement(By.xpath("html/body/div[11]/div[3]/button[2]")).click();


    }
}
