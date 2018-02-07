package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Utills {

    public static WebDriver dr = null ;

    public static WebDriver launchApplication(String url) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","//Users//shubhampurwar//Desktop//Documents//chromedriver");

        WebDriver dr = new ChromeDriver();

        dr.manage().window().maximize();

        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        dr.get(Constant_SignInPage.URL);

        Thread.sleep(3000);

        return  dr ;

    }


    public static void closeBrowser(WebDriver dr){

        dr.close();

    }



}
