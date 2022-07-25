package Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFrames {
    public WebDriver driver;
    public static void main(String[] args){
        AddFrames addFrames= new AddFrames();
        addFrames.lauchBrowser();
        addFrames.handleFrames();
        addFrames.nestedFrames();

    }
    void lauchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://demoqa.com/frames");
    }
    void handleFrames(){
       // WebDriverManager.chromedriver().setup();
        // driver=new ChromeDriver();
        //driver.get("https://demoqa.com/frames");
        WebElement frame= driver.findElement(By.xpath("//*[@id='frame1']"));
        driver.switchTo().frame(frame);
        String frm=driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(frm);
        driver.switchTo().defaultContent();
    }
     void nestedFrames(){
        driver.get("https://demoqa.com/nestedframes");
        WebElement parentFrame=driver.findElement(By.xpath("//*[text()='Nested Frames']"));
        driver.switchTo().frame(parentFrame);
       String parent= driver.findElement(By.id("frame1")).getText();
       System.out.println(parent);


     }
}
