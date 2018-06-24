/**
 * 单例模式饿汉模式
 * @Auther: curry
 * @Date: 2018/6/23 07:48
 * @Description:
 */
public class Singleton {

    //构造函数私有化
    private Singleton(){};

    private static Singleton instance = new Singleton();

    //通过公有的方法进行获得
    public  static Singleton getInstance(){
        return  instance;
    }
}
