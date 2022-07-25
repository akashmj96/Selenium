package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropAndDown {
    public  WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        DropAndDown dropAndDown= new DropAndDown();
        dropAndDown.launchBrowser();
        dropAndDown.dropDownFun();
    }

    void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
    }
    void dropDownFun() throws InterruptedException {
        WebElement source= driver.findElement(By.id("box3"));
        WebElement target= driver.findElement(By.id("box104"));
       // Thread.sleep(5000);
        Actions actions= new Actions(driver);
        actions.dragAndDrop(source,target).perform();
        Thread.sleep(5000);

      WebElement source1= driver.findElement(By.id("box3"));
      WebElement target1= driver.findElement(By.id("capitals"));
      Actions actions1=new Actions(driver);
      actions1.dragAndDrop(source1,target1).build().perform();
      Thread.sleep(5000);


    }
}
