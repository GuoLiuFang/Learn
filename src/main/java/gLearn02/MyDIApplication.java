package gLearn02;

/**
 * Created by LiuFangGuo on 9/14/15.
 */
public class MyDIApplication implements Consumer {
    private MessageService messageService;

    public MyDIApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessages(String msg, String rec) {
        // do some msg validation, manipulation logic etc
        this.messageService.sendMessage(msg,rec);
    }
}
/**
 * Notice that our application class is just using the service. It does not initialize the service that leads to better
 * Now we are readby to write injector classes that will initialize the service and also consumer classes.....
 */
