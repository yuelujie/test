package test;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserBeanListener {
 
    /**
     * @param event 监听事件
     */
    @EventListener
    public void register(UserEvent event) {
    	System.out.println("1111111111111111111111 ");
        System.out.println("UserBeanListener: " + event.getBaseBean().getName());
    }
}
