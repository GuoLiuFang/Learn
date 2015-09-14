package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class EmailServiceInjector implements MessageServiceInjector{
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }

}
/**
 *现在看，这个injector是把服务和消费者都联系起来了。。
 *
 *
 */
