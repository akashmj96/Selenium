package FrameWorkA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageClass extends BaseClass {
    static  void  login() throws InterruptedException {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(5000);

    }
    static void navigateToMyInfo(){
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
    }
    static  void personalDetails() throws InterruptedException {
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(5000);
        WebElement firstName=driver.findElement(By.name("personal[txtEmpFirstName]"));
        firstName.clear();
        firstName.sendKeys("Testing");
        WebElement middleName=driver.findElement(By.name("personal[txtEmpMiddleName]"));
        middleName.clear();
        middleName.sendKeys(" java");
        WebElement lastName= driver.findElement(By.id("personal_txtEmpLastName"));
        lastName.clear();
        lastName.sendKeys("M J");
        Thread.sleep(5000);

        WebElement natioalityDropdown= driver.findElement(By.id("personal_cmbNation"));
        Select select=new Select(natioalityDropdown);
        select.selectByVisibleText("Algerian");
    }
}
