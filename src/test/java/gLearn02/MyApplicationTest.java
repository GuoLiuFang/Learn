package gLearn02;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import static org.junit.Assert.*;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyApplicationTest {
    private Injector injector;

    @Before
    public void setUp() throws Exception {
        injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                bind(MessageService.class).to(MockMessageService.class);
            }
        });
    }
    @Test
    public void test() {
        MyApplication appTest = injector.getInstance(MyApplication.class);
        org.junit.Assert.assertEquals(false,appTest.processMessages("caonima", "xionghuai"));
    }


    @After
    public void tearDown() throws Exception {
        injector = null;
    }
}