package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");
        WebElement element= driver.findElement(By.id("alertButton"));
        element.click();
        Thread.sleep(5000);
        org.openqa.selenium.Alert alert =driver.switchTo().alert();
        Thread.sleep(5000);
        alert.accept();
        WebElement element1=driver.findElement(By.id("timerAlertButton"));
        element1.click();
        org.openqa.selenium.Alert alert1=driver.switchTo().alert();
        alert1.accept();
    }
}
