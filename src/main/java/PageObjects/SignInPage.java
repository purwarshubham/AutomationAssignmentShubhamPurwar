package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Log;

public class SignInPage {

    public static WebElement ele = null ;

    public static String title(WebDriver dr){

       return dr.getTitle() ;

    }

    public static WebElement EviveLogo(WebDriver dr) throws Exception {
        try {
            WebElement ele = dr.findElement(By.xpath("//img[contains(@class,'evive-logo')]"));
            return ele;
            }catch (Exception e){
            Log.error("Evive logo is not found");
            throw(e);
        }

    }

    public static WebElement UserNameLabel(WebDriver dr) throws Exception {
        try {
            WebElement ele = dr.findElement(By.xpath("//label[@for='username']"));
            return ele;
        }catch (Exception e) {
            Log.error("Username Label Not Found");
        throw (e);
        }

    }


    public static WebElement ExtraLabelWithUserName(WebDriver dr) throws Exception {

        try {
            WebElement ele = dr.findElement(By.xpath("//span[contains(@class,'label-extra')]"));
            return ele;
        } catch (Exception e) {
            Log.error("label with Username : The email address you provided during registration NOT Found");
            throw (e);
        }
    }
    public static WebElement PasswordLabel(WebDriver dr) throws Exception {
        try {
            WebElement ele = dr.findElement(By.xpath("//label[@for='password']"));
            return ele;
        }catch (Exception e){
            Log.error("Password Label not found");
            throw (e);
        }
    }


    public static WebElement UserNameTextBox(WebDriver dr) throws Exception {
        try {

            WebElement ele = dr.findElement(By.name("username"));
            return ele ;
        }catch (Exception e)
        {
            Log.error("UserName text box not found");
            throw (e);
        }
        }

        public static WebElement PasswordTextBox(WebDriver dr) throws Exception {

        try {
            WebElement ele = dr.findElement(By.name("password"));
            return ele ;
        }catch (Exception e)
        {
            Log.error("Password text Box not found");
            throw (e);
        }

        }

        public static WebElement LoginButton(WebDriver dr) throws Exception {

        try {
            WebElement ele = dr.findElement(By.xpath("//button[@type='submit']"));
            return ele ;
        }catch (Exception e){
            Log.error("LogIn button Not found");
        throw (e);
        }

        }

        public static  WebElement ForgotPasswordLink(WebDriver dr) throws Exception {
        try {
            WebElement ele = dr.findElement(By.xpath("//a[contains(text(),'Forgot your password')]"));
            return ele ;
        }catch(Exception e){
            Log.error("Fogot Password Link not found");
            throw (e);
            }
        }


        public static WebElement mainContainerTopLine(WebDriver dr){
        try{
            WebElement ele = dr.findElement(By.xpath("//p[contains(@class,'text-content-line-top')]"));
            return ele ;
        }catch (Exception e){
            Log.error("Main container top top line not found");
            throw (e);
        }
        }


    public static WebElement mainContainerBottomLine(WebDriver dr){
        try{
            WebElement ele = dr.findElement(By.xpath("//p[contains(@class,'text-content-line-bottom')]"));
            return ele ;
        }catch (Exception e){
            Log.error("Main container top top line not found");
            throw (e);
        }
    }


    public static WebElement MessageForInvalidCredentials(WebDriver dr){
        try{
            WebElement ele = dr.findElement(By.xpath("//div[text()='Invalid username or password!']"));
            return ele ;
        }catch(Exception e){
            Log.error("Message for Invalid Credentials not found");
        throw (e);
        }
    }


    public static WebElement MessageForMandatroyUserName(WebDriver dr){
        try{
            WebElement ele = dr.findElement(By.xpath("//p[text()='You must enter an Email Address.']"));
            return ele ;
        }catch(Exception e){
            Log.error("Message for Blank User Name not found");
            throw (e);
        }
    }

    public static WebElement MessageForInvalidUserName(WebDriver dr){
        try{
            WebElement ele = dr.findElement(By.xpath("//p[text()='The email ID you entered is invalid. Please try again.']"));
            return  ele ;
        }catch(Exception e){
            Log.error("Message for Invalid Email Id not found");
            throw (e);
        }
    }




        }

