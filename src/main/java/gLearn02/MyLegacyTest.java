package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyLegacyTest {
    /**
     * Client(consume application) Application(consume service) EmailService
     * @param args
     */
    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        myApplication.processMessages("","");
    }
}
