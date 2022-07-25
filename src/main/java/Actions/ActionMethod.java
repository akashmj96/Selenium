package Actions;

import Launch.GetAttributes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionMethod {
    public WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ActionMethod actionMethod = new ActionMethod();
        actionMethod.launchBrowser();
        actionMethod.login();
        actionMethod.handleMouseHover();
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
    void handleMouseHover() throws InterruptedException {
        WebElement performance= driver.findElement(By.xpath("//*[@*='menu__Performance']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(performance).build().perform();
        Thread.sleep(5000);
        WebElement configure=driver.findElement(By.id("menu_performance_Configure"));
        actions.moveToElement(configure).perform();
        WebElement tracker=driver.findElement(By.id("menu_performance_addPerformanceTracker"));
        actions.click(tracker).perform();

        WebElement manageReviews= driver.findElement(By.id("menu_performance_ManageReviews"));
        actions.moveToElement(manageReviews).perform();
        WebElement reviewList= driver.findElement(By.xpath("//a[text()='Review List']"));
        actions.click(reviewList).perform();

        WebElement empName=driver.findElement(By.id("evaluatePerformanceReview360SearchForm_employeeName"));
        actions.sendKeys(empName,"Rahul");
        Thread.sleep(4000);

        WebElement myTrackers= driver.findElement(By.xpath("//a[text()='My Trackers']"));
        actions.moveToElement(myTrackers).perform();
        actions.click(myTrackers).perform();
        Thread.sleep(4000);

        WebElement empTrackers= driver.findElement(By.xpath("//a[text()='Employee Trackers']"));
        actions.moveToElement(empTrackers).perform();
        actions.click(empTrackers).perform();
    }



}
