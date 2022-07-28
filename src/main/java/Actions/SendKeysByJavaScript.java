package Actions;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysByJavaScript {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement userName= driver.findElement(By.id("txtUsername"));
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='Admin';",userName);
        WebElement password = driver.findElement(By.id("txtPassword"));
        executor.executeScript("arguments[0].value='admin123';",password);

    }
}
