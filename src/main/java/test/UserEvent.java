package test;

import org.springframework.context.ApplicationEvent;

public class UserEvent extends ApplicationEvent {
    private BaseBean baseBean;
 
    /**
     * 重写构造函数
     * @param source 发生事件的对象
     */
    public UserEvent(Object source, BaseBean baseBean) {
        super(source);
        this.baseBean = baseBean;
    }
 
    public BaseBean getBaseBean() {
        return baseBean;
    }
 
    public void setBaseBean(BaseBean baseBean) {
        this.baseBean = baseBean;
    }
}
