package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private final By homeSliders = By.id("");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

}
