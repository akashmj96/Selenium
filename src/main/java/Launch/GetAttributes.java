package Launch;

import Guidly.XPath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributes {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        GetAttributes getAttributes = new GetAttributes();
        getAttributes.launchBrowser();
        getAttributes.login();
        getAttributes.navigateToMyInfo();
    }

    void launchBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       // driver.manage().window().maximize();
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

    void navigateToMyInfo() throws InterruptedException {
        driver.findElement(By.xpath("//b[text()='My Info']")).click();
        driver.findElement(By.xpath("//*[@id='btnSave']")).click();
        // driver.findElement(By.id("btnSave")).click();

        WebElement firstName = driver.findElement(By.xpath("//*[@id='personal_txtEmpFirstName']"));
        firstName.clear();
        firstName.sendKeys("Akash");
        Thread.sleep(5000);

        WebElement driverLicence= driver.findElement(By.xpath("//*[@*='personal_txtLicenNo']"));
        String licence =driverLicence.getText();
        System.out.println(licence);

        WebElement employeeID= driver.findElement(By.xpath("//label[text()='Employee Id']"));
        String id=employeeID.getAttribute("value");
        System.out.println(id);
        WebElement sinNo=driver.findElement(By.xpath("//label[text()='SIN Number']"));
        String sin=sinNo.getAttribute("value");
        System.out.println(sin);
        WebElement empId=driver.findElement(By.id("personal_txtEmployeeId"));
        String id1=empId.getText();
        System.out.println("get text:"+id1);
        String id2=empId.getAttribute("value");
        System.out.println("get value :"+id2);

        //WebElement ssNum=driver.findElement(By.xpath("//label[contains(text(),'SSN')]"));
        //ssNum.sendKeys("377972");

        WebElement sNum=driver.findElement(By.id("personal_txtNICNo"));
        sNum.sendKeys("67989");

        WebElement middleName= driver.findElement(By.xpath("//div[contains(text(),'Middle')]"));
        String name=middleName.getText();
        System.out.println("middle name text "+name);





    }
}

