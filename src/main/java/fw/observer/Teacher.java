package fw.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 18:47
 * @Description:
 */
public class Teacher {

    public Teacher(GuavaQSer guavaQSer, String name) {
        this.guavaQSer = guavaQSer;
        this.name = name;
    }

    private GuavaQSer guavaQSer;
    private String name;

    @Subscribe
    public void update(Object arg) {
        Question question = (Question) arg;

        System.out.println(this.name + "您好,您收到一个问题\n来自" + this.guavaQSer.getName() + ",提问者是:" + question.getUsername() + ",问题内容是：" + question.getContext());
    }
}
