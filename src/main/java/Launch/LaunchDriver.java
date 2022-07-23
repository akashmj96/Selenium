package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchDriver {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement passowrd = driver.findElement(By.id("txtPassword"));
        passowrd.sendKeys("admin123");
        //WebElement login= driver.findElement(By.id("btnLogin"));
        //login.click();
        WebElement forgetPassword=driver.findElement(By.id("forgotPasswordLink"));
        forgetPassword.click();

    }
}
