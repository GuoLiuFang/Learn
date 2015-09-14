package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class SMSServiceInjector implements MessageServiceInjector{

    public Consumer getConsumer() {

        MyDIApplication application = new MyDIApplication();
        application.setMessageService(new SMSServiceImpl());
        return application;
    }
}
