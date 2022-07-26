package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DateDynamic {
    public WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        DateDynamic dateDynamic=new DateDynamic();
        dateDynamic.launchBrowser();
        dateDynamic.login();
        dateDynamic.selectDate("23","Jun", "2000");

    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void  login(){
        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginBtn= driver.findElement(By.id("btnLogin"));
        loginBtn.click();
    }
    void selectDate(String dayData,String monthData,String yearData) throws InterruptedException {
        try {

            driver.findElement(By.id("menu_pim_viewMyDetails")).click();
            driver.findElement(By.id("btnSave")).click();
            WebElement dateOfBirth = driver.findElement(By.id("personal_DOB"));
            dateOfBirth.click();
            dateOfBirth.clear();
            WebElement month = driver.findElement(By.className("ui-datepicker-month"));
            selectDropDown(month, monthData);
            Thread.sleep(3000);
            WebElement year = driver.findElement(By.className("ui-datepicker-year"));
            selectDropDown(year,yearData);

            WebElement day = driver.findElement(By.xpath("//a[contains(@class,'ui-state-default') and text()='" + dayData + "']"));
            System.out.println("//a[contains(@class,'ui-state-default')and text()='" + dayData + "']");
            day.click();
        }catch (StaleElementReferenceException e){
            e.printStackTrace();
        }

    }
    void  selectDropDown(WebElement element,String visibleText){
        Select select=new Select(element);
        select.selectByVisibleText(visibleText);
    }

}
