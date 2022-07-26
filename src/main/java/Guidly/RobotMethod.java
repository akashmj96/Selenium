package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotMethod {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        Thread.sleep(5000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_DELETE);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_DELETE);

        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Robot robot1=new Robot();
        robot1.keyPress(KeyEvent.VK_CONTROL);
        robot1.keyPress(KeyEvent.VK_A);
        robot1.keyPress(KeyEvent.VK_DELETE);
        robot1.keyRelease(KeyEvent.VK_CONTROL);
        robot1.keyRelease(KeyEvent.VK_A);
        robot1.keyRelease(KeyEvent.VK_DELETE);
        robot1.keyPress(KeyEvent.VK_ENTER);
        robot1.keyRelease(KeyEvent.VK_ENTER);

       // robot.keyPress(KeyEvent.VK_ENTER);
        //robot1.keyRelease(KeyEvent.VK_ENTER);



    }
}
