package gLearn02;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class ClientApplication {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new AppInjector());
        MyApplication application = injector.getInstance(MyApplication.class);
        application.processMessages("buhuiqunide", "yiyoushierjiubalaoziwangle");
    }
}
