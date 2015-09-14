package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 * Let's say we have an application where we consume EmailService to send emails.
 */
public class EmailService {
    public void sendEmail(String message, String receiver) {
        System.out.println("Email sent to " + receiver + "with Message=" + message );
    }
}
