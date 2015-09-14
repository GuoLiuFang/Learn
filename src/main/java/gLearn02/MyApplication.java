package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyApplication {
    private EmailService emailService = null;

    /**
     * 版本2.0把变量移到构造函数中去
     * @param emailService
     */
    public MyApplication(EmailService emailService) {
        this.emailService = emailService;
    }

    public void processMessages(String msg, String rec){
        /**
         * do some msg validation, manipulation logic
         */
        this.emailService.sendEmail(msg,rec);
    }

}
