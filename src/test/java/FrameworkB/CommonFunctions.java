package FrameworkB;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonFunctions {
    public  static  WebDriver driver;
    public  void sendKeys(WebElement element,String data){
        element.clear();
        element.sendKeys(data);

    }
    public void actionSendKeys(WebElement element, String data){
        Actions actions=new Actions(driver);
        actions.sendKeys(element,data);
    }
    public  void javaScriptSendKeys(WebElement element, String data){
        JavascriptExecutor executor=(JavascriptExecutor) driver;
        executor.executeScript("arguments[0].value='"+data+"';",element);
    }
    public  void selectDropDown(WebElement element,String visibleText){
        Select select= new Select(element);
        select.selectByVisibleText(visibleText);

    }
    public void acceptAlert(){
        Alert alert= driver.switchTo().alert();
        alert.accept();
    }
    public void waitForElement(){

    }
    public void  waitAndClick(WebElement element){

    }


}
