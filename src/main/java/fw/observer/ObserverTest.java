package fw.observer;

import com.google.common.eventbus.EventBus;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 18:52
 * @Description:
 */
public class ObserverTest {

    public static void main(String[] args) {

        EventBus bus=new EventBus("咕泡社区");
        GuavaQSer guavaQSer=new GuavaQSer();

        Teacher tom=new Teacher(guavaQSer,"Tom");
        Teacher mic=new Teacher(guavaQSer,"Mic");

        Question question=new Question();
        question.setUsername("张三");
        question.setContext("装饰器模式和适配器模式有什么区别?");

//        bus.register(tom);
//        bus.register(mic);
        bus.register(guavaQSer);
        bus.post(question);

    }
}
