package gLearn02;

import com.google.inject.Inject;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyApplication {
    private MessageService messageService = null;

//    /**
//     * 版本2.0把变量移到构造函数中去，但是总得有人把它初始化呀。。关键问题是把这个初始化放到什么地方合适。
//     * @param emailService
//     */
//    public MyApplication(EmailService emailService) {
//        this.emailService = emailService;
//    }

    @Inject
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * Since we are implementing dependency injection in our application, we won't initialize the service class in application
     * Google Guice support both setter-based and constructor-based dependency injection. Our application class that consumes the service looks like below
     * @param msg
     * @param rec
     */


    public void processMessages(String msg, String rec) {
        /**
         * do some msg validation, manipulation logic
         */
        this.messageService.sendMessage(msg, rec);
    }

}
