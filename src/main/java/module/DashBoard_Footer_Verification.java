package module;

import PageObjects.DashBoardPage_Footer;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.*;

public class DashBoard_Footer_Verification {

public static WebDriver dr ;

@BeforeMethod
    public void LaunchApplication() throws Exception {
    Log.logConfig();
    Log.info("Launching Application");
    dr = Utills.launchApplication(Constant_SignInPage.URL);
    System.out.println("Application Launched");

    Login_With_ValidCredentials.Valid_Credentials_Login(dr);
}

@Test
    public void VerifyDashBoardFooterText(){
    WebElement found=DashBoardPage_Footer.footerText(dr);
    if(null==found){
        Log.error("Element not found aborting tests");
    }
    Log.info("Verifying Footer text of DashBoard");
    Assert.assertEquals(Constant_DashBoardPage.footerText,DashBoardPage_Footer.footerText(dr).getText());
    Log.info("DashBoard Footer text verified");


}


@Test
    public  void VerifyDashBoardPrivacyLink(){
    Log.info("Verifying Privacy Link text");
   Assert.assertEquals(Constant_DashBoardPage.PrivacyPolicy_linktxt,DashBoardPage_Footer.Privacy_Policy_link(dr).getText());
    Log.info("Verified Privacy Link Text");


    Log.info("Verifying whether Privacy Policy link is enable");
    System.out.println(DashBoardPage_Footer.Privacy_Policy_link(dr).isEnabled());
    Log.info("Checked ,Privacy Policy link enabled or not ");

    Log.info("Click on the Privacy Policy Link");
    DashBoardPage_Footer.Privacy_Policy_link(dr).click();
    Log.info("Clicked on Privacy Policy Link");

    Log.info("Verify Privacy Policy PopUp is displaying ");
    System.out.println("Privacy Policy is getting dispalyed : " + DashBoardPage_Footer.Privacy_Policy_popup(dr).isDisplayed());
    Log.info("Verified Privacy Policy popup is displaying or not");

}


    @Test
    public  void VerifyDashBoardTermAndConditionLink(){
        Log.info("Verifying Term And Condition Link text");
        Assert.assertEquals(Constant_DashBoardPage.Term_Condition_linktxt,DashBoardPage_Footer.Terms_and_Conditions_link(dr).getText());
        Log.info("Verified Verifying Term And Condition link Text");


        Log.info("Verifying whether Verifying Term And Condition link is enable");
        System.out.println(DashBoardPage_Footer.Terms_and_Conditions_link(dr).isEnabled());
        Log.info("Checked ,Term And Condition link ");

        Log.info("Click on Term And Condition link");
        DashBoardPage_Footer.Terms_and_Conditions_link(dr).click();
        Log.info("Clicked on Term And Condition  Link");

        Log.info("Verify Term And Condition  PopUp is displaying ");
        System.out.println("Privacy Policy is getting dispalyed : " + DashBoardPage_Footer.TermAndCondition_popup(dr).isDisplayed());
        Log.info("Verified Term And Condition is displaying or not");

}



    @AfterMethod
    public void CloseBrowser(){
    Utills.closeBrowser(dr);
    }




}
