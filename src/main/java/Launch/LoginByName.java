package Launch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByName {
    public WebDriver driver;
    public static void main(String[] args) {
        LoginByName loginByName= new LoginByName();
        loginByName.launchBrowser();
        loginByName.login();
        loginByName.navigteToMyinfo();

    }
    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    void login(){
        WebElement userName= driver.findElement(By.name("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("txtPassword"));
        password.sendKeys("admin123");
        WebElement loginButton= driver.findElement(By.name("Submit"));
        loginButton.click();

    }
    void navigteToMyinfo(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        WebElement firstName=driver.findElement(By.name("personal[txtEmpFirstName]"));
        firstName.clear();
        firstName.sendKeys("Akash");
        WebElement middleName=driver.findElement(By.name("personal[txtEmpMiddleName]"));
        middleName.sendKeys("Jadhav");
        WebElement lastName= driver.findElement(By.id("personal_txtEmpLastName"));
        lastName.clear();
        lastName.sendKeys("M J");
        WebElement employeeId= driver.findElement(By.name("personal[txtEmployeeId]"));
        employeeId.clear();
        employeeId.sendKeys("4987");
        WebElement otherId= driver.findElement(By.name("personal[txtOtherID]"));
        otherId.clear();
        otherId.sendKeys("33");
        WebElement driversLicenceNum= driver.findElement(By.id("personal_txtLicenNo"));
        driversLicenceNum.clear();
        driversLicenceNum.sendKeys("KA17 9739");
        WebElement ssnNum=driver.findElement(By.name("personal[txtNICNo]"));
        ssnNum.sendKeys("4567");
        WebElement nickName =driver.findElement(By.id("personal_txtEmpNickName"));
        nickName.clear();
        nickName.sendKeys("Ricky");
        WebElement miliService= driver.findElement(By.id("personal_txtMilitarySer"));
        miliService.sendKeys("None");

    }
}
