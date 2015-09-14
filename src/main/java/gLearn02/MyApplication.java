package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyApplication {
    private EmailService emailService = null;

    /**
     * 版本2.0把变量移到构造函数中去，但是总得有人把它初始化呀。。关键问题是把这个初始化放到什么地方合适。
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
