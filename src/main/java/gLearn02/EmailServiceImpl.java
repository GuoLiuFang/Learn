package gLearn02;

import com.google.inject.Singleton;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
@Singleton
public class EmailServiceImpl implements MessageService {
    public boolean sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + "with Message=" + msg);
        return true;
    }
}
