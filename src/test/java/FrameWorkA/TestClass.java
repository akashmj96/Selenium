package FrameWorkA;

public class TestClass {
    public static void main(String[] args) throws InterruptedException {
        PageClass.launchBrowser();
        PageClass.login();
        PageClass.navigateToMyInfo();
        PageClass.personalDetails();
    }
}
