package stepDefinations;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {
    @Given("I am on home page")
    public void first_method() {
        System.out.println("Success!!!");
        System.setProperty(
                "webdriver.chrome.driver",
                "C://Users//lhovh//OneDrive//Documents//chromedriver.exe/");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.geeksforgeeks.org/");
    }
}
