package Guidly;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {
    public  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        Login login= new Login();
        login.launchBrowser();
        login.login();
        login.navigteToMyinfo();
        login.navigateToRecruit();

    }
    void launchBrowser(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
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
    void navigteToMyinfo() throws InterruptedException {
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        WebElement firstName=driver.findElement(By.name("personal[txtEmpFirstName]"));
        firstName.clear();
        firstName.sendKeys("Akash");
        WebElement middleName=driver.findElement(By.name("personal[txtEmpMiddleName]"));
        middleName.clear();
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
        driver.findElements(By.id("btnSave"));

        WebElement natioalityDropdown= driver.findElement(By.id("personal_cmbNation"));
        Select select=new Select(natioalityDropdown);
        select.selectByVisibleText("Algerian");
        Thread.sleep(3000);
        select.selectByValue("15");
        Thread.sleep(3000);
        select.selectByIndex(19);

        WebElement dateOfBirth= driver.findElement(By.name("personal[DOB]"));
        dateOfBirth.clear();
        dateOfBirth.click();
        //dateOfBirth.findElement(By.className("        dateOfBirth.findElement(By.className(\"\"))\n"));
        //dateOfBirth.sendKeys("15");
        Select select1= new Select(dateOfBirth);
        select1.selectByVisibleText("15");
        select1.selectByVisibleText("Jul");
        select1.selectByValue("1996");

        WebElement maritalStatus=driver.findElement(By.id("personal[cmbMarital]"));
        Select select2=new Select(maritalStatus);
        select2.selectByValue("Single");
        Thread.sleep(5000);
        select2.selectByVisibleText("Other");
        Thread.sleep(4000);





    }
    void navigateToRecruit(){
        driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
        WebElement candName =driver.findElement(By.id("candidateSearch_candidateName"));
        candName.sendKeys("Akash M");
        WebElement keywords= driver.findElement(By.name("candidateSearch[keywords]"));
        keywords.sendKeys("production");
    }

}
