package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElement {
    public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        FindElement findElement= new FindElement();
        findElement.launchBrowser();
        findElement.login();

    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void login() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@*='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@*='button']"));
        loginBtn.click();
       // List<WebElement> list =driver.findElement(By.xpath("//*[@class='legendLabel']"));
        Thread.sleep(5000);
        List<WebElement> list=  driver.findElements(By.xpath("//*[@class='legendLabel']"));
        for (int i=0;i<list.size();i++){
           String label= list.get(i).getText();
           System.out.println(i);
        }

    }

}
