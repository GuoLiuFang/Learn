package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyMessageDITest {
    /**
     * 这是client(consume application)....application(consume service)
     * @param args
     */
    public static void main(String[] args) {
        String msg = "ni hao";
        String email = "xxx@yyy.com";
        String phone = "zzzzzz";
        MessageServiceInjector injector = null;
        Consumer app = null;
        //send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);
        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

    }
    /**
     * As you can see that our application classes are responsible only for using the service.
     * 消费者只负责使用，并不负责制造这个东西。。
     */
}
