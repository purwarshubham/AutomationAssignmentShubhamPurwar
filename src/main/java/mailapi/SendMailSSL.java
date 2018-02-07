package mailapi;

import org.testng.annotations.AfterSuite;

import java.util.Properties;

public class SendMailSSL {

    @AfterSuite
    public void generateReport() {

        Mailer.send("shubham.purwar@evivehealth.com","$Hubham1","shubham.purwar@evivehealth.com","Subject","Hi team , Please find below attachment ","/Users/shubhampurwar/Assignment1/src/main/Reports/emailable-report.html");
    }


}
