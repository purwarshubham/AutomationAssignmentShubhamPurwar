package utility;

import PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;

public class Login_With_ValidCredentials {

    public static void Valid_Credentials_Login(WebDriver dr) throws Exception {
        Log.info("Passing correct username");
        SignInPage.UserNameTextBox(dr).sendKeys("test1037hquser51@evivehealth.com");
        Log.info("Passing correct password");
        SignInPage.PasswordTextBox(dr).sendKeys("evivetest");
        System.out.println("Login Button is enabled : " + SignInPage.LoginButton(dr).isEnabled());
        Log.info("Clicking on Login Button");
        SignInPage.LoginButton(dr).click();
    }
}
