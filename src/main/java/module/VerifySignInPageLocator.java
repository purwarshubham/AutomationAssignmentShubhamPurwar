package module;


import PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utility.Constant_SignInPage;
import utility.Log;
import utility.Utills;

import java.util.concurrent.TimeUnit;



public class VerifySignInPageLocator{

    public static WebDriver dr ;

    @BeforeClass
    public void LaunchApplication() throws InterruptedException {
        Log.logConfig();
       dr =  Utills.launchApplication(Constant_SignInPage.URL);
    }


    @Test(priority = 1)
    public void VerifyTitle() throws Exception {
       Assert.assertEquals(Constant_SignInPage.Title,SignInPage.title(dr));
        Log.info("Title is matching");
    }

    @Test(priority = 2)
    public void VerifyEvivelogo() throws Exception {
        System.out.println("Evive Logo is getting displayed : " + SignInPage.EviveLogo(dr).isDisplayed());
    Log.info("Evive Logo is displaying");
    }


    @Test(priority = 3)
    public void VerifyUserNamelabel() throws Exception {
    Assert.assertEquals(Constant_SignInPage.usernamelabel,SignInPage.UserNameLabel(dr).getText());
    Log.info("UserName Label checked");
    }

    @Test(priority = 4)
    public void VerifyPasswordLabel() throws Exception {
    Assert.assertEquals(Constant_SignInPage.passwordlabel,SignInPage.PasswordLabel(dr).getText());
    Log.info("Password Label checked");
    }

    @Test(priority = 5)
    public void VerifyUserNameTextBoxIsEnabled() throws Exception {
        System.out.println("UserName Text Box is enabled : " + SignInPage.UserNameTextBox(dr).isEnabled());
        Log.info("UserName Text box is Enabled or Not checked");
    }

    @Test(priority = 6)
    public void VerifyPasswordTextBoxIsEnabled() throws Exception {
        System.out.println("Password Text Box is enabled : " + SignInPage.PasswordTextBox(dr).isEnabled());
        Log.info("Password Text box is Enabled or Not checked");
    }

    @Test(priority = 7)
    public void VerifyForgotPasswordLink() throws Exception {
        Assert.assertEquals(Constant_SignInPage.ForgotLinkText,SignInPage.ForgotPasswordLink(dr).getText());
       Log.info("Forgot Password Link Text checked");
        System.out.println("Forgot Password Link is enabled : " + SignInPage.ForgotPasswordLink(dr).isEnabled());
        Log.info("Forgot Password link enable or not checked");
    }


    @Test(priority = 8)
    public void VerifyMainContainerTopLine() throws Exception{
        Assert.assertEquals(Constant_SignInPage.MainContainerTopLine,SignInPage.mainContainerTopLine(dr).getText());
        Log.info("Main Container Top line text checked");
    }

    @Test(priority = 9)
    public void VerifyMainContainerBottomLine() throws Exception{
        Assert.assertEquals(Constant_SignInPage.MainContainerBottomLine,SignInPage.mainContainerBottomLine(dr).getText());
        Log.info("Main Container Bottom line text checked");
    }


    @AfterClass
    public void closeBrowser(){
        Utills.closeBrowser(dr);
    }



}