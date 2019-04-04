package fw.observer;

/**
 * 问题类
 * @Auther: Administrator
 * @Date: 2019/4/4 18:41
 * @Description:
 */
public class Question {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String username;

    private String context;
}
