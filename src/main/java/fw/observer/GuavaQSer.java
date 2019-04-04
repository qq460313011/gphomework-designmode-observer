package fw.observer;

import com.google.common.eventbus.Subscribe;

/**
 * @Auther: Administrator
 * @Date: 2019/4/4 18:43
 * @Description:
 */
public class GuavaQSer {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name="咕泡社区";


    @Subscribe
    public void pubilshQuestion(Question question){
        System.out.println(question.getUsername()+"在社区发布了问题，内容是："+question.getContext());
    }

}
