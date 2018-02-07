package module;

import PageObjects.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.*;

public class LogInFunctionality {

    public static WebDriver dr ;

    @BeforeMethod
    public void LaunchApplication() throws InterruptedException {
        Log.logConfig();
        dr =  Utills.launchApplication(Constant_SignInPage.URL);
    }

    @Test
    public void LoginButtonDisabledCase() throws Exception {

        Log.info("Checking First Scenario When user name is blank and Password is given");
        Log.info("Username field is blank username");
        SignInPage.UserNameTextBox(dr).sendKeys("");
        Log.info("Password is given");
        SignInPage.PasswordTextBox(dr).sendKeys("123445");
        System.out.println("Login Button is enabled : " + SignInPage.LoginButton(dr).isEnabled());



        }


        @Test
        public void ValidLoginCredentials() throws Exception {
            Log.info("Check for scenario when username and password both vaild");
            Login_With_ValidCredentials.Valid_Credentials_Login(dr);
            Assert.assertEquals(Constant_DashBoardPage.DashBoardLink,dr.getCurrentUrl());
            Log.info("Login Successful");

        }

        @Test
        public void InvalidLoginCredentials() throws Exception {

        Log.info("Check Scenario for Invaild Credentials Scenario");
        SignInPage.UserNameTextBox(dr).sendKeys("ta@evivehealth.com");
        SignInPage.PasswordTextBox(dr).sendKeys("evivete");
        LogInButton.LogInButtonStatus(dr);
        Assert.assertEquals(Constant_SignInPage.PasswordAndErrorLink,dr.getCurrentUrl());
        Log.info("UnSuccessfulLogin Verified");

    }

    @Test
    public void MessageforInvalidCredentials() throws Exception {

        Log.info("Verify Message for Invalid Credentials");
        SignInPage.UserNameTextBox(dr).sendKeys("tasda@evivehealth.com");
        SignInPage.PasswordTextBox(dr).sendKeys("evivet");
        LogInButton.LogInButtonStatus(dr);
        Assert.assertEquals(Constant_SignInPage.MessageforInvalidCredentials,SignInPage.MessageForInvalidCredentials(dr).getText());
        Log.info("Message for Invalid Credentials Checked");

    }

    @Test
    public void MessageForBlankEmailId() throws Exception {
        Log.info("Verify Message for Blank UserName");
        SignInPage.UserNameTextBox(dr).sendKeys("asd@gmail.com");
        SignInPage.PasswordTextBox(dr).sendKeys("231");
         SignInPage.UserNameTextBox(dr).clear();
         Thread.sleep(1000);
        Assert.assertEquals(Constant_SignInPage.MessageforBlankUserName,SignInPage.MessageForMandatroyUserName(dr).getText());
        Log.info("Message for Blank User name verified");

    }

    @Test
    public void MessageforInvalidUserName() throws Exception {
        Log.info("Verify Message for Invalid User Name");
        SignInPage.UserNameTextBox(dr).sendKeys("asd");
        Assert.assertEquals(Constant_SignInPage.MessageforInvalidUserName,SignInPage.MessageForInvalidUserName(dr).getText());
        Log.info("Message for Invalid User Name Verified");
        }

        @AfterMethod
        public void CloseBrowser()
        {
            Utills.closeBrowser(dr);
        }




}
