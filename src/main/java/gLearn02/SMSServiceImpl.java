package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class SMSServiceImpl implements MessageService{
    public boolean sendMessage(String msg, String rec) {
        System.out.println("短信发送给" + rec + "内容是：" + msg);
        return true;
    }
}
/**
 * 生命了一个服务接口，和两个服务实现类。。接下来要生命一个消费者。。但是消费者也是消费的多样化
 */
