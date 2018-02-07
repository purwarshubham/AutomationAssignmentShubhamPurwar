package mailapi;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class Mailer {

    public static void send(String from, String password, String to, String sub, String msg,String file){

        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });



        try{
            Message message = new MimeMessage(session);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));

            message.setSubject(sub);

            MimeBodyPart msgBodyPart1 = new MimeBodyPart();
            msgBodyPart1.setText(msg);

            MimeBodyPart msgBodyPart2 = new MimeBodyPart();
            msgBodyPart2.setDataHandler(new DataHandler(new FileDataSource(file)));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(msgBodyPart1);
            multipart.addBodyPart(msgBodyPart2);

            message.setContent(multipart);

            message.setContent(multipart);

            Transport.send(message);


            System.out.println("message sent successfullt");
        } catch (AddressException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }

    }
}
