package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.xml.ws.WebEndpoint;

public class LaunchSmart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://testzone.smartkeeda.com/test/signin");
        WebElement userName=driver.findElement(By.name("emailid"));
        userName.sendKeys("adarshmjadhav2002@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("akashmj03");
        WebElement login =driver.findElement(By.className("login100-form-btn"));
        login.click();
    }
}
