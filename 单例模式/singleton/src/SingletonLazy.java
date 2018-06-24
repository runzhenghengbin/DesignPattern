/**
 * 单例模式 懒汉模式
 * @Auther: curry
 * @Date: 2018/6/23 07:52
 * @Description:
 */
public class SingletonLazy {

    private SingletonLazy (){};

    private static SingletonLazy instance ;

    public static  SingletonLazy getInstance(){

        if (instance  == null){
            instance = new SingletonLazy();
        }

        return instance;
    }
}
