package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginById{
    public WebDriver driver;

    public static void main(String[] args) {
        LoginById loginById=new LoginById();
        loginById.launchBrowser();
        loginById.login();

    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void login(){
        WebElement userName=driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement passowrd = driver.findElement(By.id("txtPassword"));
        passowrd.sendKeys("admin123");
        WebElement login= driver.findElement(By.id("btnLogin"));
        login.click();

    }
}
