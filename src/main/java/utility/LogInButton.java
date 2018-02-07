package utility;

import PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;

public class LogInButton {

    public static void LogInButtonStatus(WebDriver dr) throws Exception {
        System.out.println("Login Button is enabled : " + SignInPage.LoginButton(dr).isEnabled());
        Log.info("Clicking on Login Button");
        SignInPage.LoginButton(dr).click();
        Log.info("Clicked on Login Button");
    }
}
