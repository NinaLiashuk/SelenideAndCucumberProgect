package it.academy.by.hw6.page_object;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverCreator {
    private static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();

    public DriverCreator(){
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
    }
}
