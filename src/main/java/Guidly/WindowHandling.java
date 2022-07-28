package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.linkText("OrangeHRM, Inc"));
        Set<String> handle=driver.getWindowHandles();
        Iterator<String> itr= handle.iterator();
        String parentWindow=itr.next();
        Thread.sleep(5000);
        String childWindow=itr.next();
        Thread.sleep(5000);
        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//*[@class='btn-orange contact-ohrm ']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("Form_submitForm_FullName")).sendKeys("Testing");

        driver.switchTo().window(parentWindow);

        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginBtn= driver.findElement(By.id("btnLogin"));
        loginBtn.click();

    }
}
