package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class FacebookService implements MessageService{
    public boolean sendMessage(String msg, String rec) {
        //some complex code to send Facebook message
        System.out.println("Message sent to Facebook user " + rec + "with message=" + msg);
        return false;
    }
}
