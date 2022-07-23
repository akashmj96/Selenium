package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartkeedaDriver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://guidely.in/login");
        WebElement userName= driver.findElement(By.id("lname"));
        userName.sendKeys("adarshmj2002@gmail.com");
        WebElement password=driver.findElement(By.id("lpwd"));
        password.sendKeys("akashmj03");
    }
}
