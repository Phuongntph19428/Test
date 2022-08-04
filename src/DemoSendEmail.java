
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author ppolo
 */
public class DemoSendEmail {

    public static void main(String[] args) {
        try {
            final String username = "phuongntph19428@gmail.com";
            final String password = "bjjvnnyrvqqcojfr";
            
            Properties prop = new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");
            prop.put("mail.smtp.starttls.enable", "true");
            prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
            prop.put("mail.smtp.auth", "true");
//            prop.put("mail.smtp.ssl.trust", "smtp.gmail.com");
            
            Session session = Session.getInstance(prop, new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(username, password);
                }
            });
            
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("phuongntph19428@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ppoloh3@gmail.com"));
            
            
            message.setSubject("Test send mail");
            message.setText("This is test send email");
            
            Transport.send(message);
            
            System.out.println("Done");
            
        } catch (AddressException ex) {
            Logger.getLogger(DemoSendEmail.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(DemoSendEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
