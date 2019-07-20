package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class RegisterService {
 
    @Autowired
    private ApplicationContext applicationContext;
 
    public void register() {
        /*
         * 这里的UserA 和 UserB 都是BaseBean的子类
         */
    	System.out.println("222222222222222222 ");
        UserA a = new UserA();
        a.setName("a");
//        UserB b = new UserB();
//        b.setName("b");
        // 发布事件  UserEvent
        applicationContext.publishEvent(new UserEvent(this, a));
        System.out.println("333333333333333333 ");
        // 发布事件  UserEvent
//        applicationContext.publishEvent(new UserEvent(this, b));
    }
}
