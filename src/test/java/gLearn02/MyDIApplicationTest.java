package gLearn02;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyDIApplicationTest {

    private MessageServiceInjector injector;

    @Before
    public void setUp() throws Exception {
        //mock the injector with anonymous class
        injector = new MessageServiceInjector() {

            public Consumer getConsumer() {

                //mock the message service
                return new MyDIApplication(new MessageService() {

                    public void sendMessage(String msg, String rec) {

                        System.out.println("Mock Message Service implementation");

                    }

                });


            }


        };


    }


    @Test
    public void testProcessMessages() throws Exception {
        Consumer consumer = injector.getConsumer();
        consumer.processMessages("caonima", "llll@cim.com");

    }

    @After
    public void tearDown() throws Exception {
        injector = null;

    }
}