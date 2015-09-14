package gLearn02;

import com.google.inject.AbstractModule;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class AppInjector extends AbstractModule {
    @Override
    protected void configure() {
        //bind the service to implementation class
        bind(MessageService.class).to(FacebookService.class);
    }
}
