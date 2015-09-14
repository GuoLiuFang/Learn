package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class EmailServiceInjector implements MessageServiceInjector{
    public Consumer getConsumer() {
        MyDIApplication application = new MyDIApplication();
        application.setMessageService(new EmailServiceImpl());
        return application;
    }



}
/**
 *现在看，这个injector是把服务和消费者都联系起来了。。
 *Whether to use Constructor based dependency injection or setter based is a design decision and depends on your requirements.
 * For example, if my application can't work at all without the service class then I would prefer constructor based DI or
 * else I would for setter method based DI to use it only when it's really needed.
 *
 */
