package Assignment1;


import PageObjects.SignInPage;
import module.VerifySignInPageLocator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utility.Constant_SignInPage;
import utility.Log;
import utility.Utills;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) throws Exception

    {

        try {
            Log.logConfig();

        }catch (Exception ob)
        {
            System.out.println("Check log property file");
        }
        Log.info("Launching the application");

        WebDriver dr = Utills.launchApplication(Constant_SignInPage.URL);

        System.out.println(dr);

        Log.info("Application launched successfully");

        Thread.sleep(10000);


     /*   System.out.println(SignInPage.PasswordLabel(dr).getText());

        WebElement element = SignInPage.PasswordLabel(dr);
        System.out.println(element.getText());
*/
        System.out.println(SignInPage.ExtraLabelWithUserName(dr).getText());

//      System.out.println(Constant.passwordlabel.equals(str));

//        Log.info("Password label is checked ");












    }


}
