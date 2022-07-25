package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XPath {
    public  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        XPath xPath=new XPath();
        xPath.launchBrowser();
        xPath.login();
        xPath.navigateToMyInfo();
    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void login(){
        WebElement userName=driver.findElement(By.xpath("//input[@*='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@*='button']"));
        loginBtn.click();
    }
    void navigateToMyInfo() throws InterruptedException {
        driver.findElement(By.xpath("//b[text()='My Info']")).click();
        driver.findElement(By.xpath("//*[@id='btnSave']")).click();
       // driver.findElement(By.id("btnSave")).click();

        WebElement firstName= driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']"));
        firstName.clear();
        firstName.sendKeys("Akash");
        Thread.sleep(5000);

        WebElement fstName =driver.findElement(By.xpath("//*[@*='personal_txtEmpFirstName']"));
        fstName.clear();
        fstName.sendKeys("Adarsh");





        WebElement dateOfBirth=driver.findElement(By.id("personal_DOB"));
        dateOfBirth.clear();
        Select select= new Select(dateOfBirth);
        //select.selectByVisibleText("15");
        select.selectByVisibleText("Mar");
        select.selectByValue("3");
        //dateOfBirth.sendKeys(By.xpath("//a[text()='14']"));
        driver.findElement(By.xpath("//a[text()='14']")).click();

    }
}
