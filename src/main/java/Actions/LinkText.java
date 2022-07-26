package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("password?")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        driver.findElement(By.partialLinkText("Forgot ")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        //driver.close();
        WebElement userName= driver.findElement(By.cssSelector("#txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.cssSelector("#txtPassword"));
        password.sendKeys("admin123");
        WebElement login= driver.findElement(By.cssSelector(".button"));
        login.click();
    }
}
