package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpath {
    public  WebDriver driver;

    public static void main(String[] args) {
        LoginXpath loginXpath= new LoginXpath();
        loginXpath.launchBrowser();
        loginXpath.login();
        loginXpath.navigateToMyInfo();
    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void login(){
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.xpath("//div[text()='Password']"));
        password.sendKeys("admin123");
        WebElement loginButton= driver.findElement(By.name("Submit"));
        loginButton.click();

    }
    void navigateToMyInfo(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();

        WebElement userName= driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
        userName.clear();
        userName.sendKeys("Akash");
        WebElement middleName=driver.findElement(By.xpath("//input[@id='personal[txtEmpMiddleName']"));
        middleName.sendKeys("Jadav");

    }
}
