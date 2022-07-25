package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateSelection {
    public WebDriver driver;
    public static void main(String[] args) {
        DateSelection dateSelection=new DateSelection();
        dateSelection.launchBrowser();
        dateSelection.login();
        dateSelection.selectdate();
    }
    void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    void login() {
        WebElement userName = driver.findElement(By.xpath("//input[@*='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//*[@id='txtPassword']"));
        password.sendKeys("admin123");
        WebElement loginBtn = driver.findElement(By.xpath("//*[@*='button']"));
        loginBtn.click();
    }
    void  selectdate(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        WebElement dateOfBirth= driver.findElement(By.id("personal_DOB"));
        dateOfBirth.click();
        dateOfBirth.clear();
        WebElement year=driver.findElement(By.className("ui-datepicker-year"));
        Select select=new Select(year);
        //select.selectByVisibleText("Oct");
        select.selectByValue("2000");

        WebElement month=driver.findElement(By.className("ui-datepicker-month"));
        Select select1=new Select(month);
        select1.selectByVisibleText("Feb");

        WebElement date=driver.findElement(By.xpath("//a[text()='10']"));
        //date.sendKeys("//a[text()='10']");
        date.click();




    }
}
