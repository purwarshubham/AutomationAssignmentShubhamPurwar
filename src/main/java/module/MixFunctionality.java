package module;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utility.*;

import java.util.Set;

public class MixFunctionality {

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
    public void OpenNewTabWithSameLink() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) dr;

        js.executeScript(("window.open('Constant_SignInPade.URL','_blank');"));

        dr = (WebDriver) js;


        Set<String> tab_handles = dr.getWindowHandles();
        int number_of_tabs = tab_handles.size();

        System.out.println(number_of_tabs);

        int new_tab_index = number_of_tabs-1;
        System.out.println(new_tab_index);

        System.out.println(dr.switchTo().window(tab_handles.toArray()[new_tab_index].toString()));

        System.out.println(dr.getCurrentUrl());

        if(dr.getCurrentUrl().equals(Constant_DashBoardPage.DashBoardLink)){
            System.out.println("User is automatically logged in");
        }
        else{
            System.out.println("LogIn is required");
        }




    }

}
