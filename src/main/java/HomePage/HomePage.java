package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getElement() {
        return driver.findElement(By.className("gb_D")).getText();
    }
}
