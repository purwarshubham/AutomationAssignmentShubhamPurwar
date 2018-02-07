package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class DashBoardPage_Footer {

    public static WebElement ele  ;


    public static WebElement footerText(WebDriver dr){

            if(dr.findElements(By.xpath("//div[@class='ev-footer__text']")).size()!=0) {
                ele = dr.findElements(By.xpath("//div[@class='ev-footer__text']")).get(0);
            }
            else {
            ele=null;
            }
        return ele ;
    }


    public static WebElement Privacy_Policy_link(WebDriver dr){
        try{
            ele = dr.findElement(By.xpath("//a[text()='Privacy Policy']"));
            return  ele ;
        }
        catch(Exception e){
            Log.error("Privacy Policy Link Not found");
            throw(e);
        }
    }

    public static WebElement Terms_and_Conditions_link(WebDriver dr){
        try{
            ele = dr.findElement(By.xpath("//a[text()='Terms and Conditions']"));
            return  ele ;
        }
        catch(Exception e){
            Log.error("Privacy Policy Link Not found");
            throw(e);
        }
    }

    public static WebElement Privacy_Policy_popup(WebDriver dr){
        try{
            ele = dr.findElement(By.xpath("//h3[text()=' Privacy Policy']"));
            return ele ;
        }
        catch(Exception e){
            Log.error("Privacy Policy PopUp not found");
            throw (e);
        }
    }

    public static WebElement TermAndCondition_popup(WebDriver dr){
        try{
            ele = dr.findElement(By.xpath("//h3[text()=' Terms and Conditions']"));
            return ele ;
        }
        catch(Exception e){
            Log.error("Privacy Policy PopUp not found");
            throw (e);
        }
    }

}
