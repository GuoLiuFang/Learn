package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyApplication {
    private EmailService emailService = new EmailService();
    public void processMessages(String msg, String rec){
        /**
         * do some msg validation, manipulation logic
         */
        this.emailService.sendEmail(msg,rec);
    }

}
