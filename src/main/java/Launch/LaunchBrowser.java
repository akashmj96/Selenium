package Launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //D:\Selenium\Selenium\src\main\resources\chromedriver.exe
        String path=System.getProperty("user.dir")+File.separator+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"chromedriver.exe";
        //System.out.println(path);
        System.setProperty("webdriver.chrome.driver",path);
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.practicemock.com/");
        Thread.sleep(3000);
        driver.close();

    }
}
