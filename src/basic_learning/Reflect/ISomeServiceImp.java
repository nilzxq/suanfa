package basic_learning.Reflect;

/**
 * @Author nilzxq
 * @Date 2020-07-02 9:43
 */
public class ISomeServiceImp implements ISomeService{

    @Override
    public String Litigate() {
        return "自己打官司，输了";
    }

    @Override
    public String eat() {
        return "自己吃饭";
    }
}
